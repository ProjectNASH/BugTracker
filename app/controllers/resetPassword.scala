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

import java.io.File
import java.nio.file.{Files, Paths}

import scala.language.postfixOps



import java.io.File
import javax.inject.Inject

import org.apache.commons.mail.EmailAttachment
import play.api.Environment
import play.api.libs.mailer._
import play.api.mvc._
import java.util.Calendar
import java.text.SimpleDateFormat


class resetPassword  @Inject()(db: Database,mailer: MailerClient, environment: Environment, val controllerComponents: ControllerComponents) (implicit assetsFinder: AssetsFinder) extends BaseController  {
  
  
  
  def sendOtpChange = Action{implicit request =>    
    Ok(views.html.forgotPassword())
  }
  
  
  def sendEmail = Action {implicit request => 
    val postVals = request.body.asFormUrlEncoded
    postVals.map{ args => 
      val emailUser = (args("email").head)
      
      try{
          db.withConnection { implicit connection => 
        
           val query = s"select empemail from usertable where empemail in ({email})"
           val userName = SQL(s"select EmpUserName from usertable where empemail in ({email})").on("email"->emailUser).as( str("EmpUserName") *)
           
           val result : List[String] = SQL(query).on("email"->emailUser).as( str("empemail") *)
           println(result)
           var pass2 = "";
           if(!result.isEmpty){
             val r = scala.util.Random
             val r1 = (r.nextInt(10000)) + 1000
             pass2 = r1.toString //randomize it
             val str2 = s"<p>Your OTP: </b>$pass2 <br> If you didn't initiate a password reset, contact your System Adminstrator or change your password."
            val cid = "1234"
            val email = Email(
              "Password Reset Initiated- BugTracker",
              "BugTracker <sanjay02081998@gmail.com>",
              Seq(emailUser),  
              bodyHtml = Some(s"""<html><body>$str2</body></html>""")
            )
            println(email)
            val id = mailer.send(email)  
            //Redirect{routes.login.loginPage()} 
            val encpass = models.EncryterTool.encrypt(pass2)
            val tempUserTable = userName.head
            val result1 = SQL(s"create table $tempUserTable (otp text,exptime timestamp DEFAULT now())").execute()
            val result2 = SQL(s"insert into $tempUserTable (otp,exptime) values ($pass2,NOW()+INTERVAL 10 minute)").execute()
            Ok(views.html.forgotPasswordTwo(tempUserTable))
             //Redirect(routes.resetPassword.sendEmail).withNewSession         
           }
           
           else{
             println("List is Empty")
             Ok(views.html.errorPageThree(500,"Oops","No such emails exists.Please try again\n Automatic Redirect","5","/login"))
           }
        }
      }
      catch{
        case x: Throwable => Ok(views.html.errorPageThree(500,"Oops","Something went wrong.Please try again\n Automatic Redirect","5","/login"))
      }  
      //Ok("Something went Wrong!!! ")
    }.getOrElse(Ok(views.html.errorPageThree(500,"Oops","Something went wrong.Please try again\n Automatic Redirect","5","/login")))
    
  }
  
  def sendEmail(tempUserTable: String) = Action{ implicit request=>
    Ok(views.html.forgotPasswordTwo(tempUserTable))
  }

  def getOTP = Action {implicit request =>  
        val postVals = request.body.asFormUrlEncoded
         postVals.map{ args => 
          val userOTP = (args("otpstring").head)
          val userEmail = (args("userEmail").head)
          println(userEmail)
          try{
              db.withConnection { implicit connection => 
              val today = Calendar.getInstance().getTime()
              
              val year = Calendar.getInstance().get(Calendar.YEAR);
              val month = Calendar.getInstance().get(Calendar.MONTH)+1
              val day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH); 
              
               
              val simpDate = new SimpleDateFormat("kk:mm:ss");
              val timeTimeNow = simpDate.format(today)
             
              
              val timeNow = s"$year-$month-$day $timeTimeNow"
              
              
              println(timeNow)
                
                val serverOTP = SQL(s"select otp from $userEmail where exptime > '$timeNow';").as(str("otp") *)
                val dropTable = SQL(s"drop table $userEmail").execute()
                println(serverOTP)
                if(!(serverOTP.isEmpty)){                  
                  if(userOTP.equals(serverOTP.head)){
                    //Ok("OTP matches->Followed By New Password")
                    Redirect({routes.resetPassword.forgetSendPasswordOne(userEmail)}).withNewSession  
                  }
                  else{
                    //Ok("OTP FAILED. Process Exit.Try Again!!!")
                    Ok(views.html.errorPageThree(500,"Oops","OTP FAILED. Please try again. Automatic Redirect in 5s","5","/login"))
                  }
                }
                else{
                  //Ok("Something went wrong. Please Try again!!!!")
                  Ok(views.html.errorPageThree(500,"Oops","OTP Expired.Please try again\n Automatic Redirect","5","/login"))
                }
              }       
          }
          catch{
            case x: Throwable => Ok(views.html.errorPageThree(500,"Oops","Something went wrong.Please try again\n Automatic Redirect","5","/login"))
          }
     }.getOrElse(Ok(views.html.errorPageThree(500,"Oops","Something went wrong.Please try again\n Automatic Redirect","5","/login")))
   }
  
  
  
  def forgetSendPasswordOne(userEmail:String) = Action{implicit request=>
      Redirect({routes.resetPassword.forgetSendPasswordTwo()}).withSession("username"->userEmail);    
  }
  
  def forgetSendPasswordTwo = Action{implicit request=>
      Ok(views.html.changePasswordForget())    
  }
  
  def sendPasswordChangePage = Action{implicit request=>
      Ok(views.html.changePassword())  
  
    }
    
  
    
  
  def setNewPassword = Action{implicit request =>
     val usernameOption = request.session.get("username")
     usernameOption.map{ username => 
       val postVals = request.body.asFormUrlEncoded
           postVals.map{ args => 
            val newPassword = (args("newPassword").head)
            val cnewPassword = (args("confirmnewPassword").head)
            if(newPassword.equals(cnewPassword)){
             db.withConnection { implicit connection => 
               val encPass : String =  models.EncryterTool.encrypt(newPassword)
               val str = s"UPDATE usertable set EmpPass = '$encPass' where EmpuserName in ({username})"
               println(str)
               val result = SQL(str).on(("username",username)).execute()
               val title = "Passwords Change Successful"
               val head = "Passwords Change Successful!!!!"
               val time = "2"
               val body = s"Password has been succesfully changed. Please login again(automatic redirect in 5s) "
               val url = "/login"
               val typeform = "GET"
               Ok(views.html.errorPage(time,title,head,body,url,typeform)).withNewSession  
               //Redirect({routes.login.loginPage()})
             }
            }
            else{
               val title = "Passwords do not match"
               val head = "Passwords Do not match!!!"
               val time = "5"
               val body = s"Looks like you have entered two different passwords. Please try again(automatic redirect in 5s) "
               val url = "/changePasswordByUser"
               val typeform = "GET"
               Ok(views.html.errorPage(time,title,head,body,url,typeform))
            }
           }.getOrElse(Ok(views.html.errorPageThree(500,"Oops","Something went wrong.Please try again\n Automatic Redirect","5","/login")))
      }.getOrElse(Ok(views.html.errorPageThree(500,"Oops","Session Interference\n Automatic Redirect","5","/login")))
  }
  
  
  
  
}