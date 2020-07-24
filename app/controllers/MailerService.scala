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


@Singleton
class MailerService @Inject()(db: Database,mailer: MailerClient, environment: Environment, val controllerComponents: ControllerComponents) extends BaseController {

  def send() = Action {implicit request =>
    
    db.withConnection { implicit connection => 
      var str = "select empemail from usertable"
      val userEmailList = SQL(str).as(get[String]("empemail") *)
      str = "select emppass from usertable"
      val userpassList = SQL(str).as(get[String]("empPass") *)
      val userEmailPassList = (userEmailList zip userpassList).toMap
      println(userEmailPassList)
      
      for((emailId,pass)<-userEmailPassList){
        var pass2 = models.EncryterTool.decrypt(pass)
        val str2 = s"<p>Your Account has been created on BugTracker</p><b>Password: </b>$pass2"
        val cid = "1234"
        val email = Email(
          "This is a Test Mail from BugTracker",
          "BugTracker <sanjay02081998@gmail.com>",
          Seq(emailId),
          
          //bodyText = Some("A text message"),          
          bodyHtml = Some(s"""<html><body>$str2</body></html>""")
        )
        val id = mailer.send(email)        
     }
      Redirect{routes.login.loginPage()}
    }
  }

  def sendWithCustomMailer = Action {
    val mailer = new SMTPMailer(SMTPConfiguration("typesafe.org", 1234))
    val id = mailer.send(Email("Simple email", "Mister FROM <from@email.com>"))
    Ok(s"Email $id sent!")
  }
}