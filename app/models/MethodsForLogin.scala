package models

import collection.mutable


object MethodsForLogin {
  
  private val users = mutable.Map[String, String]("Sanjay"->"Dutta")
  
  def validateUser(usernamePasswordList: Map[String, String], username: String, password:String):Boolean = {
    //users.get(username).map(_ == password).getOrElse(false)
    if(usernamePasswordList.contains(username) && models.EncryterTool.decrypt(usernamePasswordList(username)) == password ){
        println(models.EncryterTool.decrypt(usernamePasswordList(username)))
        println(password)
        true
      }else{false}
  }
}