// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Mon Oct 05 12:41:16 IST 2020

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

  // @LINE:34
  class Reversedashboard(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def viewDashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.viewDashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewDashboard"})
        }
      """
    )
  
    // @LINE:61
    def viewPages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.viewPages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewPages"})
        }
      """
    )
  
    // @LINE:34
    def changePassWordOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.changePassWordOne",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "changePasswordByUser"})
        }
      """
    )
  
    // @LINE:35
    def changePasswordTwo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.changePasswordTwo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getpasswordForfchangePassword"})
        }
      """
    )
  
    // @LINE:59
    def getPageData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.getPageData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getPageData"})
        }
      """
    )
  
    // @LINE:58
    def createPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.createPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createPage"})
        }
      """
    )
  
    // @LINE:62
    def viewMyPages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.dashboard.viewMyPages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewMyPages"})
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

  // @LINE:65
  class ReverseanswerQuery(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def markWorkingSolution: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.answerQuery.markWorkingSolution",
      """
        function(slno0,bookNameTemp1,working2,qsno3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "markCorrectSol" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("slno", slno0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bookNameTemp", bookNameTemp1), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("working", working2), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("qsno", qsno3)])})
        }
      """
    )
  
    // @LINE:65
    def getQuestionToAnswer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.answerQuery.getQuestionToAnswer",
      """
        function(bookNametemp0,qsNo1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "answer" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bookNametemp", bookNametemp0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("qsNo", qsNo1)])})
        }
      """
    )
  
    // @LINE:67
    def answerThequestion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.answerQuery.answerThequestion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "answerquestion"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
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

  // @LINE:27
  class ReverseresetPassword(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getOTP: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.resetPassword.getOTP",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resetPassword/otpverify/resultofotp"})
        }
      """
    )
  
    // @LINE:28
    def sendEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.resetPassword.sendEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resetPassword/otpverify"})
        }
      """
    )
  
    // @LINE:38
    def sendPasswordChangePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.resetPassword.sendPasswordChangePage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "changePassword"})
        }
      """
    )
  
    // @LINE:31
    def forgetSendPasswordTwo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.resetPassword.forgetSendPasswordTwo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forgotPasswords"})
        }
      """
    )
  
    // @LINE:30
    def forgetSendPasswordOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.resetPassword.forgetSendPasswordOne",
      """
        function(userEmail0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inputnewPasswords" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userEmail", userEmail0)])})
        }
      """
    )
  
    // @LINE:27
    def sendOtpChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.resetPassword.sendOtpChange",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resetPassword"})
        }
      """
    )
  
    // @LINE:39
    def setNewPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.resetPassword.setNewPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validatePasswordChange"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReversemeetTheTeam(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def documentation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.meetTheTeam.documentation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "documentation"})
        }
      """
    )
  
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

  // @LINE:22
  class Reverselogin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def loginValidate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.login.loginValidate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkinglogin"})
        }
      """
    )
  
    // @LINE:24
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.login.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:22
    def loginPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.login.loginPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:54
  class ReverseMailerService(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def send: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MailerService.send",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendemailnotifications"})
        }
      """
    )
  
  }

  // @LINE:43
  class ReversesignUp(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def getSignupInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.signUp.getSignupInfo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkingsignup"})
        }
      """
    )
  
    // @LINE:43
    def sendSignupSetupPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.signUp.sendSignupSetupPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signupsetup"})
        }
      """
    )
  
  }

  // @LINE:50
  class Reversesetup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def getSetUpInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.setup.getSetUpInfo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getbacksetupinfo"})
        }
      """
    )
  
    // @LINE:53
    def getAddRoles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.setup.getAddRoles",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getbackAddRoles"})
        }
      """
    )
  
    // @LINE:52
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
