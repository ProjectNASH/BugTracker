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
  
  def sendSignupPage = Action { implicit request=>
    Ok(views.html.signupPage())
  }
  
  def getSignupInfo = Action{ implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map{ args => 
      val fname = args("username").head
      val lname = args("dept").head
      val email = args("email").head
	    val adminUsername = ((args("email").head).split("@"))(0) 
	    println(adminUsername)
	    var password  = args("password").head
	    println("Sign up pass before " + password)
	    password = models.EncryterTool.encrypt(password)
	    println("Sign up pass after " + password)
      
      db.withConnection { implicit connection =>  
         try{
           val createUserTable = s"CREATE TABLE UserTable (UserId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,User_userName VARCHAR(50) UNIQUE,User_firstName VARCHAR(50) NOT NULL,User_lastName VARCHAR(50) NOT NULL,User_email VARCHAR(50) NOT NULL,User_password VARCHAR(255) NOT NULL)"
           val result = SQL(createUserTable).execute()
         } catch{
           case x: Throwable => println(x);
         }
         val isEmail_inDatabase: List[String] = SQL("select User_email from Usertable where User_email in ({email})").on("email"->email).as( str("User_email") *) 
         if(isEmail_inDatabase.isEmpty){
        
         //need to do a check if this user exists in Company Roll   
           
          var result: Boolean = SQL("insert into UserTable(user_username,user_firstName,user_lastName,user_email,user_password) values({user_username},{user_firstName},{user_lastName},{user_email},{user_password})").on(
              ("user_username",adminUsername), 
              ("user_firstName",fname),
               ("user_lastName",lname),
               ("user_email",email),
               ("user_password",password)).execute()          
           //Ok("done")
           Ok(views.html.setupPageOne())    
         }
         else{
           Ok("Email already exists!")
         }
       }
       
       
       
    }.getOrElse(Ok("Something went wrong with postVals"))
  }
  
}