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

class answerQuery @Inject()(db: Database,cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc){
  
  def getQuestionToAnswer(bookNametemp:String, qsNo: Int) = Action {implicit request =>
    val bookName = bookNametemp + "Book"
    Ok(s"You want to answer $qsNo from $bookName")
  }
}