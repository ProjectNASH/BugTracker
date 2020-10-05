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


@Singleton
class signUp  @Inject()(db: Database,cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {
  
  def sendSignupSetupPage = Action { implicit request=>
    try{
      db.withConnection { implicit connection => 
       try{
         val str = s"select * from usertable";
         val result = SQL(str).execute();
         val title = "BT Database Exsits"
         val head = "OOPS Database alrady Exists"
         val time = "10"
         val body = s"Looks like a BugTracker Database has been already setup on this server.\n You will be redirected to login page in $time seconds "
         val url = "/login"         
         Ok(views.html.errorPageTwo(time,title,head,body,url))
         
       }
       catch{       
         case x: Throwable =>
           println("Looks like BugTracker has not been setup")
           Ok(views.html.signupPage())
       }
      }
    }
    catch{
      case x: Throwable =>
           println("Server Offline")
           val title = "MYSQL Server offline"
           val head = "MYSQL Server Offline"
           val time = "7"
           val body = s"Looks like your MySQL server is offline. Start your MySQL server. (For Windows: MYSQL80 service may be switched off) "
           val url = "/" 
           Ok(views.html.errorPageTwo(time,title,head,body,url))
    }
  }
  
  /*def sendSignupPage = Action { implicit request=>
    Ok(views.html.signupPage())
  }*/
  
  def getSignupInfo = Action{ implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map{ args => 
      val name = args("username").head
      val dept = args("dept").head
      val email = args("email").head
	    val username = ((args("email").head).split("@"))(0) 
	    println(username)
	    var password  = args("password").head
	    println("Sign up pass before " + password)
	    password = models.EncryterTool.encrypt(password)
	    println("Sign up pass after " + password)
	    
	    val empBook = username + "Book";
      
      db.withConnection { implicit connection =>  
         
        var flag = 1
        
        try{
           val createUserTable = s"CREATE TABLE UserTable (EmpUserId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,EmpUserName VARCHAR(50) UNIQUE,EmpName VARCHAR(50) NOT NULL,EmpDept VARCHAR(50) NOT NULL,EmpEmail VARCHAR(50) NOT NULL,EmpPass VARCHAR(255),EmpBook VARCHAR(50))"
           val result = SQL(createUserTable).execute()
           flag = 0 
        } catch{
           case x: Throwable =>
             println(x)
             flag = 1;
         }
        
        //Following checks if a user has entered an email of already existing email located in db.
         val isEmail_inDatabase: List[String] = SQL("select EmpEmail from Usertable where EmpEmail in ({email})").on("email"->email).as( str("EmpEmail") *) 
         
         
         if(isEmail_inDatabase.isEmpty){       
         //need to do a check if this user exists in Company Roll 
           
           
           
          var result: Boolean = SQL("insert into UserTable(EmpUserName,EmpName,EmpDept,EmpEmail,EmpPass,EmpBook) values({user_username},{user_name},{user_dept},{user_email},{user_password},{user_book})").on(
              ("user_username",username), 
              ("user_name",name),
               ("user_dept",dept),
               ("user_email",email),
               ("user_password",password),
               ("user_book",empBook)).execute()          
           //Ok("done")
           if(flag == 1){
             Ok(views.html.loginPage()) 
           }  
           else{
             //Ok(views.html.setupPageOne())
             Ok(views.html.setupPageTwo())   
           }    
          
         }
         else{
           val title = "Username Exists in database"
           val head = "Username Exists in database"
           val time = "5"
           val body = s"Username already exists. Automatic Redirect"
           val url = "/" 
           Ok(views.html.errorPageTwo(time,title,head,body,url))
           //Ok("Email already exists!")
         }
       }       
       
       
    }.getOrElse(Ok("Something went wrong with postVals"))
  }
  
}