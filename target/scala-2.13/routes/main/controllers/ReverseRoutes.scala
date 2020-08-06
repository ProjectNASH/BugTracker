// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Thu Aug 06 12:54:35 IST 2020

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

  // @LINE:38
  class Reversedashboard(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def createPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createPage")
    }
  
    // @LINE:40
    def getPageData(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getPageData")
    }
  
    // @LINE:41
    def viewPages(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewPages")
    }
  
    // @LINE:38
    def viewDashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewDashboard")
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

  // @LINE:44
  class ReverseanswerQuery(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def getQuestionToAnswer(bookNametemp:String, qsNo:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "answer" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bookNametemp", bookNametemp)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("qsNo", qsNo)))))
    }
  
    // @LINE:48
    def answerThequestion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "trial2")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def upload(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "trial1")
    }
  
    // @LINE:7
    def trialPage(): Call = {
    
      () match {
      
        // @LINE:7
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "trial")
      
      }
    
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

  // @LINE:18
  class ReversemeetTheTeam(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def showTeamPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "meetTheTeam")
    }
  
  }

  // @LINE:21
  class Reverselogin(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def loginValidate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "checkinglogin")
    }
  
    // @LINE:21
    def loginPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:25
  class ReversesignUp(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getSignupInfo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "checkingsignup")
    }
  
    // @LINE:25
    def sendSignupSetupPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signupsetup")
    }
  
    // @LINE:26
    def sendSignupPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
  }

  // @LINE:32
  class Reversesetup(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getSetUpInfo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbacksetupinfo")
    }
  
    // @LINE:35
    def getAddRoles(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbackAddRoles")
    }
  
    // @LINE:34
    def getEmpData(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbackempinfo")
    }
  
  }


}
