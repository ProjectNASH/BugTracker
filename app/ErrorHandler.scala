import play.api.http.HttpErrorHandler
import play.api.mvc._
import play.api.mvc.Results._
import scala.concurrent._
import javax.inject.Singleton

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
class ErrorHandler extends HttpErrorHandler {
  def onClientError(request: RequestHeader, statusCode: Int, message: String): Future[Result] = { 
    val head = "Client Error"
    val body = "Looks like you tried to get something from nothing!!! Redirecting To HomePage"
    val time = "5"
    val url = "/"
    Future.successful(
        Status(statusCode)(views.html.errorPageThree(statusCode,head,body,time,url))
        )
      
     
    
      
  }

  def onServerError(request: RequestHeader, exception: Throwable): Future[Result] = {
    val head = "Server Error"
    val body = "Oops we made an Error. Please Try Again !!! Redirecting To HomePage"
    val time = "5"
    val url = "/"
    Future.successful(
      InternalServerError(views.html.errorPageThree(500,head,body,time,url))
    )
  }
}