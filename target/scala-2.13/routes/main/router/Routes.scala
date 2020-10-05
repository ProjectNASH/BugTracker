// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Mon Oct 05 12:41:16 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_11: controllers.HomeController,
  // @LINE:9
  CountController_7: controllers.CountController,
  // @LINE:11
  AsyncController_10: controllers.AsyncController,
  // @LINE:14
  Assets_9: controllers.Assets,
  // @LINE:18
  meetTheTeam_6: controllers.meetTheTeam,
  // @LINE:22
  login_0: controllers.login,
  // @LINE:27
  resetPassword_5: controllers.resetPassword,
  // @LINE:34
  dashboard_1: controllers.dashboard,
  // @LINE:43
  signUp_4: controllers.signUp,
  // @LINE:50
  setup_2: controllers.setup,
  // @LINE:54
  MailerService_8: controllers.MailerService,
  // @LINE:65
  answerQuery_3: controllers.answerQuery,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_11: controllers.HomeController,
    // @LINE:9
    CountController_7: controllers.CountController,
    // @LINE:11
    AsyncController_10: controllers.AsyncController,
    // @LINE:14
    Assets_9: controllers.Assets,
    // @LINE:18
    meetTheTeam_6: controllers.meetTheTeam,
    // @LINE:22
    login_0: controllers.login,
    // @LINE:27
    resetPassword_5: controllers.resetPassword,
    // @LINE:34
    dashboard_1: controllers.dashboard,
    // @LINE:43
    signUp_4: controllers.signUp,
    // @LINE:50
    setup_2: controllers.setup,
    // @LINE:54
    MailerService_8: controllers.MailerService,
    // @LINE:65
    answerQuery_3: controllers.answerQuery
  ) = this(errorHandler, HomeController_11, CountController_7, AsyncController_10, Assets_9, meetTheTeam_6, login_0, resetPassword_5, dashboard_1, signUp_4, setup_2, MailerService_8, answerQuery_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_11, CountController_7, AsyncController_10, Assets_9, meetTheTeam_6, login_0, resetPassword_5, dashboard_1, signUp_4, setup_2, MailerService_8, answerQuery_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meetTheTeam""", """controllers.meetTheTeam.showTeamPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """documentation""", """controllers.meetTheTeam.documentation"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.login.loginPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkinglogin""", """controllers.login.loginValidate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.login.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetPassword""", """controllers.resetPassword.sendOtpChange"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetPassword/otpverify""", """controllers.resetPassword.sendEmail"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetPassword/otpverify/resultofotp""", """controllers.resetPassword.getOTP"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inputnewPasswords""", """controllers.resetPassword.forgetSendPasswordOne(userEmail:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forgotPasswords""", """controllers.resetPassword.forgetSendPasswordTwo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changePasswordByUser""", """controllers.dashboard.changePassWordOne"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getpasswordForfchangePassword""", """controllers.dashboard.changePasswordTwo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changePassword""", """controllers.resetPassword.sendPasswordChangePage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validatePasswordChange""", """controllers.resetPassword.setNewPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signupsetup""", """controllers.signUp.sendSignupSetupPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkingsignup""", """controllers.signUp.getSignupInfo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbacksetupinfo""", """controllers.setup.getSetUpInfo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbackempinfo""", """controllers.setup.getEmpData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbackAddRoles""", """controllers.setup.getAddRoles"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendemailnotifications""", """controllers.MailerService.send"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewDashboard""", """controllers.dashboard.viewDashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createPage""", """controllers.dashboard.createPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getPageData""", """controllers.dashboard.getPageData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewPages""", """controllers.dashboard.viewPages"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewMyPages""", """controllers.dashboard.viewMyPages"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """answer""", """controllers.answerQuery.getQuestionToAnswer(bookNametemp:String, qsNo:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """markCorrectSol""", """controllers.answerQuery.markWorkingSolution(slno:Int, bookNameTemp:String, working:Int, qsno:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """answerquestion""", """controllers.answerQuery.answerThequestion"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_11.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_7.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """GET		/trial						controllers.HomeController.trialPage
 An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_10.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_9.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_meetTheTeam_showTeamPage4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meetTheTeam")))
  )
  private[this] lazy val controllers_meetTheTeam_showTeamPage4_invoker = createInvoker(
    meetTheTeam_6.showTeamPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.meetTheTeam",
      "showTeamPage",
      Nil,
      "GET",
      this.prefix + """meetTheTeam""",
      """All methods related to homePage""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_meetTheTeam_documentation5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("documentation")))
  )
  private[this] lazy val controllers_meetTheTeam_documentation5_invoker = createInvoker(
    meetTheTeam_6.documentation,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.meetTheTeam",
      "documentation",
      Nil,
      "GET",
      this.prefix + """documentation""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_login_loginPage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_login_loginPage6_invoker = createInvoker(
    login_0.loginPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.login",
      "loginPage",
      Nil,
      "GET",
      this.prefix + """login""",
      """All Methods related to login""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_login_loginValidate7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkinglogin")))
  )
  private[this] lazy val controllers_login_loginValidate7_invoker = createInvoker(
    login_0.loginValidate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.login",
      "loginValidate",
      Nil,
      "POST",
      this.prefix + """checkinglogin""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_login_logout8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_login_logout8_invoker = createInvoker(
    login_0.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.login",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_resetPassword_sendOtpChange9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetPassword")))
  )
  private[this] lazy val controllers_resetPassword_sendOtpChange9_invoker = createInvoker(
    resetPassword_5.sendOtpChange,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.resetPassword",
      "sendOtpChange",
      Nil,
      "GET",
      this.prefix + """resetPassword""",
      """All methods related to "Forget Password"""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_resetPassword_sendEmail10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetPassword/otpverify")))
  )
  private[this] lazy val controllers_resetPassword_sendEmail10_invoker = createInvoker(
    resetPassword_5.sendEmail,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.resetPassword",
      "sendEmail",
      Nil,
      "POST",
      this.prefix + """resetPassword/otpverify""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_resetPassword_getOTP11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetPassword/otpverify/resultofotp")))
  )
  private[this] lazy val controllers_resetPassword_getOTP11_invoker = createInvoker(
    resetPassword_5.getOTP,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.resetPassword",
      "getOTP",
      Nil,
      "POST",
      this.prefix + """resetPassword/otpverify/resultofotp""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_resetPassword_forgetSendPasswordOne12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("inputnewPasswords")))
  )
  private[this] lazy val controllers_resetPassword_forgetSendPasswordOne12_invoker = createInvoker(
    resetPassword_5.forgetSendPasswordOne(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.resetPassword",
      "forgetSendPasswordOne",
      Seq(classOf[String]),
      "GET",
      this.prefix + """inputnewPasswords""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_resetPassword_forgetSendPasswordTwo13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forgotPasswords")))
  )
  private[this] lazy val controllers_resetPassword_forgetSendPasswordTwo13_invoker = createInvoker(
    resetPassword_5.forgetSendPasswordTwo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.resetPassword",
      "forgetSendPasswordTwo",
      Nil,
      "GET",
      this.prefix + """forgotPasswords""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_dashboard_changePassWordOne14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changePasswordByUser")))
  )
  private[this] lazy val controllers_dashboard_changePassWordOne14_invoker = createInvoker(
    dashboard_1.changePassWordOne,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.dashboard",
      "changePassWordOne",
      Nil,
      "GET",
      this.prefix + """changePasswordByUser""",
      """All methods related to "force change password"""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_dashboard_changePasswordTwo15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getpasswordForfchangePassword")))
  )
  private[this] lazy val controllers_dashboard_changePasswordTwo15_invoker = createInvoker(
    dashboard_1.changePasswordTwo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.dashboard",
      "changePasswordTwo",
      Nil,
      "POST",
      this.prefix + """getpasswordForfchangePassword""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_resetPassword_sendPasswordChangePage16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changePassword")))
  )
  private[this] lazy val controllers_resetPassword_sendPasswordChangePage16_invoker = createInvoker(
    resetPassword_5.sendPasswordChangePage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.resetPassword",
      "sendPasswordChangePage",
      Nil,
      "GET",
      this.prefix + """changePassword""",
      """All methods related to "Change Password from forgetting/force change"""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_resetPassword_setNewPassword17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validatePasswordChange")))
  )
  private[this] lazy val controllers_resetPassword_setNewPassword17_invoker = createInvoker(
    resetPassword_5.setNewPassword,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.resetPassword",
      "setNewPassword",
      Nil,
      "POST",
      this.prefix + """validatePasswordChange""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_signUp_sendSignupSetupPage18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signupsetup")))
  )
  private[this] lazy val controllers_signUp_sendSignupSetupPage18_invoker = createInvoker(
    signUp_4.sendSignupSetupPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.signUp",
      "sendSignupSetupPage",
      Nil,
      "GET",
      this.prefix + """signupsetup""",
      """All methods related to signing up""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_signUp_getSignupInfo19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkingsignup")))
  )
  private[this] lazy val controllers_signUp_getSignupInfo19_invoker = createInvoker(
    signUp_4.getSignupInfo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.signUp",
      "getSignupInfo",
      Nil,
      "POST",
      this.prefix + """checkingsignup""",
      """ We send setup page i.e setupPageOne from this POST request directly
Following are methods to setup""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_setup_getSetUpInfo20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbacksetupinfo")))
  )
  private[this] lazy val controllers_setup_getSetUpInfo20_invoker = createInvoker(
    setup_2.getSetUpInfo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.setup",
      "getSetUpInfo",
      Nil,
      "POST",
      this.prefix + """getbacksetupinfo""",
      """GET		/setupOne					controllers.setup.sendSetUpPage""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_setup_getEmpData21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbackempinfo")))
  )
  private[this] lazy val controllers_setup_getEmpData21_invoker = createInvoker(
    setup_2.getEmpData,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.setup",
      "getEmpData",
      Nil,
      "POST",
      this.prefix + """getbackempinfo""",
      """GET		/setupTwo					controllers.setup.setupPageTwo""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_setup_getAddRoles22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbackAddRoles")))
  )
  private[this] lazy val controllers_setup_getAddRoles22_invoker = createInvoker(
    setup_2.getAddRoles,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.setup",
      "getAddRoles",
      Nil,
      "POST",
      this.prefix + """getbackAddRoles""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_MailerService_send23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendemailnotifications")))
  )
  private[this] lazy val controllers_MailerService_send23_invoker = createInvoker(
    MailerService_8.send,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MailerService",
      "send",
      Nil,
      "GET",
      this.prefix + """sendemailnotifications""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_dashboard_viewDashboard24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewDashboard")))
  )
  private[this] lazy val controllers_dashboard_viewDashboard24_invoker = createInvoker(
    dashboard_1.viewDashboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.dashboard",
      "viewDashboard",
      Nil,
      "GET",
      this.prefix + """viewDashboard""",
      """All methods related to users Dashboard, create a page ,get info from that page, view others pages""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_dashboard_createPage25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPage")))
  )
  private[this] lazy val controllers_dashboard_createPage25_invoker = createInvoker(
    dashboard_1.createPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.dashboard",
      "createPage",
      Nil,
      "GET",
      this.prefix + """createPage""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_dashboard_getPageData26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPageData")))
  )
  private[this] lazy val controllers_dashboard_getPageData26_invoker = createInvoker(
    dashboard_1.getPageData,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.dashboard",
      "getPageData",
      Nil,
      "POST",
      this.prefix + """getPageData""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_dashboard_viewPages27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewPages")))
  )
  private[this] lazy val controllers_dashboard_viewPages27_invoker = createInvoker(
    dashboard_1.viewPages,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.dashboard",
      "viewPages",
      Nil,
      "GET",
      this.prefix + """viewPages""",
      """POST	/getPageDataUpload			controllers.dashboard.upload""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_dashboard_viewMyPages28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewMyPages")))
  )
  private[this] lazy val controllers_dashboard_viewMyPages28_invoker = createInvoker(
    dashboard_1.viewMyPages,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.dashboard",
      "viewMyPages",
      Nil,
      "GET",
      this.prefix + """viewMyPages""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_answerQuery_getQuestionToAnswer29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("answer")))
  )
  private[this] lazy val controllers_answerQuery_getQuestionToAnswer29_invoker = createInvoker(
    answerQuery_3.getQuestionToAnswer(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.answerQuery",
      "getQuestionToAnswer",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """answer""",
      """Methods when user answers a question""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_answerQuery_markWorkingSolution30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("markCorrectSol")))
  )
  private[this] lazy val controllers_answerQuery_markWorkingSolution30_invoker = createInvoker(
    answerQuery_3.markWorkingSolution(fakeValue[Int], fakeValue[String], fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.answerQuery",
      "markWorkingSolution",
      Seq(classOf[Int], classOf[String], classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """markCorrectSol""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_answerQuery_answerThequestion31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("answerquestion")))
  )
  private[this] lazy val controllers_answerQuery_answerThequestion31_invoker = createInvoker(
    answerQuery_3.answerThequestion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.answerQuery",
      "answerThequestion",
      Nil,
      "POST",
      this.prefix + """answerquestion""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_11.index)
      }
  
    // @LINE:9
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_7.count)
      }
  
    // @LINE:11
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_10.message)
      }
  
    // @LINE:14
    case controllers_Assets_versioned3_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned3_invoker.call(Assets_9.versioned(file))
      }
  
    // @LINE:18
    case controllers_meetTheTeam_showTeamPage4_route(params@_) =>
      call { 
        controllers_meetTheTeam_showTeamPage4_invoker.call(meetTheTeam_6.showTeamPage)
      }
  
    // @LINE:19
    case controllers_meetTheTeam_documentation5_route(params@_) =>
      call { 
        controllers_meetTheTeam_documentation5_invoker.call(meetTheTeam_6.documentation)
      }
  
    // @LINE:22
    case controllers_login_loginPage6_route(params@_) =>
      call { 
        controllers_login_loginPage6_invoker.call(login_0.loginPage)
      }
  
    // @LINE:23
    case controllers_login_loginValidate7_route(params@_) =>
      call { 
        controllers_login_loginValidate7_invoker.call(login_0.loginValidate)
      }
  
    // @LINE:24
    case controllers_login_logout8_route(params@_) =>
      call { 
        controllers_login_logout8_invoker.call(login_0.logout)
      }
  
    // @LINE:27
    case controllers_resetPassword_sendOtpChange9_route(params@_) =>
      call { 
        controllers_resetPassword_sendOtpChange9_invoker.call(resetPassword_5.sendOtpChange)
      }
  
    // @LINE:28
    case controllers_resetPassword_sendEmail10_route(params@_) =>
      call { 
        controllers_resetPassword_sendEmail10_invoker.call(resetPassword_5.sendEmail)
      }
  
    // @LINE:29
    case controllers_resetPassword_getOTP11_route(params@_) =>
      call { 
        controllers_resetPassword_getOTP11_invoker.call(resetPassword_5.getOTP)
      }
  
    // @LINE:30
    case controllers_resetPassword_forgetSendPasswordOne12_route(params@_) =>
      call(params.fromQuery[String]("userEmail", None)) { (userEmail) =>
        controllers_resetPassword_forgetSendPasswordOne12_invoker.call(resetPassword_5.forgetSendPasswordOne(userEmail))
      }
  
    // @LINE:31
    case controllers_resetPassword_forgetSendPasswordTwo13_route(params@_) =>
      call { 
        controllers_resetPassword_forgetSendPasswordTwo13_invoker.call(resetPassword_5.forgetSendPasswordTwo)
      }
  
    // @LINE:34
    case controllers_dashboard_changePassWordOne14_route(params@_) =>
      call { 
        controllers_dashboard_changePassWordOne14_invoker.call(dashboard_1.changePassWordOne)
      }
  
    // @LINE:35
    case controllers_dashboard_changePasswordTwo15_route(params@_) =>
      call { 
        controllers_dashboard_changePasswordTwo15_invoker.call(dashboard_1.changePasswordTwo)
      }
  
    // @LINE:38
    case controllers_resetPassword_sendPasswordChangePage16_route(params@_) =>
      call { 
        controllers_resetPassword_sendPasswordChangePage16_invoker.call(resetPassword_5.sendPasswordChangePage)
      }
  
    // @LINE:39
    case controllers_resetPassword_setNewPassword17_route(params@_) =>
      call { 
        controllers_resetPassword_setNewPassword17_invoker.call(resetPassword_5.setNewPassword)
      }
  
    // @LINE:43
    case controllers_signUp_sendSignupSetupPage18_route(params@_) =>
      call { 
        controllers_signUp_sendSignupSetupPage18_invoker.call(signUp_4.sendSignupSetupPage)
      }
  
    // @LINE:48
    case controllers_signUp_getSignupInfo19_route(params@_) =>
      call { 
        controllers_signUp_getSignupInfo19_invoker.call(signUp_4.getSignupInfo)
      }
  
    // @LINE:50
    case controllers_setup_getSetUpInfo20_route(params@_) =>
      call { 
        controllers_setup_getSetUpInfo20_invoker.call(setup_2.getSetUpInfo)
      }
  
    // @LINE:52
    case controllers_setup_getEmpData21_route(params@_) =>
      call { 
        controllers_setup_getEmpData21_invoker.call(setup_2.getEmpData)
      }
  
    // @LINE:53
    case controllers_setup_getAddRoles22_route(params@_) =>
      call { 
        controllers_setup_getAddRoles22_invoker.call(setup_2.getAddRoles)
      }
  
    // @LINE:54
    case controllers_MailerService_send23_route(params@_) =>
      call { 
        controllers_MailerService_send23_invoker.call(MailerService_8.send)
      }
  
    // @LINE:57
    case controllers_dashboard_viewDashboard24_route(params@_) =>
      call { 
        controllers_dashboard_viewDashboard24_invoker.call(dashboard_1.viewDashboard)
      }
  
    // @LINE:58
    case controllers_dashboard_createPage25_route(params@_) =>
      call { 
        controllers_dashboard_createPage25_invoker.call(dashboard_1.createPage)
      }
  
    // @LINE:59
    case controllers_dashboard_getPageData26_route(params@_) =>
      call { 
        controllers_dashboard_getPageData26_invoker.call(dashboard_1.getPageData)
      }
  
    // @LINE:61
    case controllers_dashboard_viewPages27_route(params@_) =>
      call { 
        controllers_dashboard_viewPages27_invoker.call(dashboard_1.viewPages)
      }
  
    // @LINE:62
    case controllers_dashboard_viewMyPages28_route(params@_) =>
      call { 
        controllers_dashboard_viewMyPages28_invoker.call(dashboard_1.viewMyPages)
      }
  
    // @LINE:65
    case controllers_answerQuery_getQuestionToAnswer29_route(params@_) =>
      call(params.fromQuery[String]("bookNametemp", None), params.fromQuery[Int]("qsNo", None)) { (bookNametemp, qsNo) =>
        controllers_answerQuery_getQuestionToAnswer29_invoker.call(answerQuery_3.getQuestionToAnswer(bookNametemp, qsNo))
      }
  
    // @LINE:66
    case controllers_answerQuery_markWorkingSolution30_route(params@_) =>
      call(params.fromQuery[Int]("slno", None), params.fromQuery[String]("bookNameTemp", None), params.fromQuery[Int]("working", None), params.fromQuery[Int]("qsno", None)) { (slno, bookNameTemp, working, qsno) =>
        controllers_answerQuery_markWorkingSolution30_invoker.call(answerQuery_3.markWorkingSolution(slno, bookNameTemp, working, qsno))
      }
  
    // @LINE:67
    case controllers_answerQuery_answerThequestion31_route(params@_) =>
      call { 
        controllers_answerQuery_answerThequestion31_invoker.call(answerQuery_3.answerThequestion)
      }
  }
}
