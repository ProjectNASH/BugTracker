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

import java.io.File
import java.io._
import java.nio.file.{Files, Paths}

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
          
          val qsnoString = SQL("select qsno from qsno").as(scalar[Long].single)         
          val qsno = (qsnoString.toInt);         
         
          
          
          var newAns = 0;
          val bookList = SQL(s"select empbook from usertable").as( str("empbook") *)
          for(book<-bookList){
            val bookAns = book + "ans"
            try{             
              val count = SQL(s"select count(distinct(qsno)) from $bookAns where working = 1;").as(scalar[Int].single)
              newAns = newAns + count;
              println(s"table exists for: $bookAns")
            }
            catch{
              case x: Throwable => println("table doesnt exists!!!")
            }
          }
          println(s"Answered : $newAns")
          val notans = qsno-newAns
          Ok(views.html.userDashboard(argsMaps,qsno,newAns,notans))
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
       var pageBody = args("pageBody").head 
       
       var pageTargetsString = "";
       try{
         val pageTargets = args("pageTarget") 
         for(l<-pageTargets){
           pageTargetsString = pageTargetsString + l + ";"
         }
       }
       catch{
         case x: Throwable =>
           db.withConnection { implicit connection => 
             val pageTargets = SQL("select dept from dept").as(get[String]("dept") *)            
             for(l<-pageTargets){
               pageTargetsString = pageTargetsString + l + ";"
             }
           }
       }
       
       println(pageTargetsString)
       
       db.withConnection { implicit connection => 
         
         val empBookList : List[String] = SQL("select EmpBook dept from usertable where empusername in ({username})").on("username"->username).as(get[String]("EmpBook") *)
         val empBook = empBookList.head
         println(empBook)
         
         try{
           val str = s"CREATE TABLE $empBook (qsNo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,pageName text, pageBody Text,pageTarget text,ans int default 0)" 
           val result = SQL(str).execute()
           println(result)
           val trigName = empBook +"Trig"
           val strTrig =s"create trigger $trigName after INSERT on $empBook for each row update qsno set qsno = qsno + 1;"
           val resultTrig = SQL(strTrig).execute() 
         }
         catch{
           case x: Throwable => println("Table already exists ",x)
         }
         
         var count : Long = 0
         try{
           count = (SQL(s"select Max(qsNo) from $empBook").as(scalar[Long].single)) + 1
         }
         catch{
           case x: Throwable => 
             println("Beginging")
             
         }
        
         /*val url = "C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/assets/attachedFilesQueries/"
         val FileName = url + s"$empBook" + s"$count" + s".txt"
         val pw = new PrintWriter(new File(FileName ))
         pw.write(pageBody)
         pw.close        
         
         
         pageBody = s"$empBook" + s"$count"*/
         
         var str2 = s"insert into $empBook (pageName,pageBody,pageTarget) values({pageName},{pageBody},{pageTarget})"
         var result: Boolean = SQL(str2).on(
                  ("pageName",pageName), 
                  ("pageBody",pageBody),                
                  ("pageTarget",pageTargetsString)).execute()
         
         Redirect{routes.dashboard.viewPages()}
       }
       
      
       
      }.getOrElse(Ok(views.html.errorPageThree(500,"Oops","Something went wrong. Automatic Redirect","5","/login")))
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
       Ok(views.html.viewPages(userToBookMap,"All","Ans"))
    }getOrElse(Redirect{routes.login.loginPage()})
  }
  
  def viewMyPages = Action { implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{ username => 
      
      var userToBookMap = Map[String,List[(Int,String,String)]]()
      db.withConnection { implicit connection => 
        
        val listOfBooks = SQL("select empbook from usertable where empusername in ({username})").on("username"->username).as(get[String]("EmpBook") *)
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
       Ok(views.html.viewPages(userToBookMap,"My","View Ans"))
    }getOrElse(Redirect{routes.login.loginPage()})
  }
  
  
  
  def changePassWordOne = Action{implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{ username => 
      Ok(views.html.changePasswordOne())      
    }getOrElse(Redirect{routes.login.loginPage()})
  }
  
  def changePasswordTwo = Action{implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{ username => 
      val postVals = request.body.asFormUrlEncoded
           postVals.map{ args => 
             val userPassword = (args("userpassword").head)
  
             db.withConnection { implicit connection =>
               val query = "select EmpPass from usertable where empusername in ({username})"
               val result = SQL(query).on(("username"->username)).as(get[String]("EmpPass") *)
               if(!result.isEmpty){
                 val dbPass1 = result.head
                 val decDBPass =  models.EncryterTool.decrypt(dbPass1)
                 if(decDBPass.equals(userPassword)){
                   Ok(views.html.changePassword())
                 }
                 else{
                   val title = "Password Error"
                   val head = "OOPS Passwords is Wrong!!!!"
                   val time = "10"
                   val body = s"Looks like the password you have entered is wrong!!! Please wait for 10s to try again (automatic redirect) "
                   val url = "/changePasswordByUser	"
                   val typeForm = "GET"
                   Ok(views.html.errorPage(time,title,head,body,url,typeForm))
                   
                 }
               }
               else{
                 Redirect{routes.login.loginPage()}
               }
             }
          
      
      }getOrElse(Redirect{routes.login.loginPage()})
    }getOrElse(Redirect{routes.login.loginPage()})
  }
}
  

    
    
    
    
    
    
    
     
                
        