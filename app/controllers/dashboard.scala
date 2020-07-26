package controllers

import javax.inject._
import collection.mutable

import play.api.mvc._
import play.api.i18n._
import play.api.data._
import play.api.data.Forms._
import javax.inject._
import anorm._ 
import anorm.{ Macro, RowParser }
import anorm.SqlParser._

import play.api.db.Database
import scala.concurrent.Future


import scala.language.postfixOps

class dashboard @Inject()(db: Database,cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc)  {
  
  def viewDashboard = Action{ implicit request =>
    val usernameOption = request.session.get("username")
      usernameOption.map{ username =>        
        db.withConnection { implicit connection => 
          println("Inside UserDashBoard")
          val valueName:List[String] ={ 
              SQL("select empname from usertable where empusername in ({inputUsername})").on("inputUsername"->username).as( str("empname") *)
            }
          val valueDept:List[String] ={ 
              SQL("select Empdept from usertable where empusername in ({inputUsername})").on("inputUsername"->username).as( str("Empdept") *)
            }
          val valueEmail:List[String] ={ 
              SQL("select Empemail from usertable where empusername in ({inputUsername})").on("inputUsername"->username).as( str("Empemail") *)
            }
          var argsMaps:Map[String,String] = Map(("username"->username),("name"->valueName.mkString("")),("dept"->valueDept.mkString("")),("email"->valueEmail.mkString("")))
          println(argsMaps)
          Ok(views.html.userDashboard(argsMaps));
        }
        
      }getOrElse(Redirect{routes.login.loginPage()})
  }
  
  def createPage = Action{ implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{ username => 
    println("Inside create Page")
    db.withConnection { implicit connection => 
       val r :List[String] = {
             SQL("select distinct dept from csvtable").as(get[String]("dept") *)
           }
       /*val bookname = username + "Book"
       val str = s"select EmpBook dept from usertable where EmpBook in ({bookname})"
       val empPageList : List[String] = SQL(str).on("bookname"->bookname).as(get[String]("EmpBook") *)
       val empPage = empPageList.head
       println(empPage)*/
       
       //var empPage : List[String] = SQL("select EmpPage dept from usertable").as(get[String]("EmpPage") *)
       //println(empPage.head)
       Ok(views.html.createUserPage(r))
      }
    }getOrElse(Redirect{routes.login.loginPage()})
    
  }
  
  def getPageData	= Action { implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{ username =>
       val postVals = request.body.asFormUrlEncoded
       postVals.map{ args =>
       val pageName = args("pageName").head
       val pageBody = args("pageBody").head
       val pageTargets = args("pageTarget")
       var pageTargetsString = "";
       for(l<-pageTargets){
         pageTargetsString = pageTargetsString + l + ";"
       }
       println(pageTargetsString)
       
       db.withConnection { implicit connection => 
         
         val empBookList : List[String] = SQL("select EmpBook dept from usertable where empusername in ({username})").on("username"->username).as(get[String]("EmpBook") *)
         val empBook = empBookList.head
         println(empBook)
         
         try{
           val str = s"CREATE TABLE $empBook (qsNo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,pageName VARCHAR(50), pageBody VARCHAR(255),pageTarget VARCHAR(255))" 
           val result = SQL(str).execute()
           println(result)
         }
         catch{
           case x: Throwable => println("Table already exists")
         }
         
         var str2 = s"insert into $empBook (pageName,pageBody,pageTarget) values({pageName},{pageBody},{pageTarget})"
         var result: Boolean = SQL(str2).on(
                  ("pageName",pageName), 
                  ("pageBody",pageBody),                
                  ("pageTarget",pageTargetsString)).execute()
         
         Ok("Done")
       }
      }.getOrElse(Ok("Something went wrong with postVals"))
    }getOrElse(Redirect{routes.login.loginPage()})
  }
  
  def viewPages = Action { implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{ username => 
      
      var userToBookMap = Map[String,List[(Int,String,String)]]()
      db.withConnection { implicit connection => 
        
        val listOfBooks = SQL("select empbook from usertable").as(get[String]("EmpBook") *)
        println(listOfBooks)
        
        
        
        for(bookName <- listOfBooks){
          try{
            
            var str = "select qsno,pageName,pageTarget from " + bookName
            var bookinfo : List[(Int,String,String)] = {SQL(str).as( get[Int]("qsno") ~ get[String]("pageName") ~ get[String]("pageTarget") map(flatten)*)}
            
            
            val bookOwnerName = (bookName.split("book"))(0) 
            userToBookMap+=(bookOwnerName -> bookinfo)
            
            
            
          }
          
          catch{
            case x: Throwable => println(bookName)
          }
          
        }
        println(userToBookMap)
       
      }
       Ok(views.html.viewPages(userToBookMap))
    }getOrElse(Redirect{routes.login.loginPage()})
  }
}
  

    
    
    
    
    
    
    
     
                
        