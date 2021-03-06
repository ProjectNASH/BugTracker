package controllers

import javax.inject._

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



/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class login @Inject()(db: Database,cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {
  
  def loginPage = Action{ implicit request =>
    Ok(views.html.loginPage())
  }
  
  def loginValidate = Action{ implicit request =>
   val postVals = request.body.asFormUrlEncoded
   postVals.map{ args => 
      var username ="";
     //if you get Exception then you got Username
     // if you do not get Exception you get Email
     try{
       username = ((args("username").head).split("@"))(1)
       val email = (args("username").head)
       try{
         db.withConnection { implicit connection => 
             val usernameList : List[String] = {SQL("select EmpUserName from usertable where EmpEmail in ({inputEmail})").on("inputEmail"->email).as( str("EmpUserName") *) }
             username = usernameList.head
         }
       }
       catch{
         case x:Throwable => 
         println(x)
         val title = "SERVER OFFLINE"
         val head = "SERVER IS OFFLINE"
         val time = "10"
         val body = s"Looks like MySQL server is offline.\n Ask System Admin to start MySQL server. Redirecting to homepage"
         val url = "/"         
         Ok(views.html.errorPageTwo(time,title,head,body,url))
         //Ok("Mysql Server is not Running. Switch on MySQL server and reload Page.")
       }
     }
     catch{
       case x : Throwable=>
        username = ((args("username").head).split("@"))(0)
     }
     println(username)     
     //val username = args("username").head
     var password = args("password").head
     println("Login Before:" + password)
     //password = models.EncryterTool.encrypt(password)
     println("Working")
     println("Login After:" + password)
     
     try{
       db.withConnection { implicit connection =>  
         println("Inside db")
         val usernameList :List[String] = {
           SQL("select EmpUserName from usertable where EmpUserName in ({inputUsername})").on("inputUsername"->username).as( str("EmpUserName") *) 
         }
         println(usernameList)
         val passwordList:List[String] = {
          SQL("select EmpPass from usertable where EmpUserName in ({inputUsername})").on("inputUsername"->username).as( str("EmpPass")  *) 
         }       
         println(passwordList)
        if(!(usernameList.isEmpty)){
          //println("Username exsists")
          val usernamePasswordList = (usernameList zip passwordList).toMap    
          println(usernamePasswordList)
          if(models.MethodsForLogin.validateUser(usernamePasswordList, username, password)){
            println("Username valid")
            //Ok(views.html.userDashboard())
            Redirect{routes.dashboard.viewDashboard()}.withSession("username"->username);          
          }
          else{
             val title = "No User"
             val head = "No such user exists"
             val time = "7"
             val body = s"No such user exists. Check your email/username/password.Redirecting to login page"
             val url = "/"           
             Ok(views.html.errorPageTwo(time,title,head,body,url))
              //Ok("you have not entered the right password")
          }
        }
        else
        {
           val title = "No User"
           val head = "No such user exists"
           val time = "7"
           val body = s"No such user exists. Check your email/username/password.Redirecting to login page"
           val url = "/login"         
           Ok(views.html.errorPageTwo(time,title,head,body,url))
          //Ok("No such User exists!!")
          //Redirect{routes.login.loginPage()}
        }
       }
     }
     catch{
       case x:Throwable => 
         println(x)
         val title = "SERVER OFFLINE"
         val head = "SERVER IS OFFLINE"
         val time = "10"
         val body = s"Looks like MySQL server is offline.\n Ask System Admin to start MySQL server. Redirecting to homepage"
         val url = "/"         
         Ok(views.html.errorPageTwo(time,title,head,body,url))
         //Ok("Mysql Server is not Running. Switch on MySQL server and reload Page.")
     }
     
     
    }.getOrElse(Ok(views.html.errorPageThree(500,"Oops","Something went wrong. Automatic Redirect","5","/login")))
    
  }
  
  
  def logout = Action{ 
      Redirect(routes.HomeController.index).withNewSession    
   }
  
  
}