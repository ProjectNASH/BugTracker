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

import play.api.mvc._
import java.io.File
import java.nio.file.{Files, Paths}

class answerQuery @Inject()(db: Database,cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc){
  
  def getQuestionToAnswer(bookNametemp:String, qsNo: Int, pageTarget: String) = Action {implicit request =>
    val usernameOption = request.session.get("username")
      usernameOption.map{ username =>     
        
        val bookName = bookNametemp + "Book"
        //Ok(s"You want to answer $qsNo from $bookName")
        Ok(views.html.trial(qsNo,bookName,pageTarget))
        
     }getOrElse(Redirect{routes.login.loginPage()})
  }
  
  def answerThequestion = Action(parse.multipartFormData){ request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{ username =>   
       
       val qsNo = request.body.dataParts.get("qsNo").map{ args=> args(0) }
       val bookName = request.body.dataParts.get("bookname").map{ args=> args(0) }
       println(qsNo.head)  //couloumn1 
       println(bookName.head)  //tablename
       
       val dataKey = request.body.dataParts.get("answer")      
       val ans = dataKey.map{ args=> args(0) }
       //println(ans.head)  //couloumn2
       
       request.body.file("picture").map { picture =>  
          val filename    = Paths.get(picture.filename).getFileName  //couloumn 3
          val fileSize    = picture.fileSize
          val contentType = picture.contentType    
          picture.ref.copyTo(Paths.get(s"C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/$filename"), replace = true)
          Ok("File uploaded")
       }
       
       //table->bookName+"Ans"(qsNo.head,ans.head,filename)       
       
       
       Ok("Done")
     
        
        
      
    }getOrElse(Redirect{routes.login.loginPage()})    
    
   }
}