package models

import javax.inject._

import play.api.mvc._
import java.io.File
import java.nio.file.{Files, Paths}

object MethodsForSetup {
  
  def funcCall(): Unit = {
    for(i<- 0 to 10){
      Thread.sleep(100)  
      println(i)
    }
  }
}