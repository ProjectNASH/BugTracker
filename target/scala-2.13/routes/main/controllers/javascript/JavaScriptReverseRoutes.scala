// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Thu Aug 06 12:54:35 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:38
  class Reversedashboard(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def createPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.createPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createPage"})
        }
      """
    )
  
    // @LINE:40
    def getPageData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.getPageData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getPageData"})
        }
      """
    )
  
    // @LINE:41
    def viewPages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.viewPages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewPages"})
        }
      """
    )
  
    // @LINE:38
    def viewDashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.viewDashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewDashboard"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:44
  class ReverseanswerQuery(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def getQuestionToAnswer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.answerQuery.getQuestionToAnswer",
      """
        function(bookNametemp0,qsNo1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "answer" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bookNametemp", bookNametemp0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("qsNo", qsNo1)])})
        }
      """
    )
  
    // @LINE:48
    def answerThequestion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.answerQuery.answerThequestion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "trial2"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "trial1"})
        }
      """
    )
  
    // @LINE:7
    def trialPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.trialPage",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "trial"})
          }
        
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReversemeetTheTeam(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def showTeamPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.meetTheTeam.showTeamPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "meetTheTeam"})
        }
      """
    )
  
  }

  // @LINE:21
  class Reverselogin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def loginValidate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.login.loginValidate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkinglogin"})
        }
      """
    )
  
    // @LINE:21
    def loginPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.login.loginPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReversesignUp(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getSignupInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.signUp.getSignupInfo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkingsignup"})
        }
      """
    )
  
    // @LINE:25
    def sendSignupSetupPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.signUp.sendSignupSetupPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signupsetup"})
        }
      """
    )
  
    // @LINE:26
    def sendSignupPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.signUp.sendSignupPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:32
  class Reversesetup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getSetUpInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.setup.getSetUpInfo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getbacksetupinfo"})
        }
      """
    )
  
    // @LINE:35
    def getAddRoles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.setup.getAddRoles",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getbackAddRoles"})
        }
      """
    )
  
    // @LINE:34
    def getEmpData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.setup.getEmpData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getbackempinfo"})
        }
      """
    )
  
  }


}
