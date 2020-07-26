// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Sat Jul 25 17:16:31 IST 2020

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

  // @LINE:35
  class Reversedashboard(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def createPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createPage")
    }
  
    // @LINE:37
    def getPageData(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getPageData")
    }
  
    // @LINE:38
    def viewPages(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewPages")
    }
  
    // @LINE:35
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

  // @LINE:41
  class ReverseanswerQuery(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def getQuestionToAnswer(bookNametemp:String, qsNo:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "answer" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bookNametemp", bookNametemp)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("qsNo", qsNo)))))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def upload(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "trial1")
    }
  
    // @LINE:7
    def trialPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "trial")
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
  class Reverselogin(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def loginValidate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "checkinglogin")
    }
  
    // @LINE:18
    def loginPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:46
  class ReverseMailerService(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def send(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "trial3")
    }
  
  }

  // @LINE:22
  class ReversesignUp(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def getSignupInfo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "checkingsignup")
    }
  
    // @LINE:22
    def sendSignupSetupPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signupsetup")
    }
  
    // @LINE:23
    def sendSignupPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
  }

  // @LINE:29
  class Reversesetup(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getSetUpInfo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbacksetupinfo")
    }
  
    // @LINE:32
    def getAddRoles(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbackAddRoles")
    }
  
    // @LINE:31
    def getEmpData(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbackempinfo")
    }
  
  }


}
