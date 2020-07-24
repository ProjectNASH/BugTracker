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


import org.apache.commons.mail.EmailAttachment
import play.api.Environment
import play.api.libs.mailer._
import play.api.mvc._





/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class setup @Inject()(db: Database,cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {
  
   def sendSetUpPage = Action{ implicit request =>
      Ok(views.html.setupPageOne())  
    }
  
    def getSetUpInfo = Action { implicit request =>
     val postVals = request.body.asFormUrlEncoded
     postVals.map{ args => 
     val name = args("username").head
     val orgname = args("org").head
     val domain = args("domain").head
     val sysemail = args("sysemail").head     
     var password = args("syspassword").head
     password = models.EncryterTool.encrypt(password)
     
     try{
       db.withConnection { implicit connection =>  
          try{ 
           try{
             val makeSysTable = s"CREATE TABLE SysTable(UserName VARCHAR(50) UNIQUE,OrgName VARCHAR(255) ,domain VARCHAR(255),sysemail VARCHAR(255),password varchar(255))"
             var result: Boolean = SQL(makeSysTable).execute()  
           }
           catch{
             case _: Throwable=> println("Table already exists");
           }
           
           val didSysSetUp: List[String] = SQL("select * from SysTable").as( str("*") *) 
           if(didSysSetUp.isEmpty){
             var result: Boolean = SQL("insert into SysTable(username,orgname,domain,sysemail,password) values({Username},{orgName},{domName},{sysemail},{syspassword})").on(
                ("Username",name), 
                ("orgName",orgname),
                ("domName",domain),
                ("sysemail",sysemail),
                ("syspassword",password)).execute()
                //Redirect(routes.setup.setupPageTwo).withSession("name"-> name)
                Ok(views.html.setupPageTwo())   
              }
              else{
                 Ok("Seems like already registered")
              }
        }
        catch{ 
          case x: AnormException=>
            Ok("Looks like BugTracker has already been setup on this server")
        }            
      }
     }
     catch{
       case _: Throwable=>
         Ok("MySQL Server is Offline")
     }
   }.getOrElse(Ok("Something went wrong with postVals"))
  }
    
    
    def setupPageTwo = Action{implicit request =>    
          Ok(views.html.setupPageTwo())       
    }
    
   def getEmpData = Action(parse.multipartFormData) { implicit request =>
   request.body
    .file("sqlFile") 
    .map { temp =>
      val filename= Paths.get(temp.filename).getFileName    
      temp.ref.copyTo(Paths.get(s"app/assets/sysTable/userTable.csv"), replace = true)            
        db.withConnection { implicit connection =>  
           try{
             val createCsvTable = s"CREATE TABLE csvtable(name VARCHAR(255),dept VARCHAR(255),email VARCHAR(255));"
             val result = SQL(createCsvTable).execute()
           }catch{
             case x: Throwable => println(x)
           }
           var str = "LOAD DATA INFILE 'C://Users//DELL//Desktop//BugTracker//play-samples-play-scala-starter-example//app//assets//sysTable//userTable.csv' INTO TABLE csvtable FIELDS TERMINATED BY ',' LINES TERMINATED BY '\r\n' IGNORE 1 ROWS"
           var result: Boolean = SQL(str).execute();
           
          
           str = "insert into usertable(EmpName,EmpDept,EmpEmail) select name,dept,email from csvtable ";
           result = SQL(str).execute();
           
           /*str="update usertable set emppass = concat(substring('ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789', rand(@seed:=round(rand(@lid)*4294967296))*36+1, 1),substring('ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789', rand(@seed:=round(rand(@seed)*4294967296))*36+1, 1),substring('ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789', rand(@seed:=round(rand(@seed)*4294967296))*36+1, 1),substring('ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789', rand(@seed:=round(rand(@seed)*4294967296))*36+1, 1),substring('ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789', rand(@seed:=round(rand(@seed)*4294967296))*36+1, 1),substring('ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789', rand(@seed:=round(rand(@seed)*4294967296))*36+1, 1),substring('ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789', rand(@seed:=round(rand(@seed)*4294967296))*36+1, 1),substring('ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789', rand(@seed)*36+1, 1)) where EmpUserId <> 1"*/
           var count = (SQL("select count(*) from usertable;").as(int("count(*)")*)).head
           println("Count: "+count);
           var a = 0
           for( a <- 2 to count){
             
             val r = new scala.util.Random
             val sb = new StringBuilder
             for (i <- 1 to 6) {
               sb.append(r.nextPrintableChar)
             }
             var pass = models.EncryterTool.encrypt(sb.toString)
             
             str = "update usertable set emppass = '" + pass + s"' where EmpUserId <> 1 and empuserid = $a"
             println("str" + str)
             result = SQL(str).execute();
           }
           
           val initialUsername = SQL("select empemail from usertable where empuserid <> 1").as(get[String]("empemail") *);
           var i = 2
           for( a <- initialUsername){
             var username = (a.split("@"))(0)  + i.toString
             println(username)
             val str2 = "update usertable set empusername = '" + username + s"' where EmpUserId <> 1 and empuserid = $i"
             println(str2)
             result = SQL(str2).execute();
             i = i+1
           }
           
           
           str=s"update usertable set empbook = concat(usertable.empusername,'book')";
           result = SQL(str).execute();
           
           var r :List[String] = {
             SQL("select distinct empdept from usertable").as(get[String]("empdept") *)
           }
           
           
           Ok(views.html.setupPageThree(r))                      
         }
      //Ok("We got everything")
      }.getOrElse {Ok("error")}
   }
  
    def getAddRoles = Action {implicit request =>
       val postVals = request.body.asFormUrlEncoded
     postVals.map{ args => 
         var roles = ((args("addRoles").head).split(","))
         
         db.withConnection { implicit connection => 
            val selectQuery = s"create table dept(dept varchar(255) PRIMARY KEY NOT NULL)"
            var result: Boolean = SQL(selectQuery).execute()  
            
            
            var r :List[String] = {
             SQL("select distinct empdept from usertable").as(get[String]("empdept") *)
             }
            
            for(i<-roles)
            {
              var temp =0            
              for(j<-r)
              {
               if( i.equals(j))
               {
                  temp = 1
                  //break
               }
              }
              if(temp==0)
              {
                r=i::r
              }              
            } 
            
            for(item<-r){
              println(item)
            }
            for(item<-r){
                      if(!(item.equals(""))){
                         val query = SQL("insert into dept(dept) values({deptname})").on(("deptname",item)).execute()
                      }                 
            } 
         }   
         //Ok(views.html.loginPage())
         
         //Subject : String, SenderEmail:String, ReceiverEmail : String, body:String
         Redirect{routes.MailerService.send()}
         //Redirect{routes.login.loginPage()}
       }.getOrElse(Ok("Something went wrong"))
     }
    
    
   
  
}