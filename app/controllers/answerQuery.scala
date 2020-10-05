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
import java.io._
import scala.io.Source
import java.nio.file.{Files, Paths}

class answerQuery @Inject()(db: Database,cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc){
  
  def getQuestionToAnswer(bookNametemp:String, qsNo: Int) = Action {implicit request =>
    val usernameOption = request.session.get("username")
      usernameOption.map{ username =>     
        
        val bookName = bookNametemp + "Book"
        val bookNameAns = bookName + "Ans"
        println(bookName)
        //Ok(s"You want to answer $qsNo from $bookName")
        
            db.withConnection { implicit connection =>
                
                 val pageNameString = s"select pagename from $bookName in ({qsNo})"  
                 println(pageNameString)
                 val pageName:List[String] = SQL(s"select pagename from $bookName where qsNo in  ({qsNo})").on("qsNo"->qsNo).as(get[String]("pagename") *)
                 println(pageName.head)
                 
                val pageBodyString = s"select pageBody from $bookName where qsNo in ({qsNo})"  
                
                val pageBody:List[String] = SQL(s"select pageBody from $bookName where qsNo in ({qsNo})").on("qsNo"->qsNo).as(get[String]("pageBody") *)
                 println(pageBody.head)
                 
                 
                // val existingAnsString : List[String] = "select ans from bookName"+"Ans"
                 
                 /*println(pageBody.head)
                 val filename = "C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/assets/attachedFilesQueries/"+pageBody.head+".txt"
                 val fileContents = Source.fromFile(filename)
                 val lines = fileContents.getLines
                 val finalLines = lines.toList
                 fileContents.close
                 for(line<-finalLines){
                   println(line)
                 }*/
                 val finalLines = pageBody.head.split("\n").toList
                 
                 val bookNameAns  = bookName + "Ans"
                 var no = 0
                 var existingAns: List[(Int,Int,String,String,Int)] = List((0,0,"null","null",0))
                 try{
                   existingAns  = SQL(s"select slno,qsno,ans,answererusername,working from $bookNameAns where qsNo in ({qsNo})").on("qsNo"->qsNo).as(get[Int]("slno") ~ get[Int]("qsno") ~ str("ans") ~ str("answererusername") ~ get[Int]("working") map(flatten) *)
                   no = existingAns.size
                 }
                 catch{
                   case x: Throwable =>  println("No One has answered this question")    
                 }
                 println(existingAns)              
                 
                 
                 Ok(views.html.answerTheQuestion(bookNametemp,qsNo,bookName,pageName.head,finalLines,existingAns,no,username))
                 
                
            }
     
               
         
        
     }getOrElse(Redirect{routes.login.loginPage()})
  }
  
  def answerThequestion = Action(parse.multipartFormData){ request =>
    val usernameOption = request.session.get("username")
    usernameOption.map{ username =>   
       
       val qsNo = request.body.dataParts.get("qsNo").map{ args=> args(0) }
       val bookName = request.body.dataParts.get("bookname").map{ args=> args(0) }
       var bookNameAns = bookName.head + "Ans"
       var bookNameOnly = bookName.head
       
       val dataKey = request.body.dataParts.get("answer")      
       val ans = dataKey.map{ args=> args(0) }
       
       /*var count =  scala.util.Random.nextInt()
       val qsHead = qsNo.head
       val url = "C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/assets/attachedFilesAnswers/"
       val FileName = url + s"$bookNameAns"+ s"$qsHead" + s"$count" + s".txt"
       val ansFile = s"$bookNameAns"+s"$qsHead" + s"$count" + s".txt"
       val pw = new PrintWriter(new File(FileName ))
       pw.write(ans.head)
       pw.close  */
       
       if(!(ans.head.isEmpty)){   
         try{
            db.withConnection { implicit connection =>
                try{
                 val str = s"CREATE TABLE $bookNameAns (slno int auto_increment primary key,qsNo INT NOT NULL,ans TEXT, answererUsername VARCHAR(255), working int default 0)" 
                 val result = SQL(str).execute()
                 println(result)
                 
                 val trigName = bookNameAns +"Trig"
                 val strTrig =s"create trigger $trigName after update on $bookNameAns for each row update ansno set ansno = ansno + 1;"
                 val resultTrig = SQL(strTrig).execute()  
               }
               catch{
                 case x: Throwable => println("Table already exists")
             }
             var str = s"insert into $bookNameAns (qsNo,ans,answererUsername) values({qsNo},{ans},{answererUsername})"
             var result: Boolean = SQL(str).on(
                  ("qsNo",qsNo.head), 
                  ("ans",ans.head),                
                  ("answererUsername",username)).execute()      
           }
         }
         catch{
           case x: Throwable => println("Server Error: ",x)
         }
       }
       else{
         println("You didnt write an answer")
       }
       
     
       //Ok("Done")
       Redirect{routes.dashboard.viewPages()}
        
        
      
    }getOrElse(Redirect{routes.login.loginPage()})    
  }
  
  
  def markWorkingSolution(slno: Int,bookNameTemp: String,working:Int, qsno:Int) = Action{ implicit request =>
     val usernameOption = request.session.get("username")
      usernameOption.map{ username =>   
        val table = bookNameTemp + "bookans"
        val tableTwo = bookNameTemp + "book"
        println(s"Before qsno: $qsno")
        try{
           db.withConnection { implicit connection =>
            var ans = 1;
             if(working == 1){
               ans = 0 
               try{
               val r = SQL(s"update ansno set ansno = ansno-2").execute()   
               }
               catch{
                  case x: Throwable => println(s"Update went wrong!!!!: $x")
               }
               println("here")
             }
            else{
              ans = 1               
            }
            
            val result = SQL(s"update $table set working = $ans where slno = $slno").execute() 
            
          }
        }
        catch{
          case x: Throwable => Ok("Update went wrong!!!!")
        }        
        Redirect{routes.dashboard.viewPages()}
      }getOrElse(Redirect{routes.login.loginPage()})
  }
  
  
}