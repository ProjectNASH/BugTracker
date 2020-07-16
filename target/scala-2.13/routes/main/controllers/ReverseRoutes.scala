// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Wed Jul 15 18:47:23 IST 2020

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

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
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

  // @LINE:16
  class Reverselogin(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def loginValidate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "checkinglogin")
    }
  
    // @LINE:16
    def loginPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:32
    def viewDashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewDashboard")
    }
  
  }

  // @LINE:20
  class ReversesignUp(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def getSignupInfo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "checkingsignup")
    }
  
    // @LINE:20
    def sendSignupPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
  }

  // @LINE:27
  class Reversesetup(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def getSetUpInfo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbacksetupinfo")
    }
  
    // @LINE:30
    def getAddRoles(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbackAddRoles")
    }
  
    // @LINE:29
    def getEmpData(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getbackempinfo")
    }
  
  }


}
