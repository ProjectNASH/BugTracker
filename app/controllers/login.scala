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
     val username = args("username").head
     var password = args("password").head
     //println("Login Before:" + password)
     //password = models.EncryterTool.encrypt(password)
     println("Working")
     //println("Login After:" + password)
     
     db.withConnection { implicit connection =>  
       //println("Inside db")
       val usernameList :List[String] = {
         SQL("select user_username from usertable where user_username in ({inputUsername})").on("inputUsername"->username).as( str("user_username") *) 
       }
       val passwordList:List[String] = {
        SQL("select user_password from usertable where user_username in ({inputUsername})").on("inputUsername"->username).as( str("user_password")  *) 
       }       
      if(!(usernameList.isEmpty)){
        //println("Username exsists")
        val usernamePasswordList = (usernameList zip passwordList).toMap      
        if(models.MethodsForLogin.validateUser(usernamePasswordList, username, password)){
          println("Username valid")
          //Ok(views.html.userDashboard())
          Redirect{routes.login.viewDashboard()}.withSession("username"->username);          
        }
        else{
            Ok("you have not entered the right password")
        }
      }
      else
      {
        Ok("No such User exists!!")
        //Redirect{routes.login.loginPage()}
      }
     } 
    }.getOrElse(Ok("Something went wrong with postVals"))
  }
  
  def viewDashboard = Action{ implicit request =>
    val usernameOption = request.session.get("username")
      usernameOption.map{ username =>
        //write a method to get all the information about the user that is needed to be
        //shown on the dashboard from the database, then do Ok()
        Ok(views.html.userDashboard());
      }getOrElse(Ok("YOU CSRF SH!T GET OUT!!!"))
  }
  
}