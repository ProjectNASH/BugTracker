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
             val createCsvTable = s"CREATE TABLE csvtable(EmpId Varchar(225),EmpName VARCHAR(50),dept VARCHAR(255));"
             val result = SQL(createCsvTable).execute()
           }catch{
             case x: Throwable => println(x)
           }
           var str = "LOAD DATA INFILE 'C://Users//DELL//Desktop//BugTracker//play-samples-play-scala-starter-example//app//assets//sysTable//userTable.csv' INTO TABLE csvtable FIELDS TERMINATED BY ',' LINES TERMINATED BY '\r\n' IGNORE 1 ROWS"
           val result: Boolean = SQL(str).execute()
           
           val r :List[String] = {
             SQL("select distinct dept from csvtable").as(get[String]("dept") *)
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
             SQL("select distinct dept from csvtable").as(get[String]("dept") *)
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
         Ok(views.html.loginPage())
       }.getOrElse(Ok("Something went wrong"))
     }
    
    
   
  
}