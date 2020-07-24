package controllers

import javax.inject._

import play.api.mvc._
import java.io.File
import java.nio.file.{Files, Paths}
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action { implicit request=>
    Ok(views.html.homePage())
  }
  
  def trialPage=Action{ implicit request=>
    Ok(views.html.trial())
  }
  
  def upload = Action(parse.multipartFormData) { request =>
  request.body
    .file("picture")
    .map { picture =>
      // only get the last part of the filename
      // otherwise someone can send a path like ../../home/foo/bar.txt to write to other files on the system
      val filename    = Paths.get(picture.filename).getFileName
      val fileSize    = picture.fileSize
      val contentType = picture.contentType

      picture.ref.copyTo(Paths.get(s"C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/$filename"), replace = true)
      Ok("File uploaded")
    }
    .getOrElse {
      Ok("error")
    }
}
  
 
  
  /*def uploadTwo = Action(parse.temporaryFile) { request =>
  request.body.moveTo(Paths.get("C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/sysTable.csv"), replace = true)
  Ok("File uploaded")
  }*/
  
  /*def uploadTwo = Action(parse.multipartFormData) { request =>
   request.body
    .file("sqlFile") 
    .map { temp =>
      val filename    = Paths.get(temp.filename).getFileName      

      temp.ref.copyTo(Paths.get(s"C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/$filename"), replace = true)
      Ok("File uploaded")
    }
    .getOrElse {
      Ok("error")
    }
}*/
  
  }
  



