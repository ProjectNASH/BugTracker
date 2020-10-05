// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Mon Oct 05 12:41:16 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:34
  class Reversedashboard(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def viewDashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewDashboard")
    }
  
    // @LINE:61
    def viewPages(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewPages")
    }
  
    // @LINE:34
    def changePassWordOne(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "changePasswordByUser")
    }
  
    // @LINE:35
    def changePasswordTwo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getpasswordForfchangePassword")
    }
  
    // @LINE:59
    def getPageData(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getPageData")
    }
  
    // @LINE:58
    def createPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createPage")
    }
  
    // @LINE:62
    def viewMyPages(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewMyPages")
    }
  
  }

  // @LINE:9
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:65
  class ReverseanswerQuery(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def markWorkingSolution(slno:Int, bookNameTemp:String, working:Int, qsno:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "markCorrectSol" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("slno", slno)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bookNameTemp", bookNameTemp)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("working", working)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("qsno", qsno)))))
    }
  
    // @LINE:65
    def getQuestionToAnswer(bookNametemp:String, qsNo:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "answer" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bookNametemp", bookNametemp)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("qsNo", qsNo)))))
    }
  
    // @LINE:67
    def answerThequestion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "answerquestion")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:11
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:27
  class ReverseresetPassword(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getOTP(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "resetPassword/otpverify/resultofotp")
    }
  
    // @LINE:28
    def sendEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "resetPassword/otpverify")
    }
  
    // @LINE:38
    def sendPasswordChangePage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "changePassword")
    }
  
    // @LINE:31
    def forgetSendPasswordTwo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forgotPasswords")
    }
  
    // @LINE:30
    def forgetSendPasswordOne(userEmail:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "inputnewPasswords" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userEmail", userEmail)))))
    }
  
    // @LINE:27
    def sendOtpChange(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "resetPassword")
    }
  
    // @LINE:39
    def setNewPassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validatePasswordChange")
    }
  
  }

  // @LINE:18
  class ReversemeetTheTeam(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def documentation(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "documentation")
    }
  
    // @LINE:18
    def showTeamPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "meetTheTeam")
    }
  
  }

  // @LINE:22
  class Reverselogin(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def loginValidate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "checkinglogin")
    }
  
    // @LINE:24
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:22
    def loginPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:54
  class ReverseMailerService(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def send(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendemailnotifications")
    }
  
  }

  // @LINE:43
  class ReversesignUp(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def getSignupInfo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "checkingsignup")
    }
  
    // @LINE:43
    def sendSignupSetupPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signupsetup")
    }
  
  }

  // @LINE:50
  class Reversesetup(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def getSetUpInfo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbacksetupinfo")
    }
  
    // @LINE:53
    def getAddRoles(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbackAddRoles")
    }
  
    // @LINE:52
    def getEmpData(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbackempinfo")
    }
  
  }


}
