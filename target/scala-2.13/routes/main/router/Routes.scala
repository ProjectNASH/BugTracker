// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Fri Jul 31 16:04:07 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_10: controllers.HomeController,
  // @LINE:9
  CountController_6: controllers.CountController,
  // @LINE:11
  AsyncController_9: controllers.AsyncController,
  // @LINE:14
  Assets_8: controllers.Assets,
  // @LINE:18
  meetTheTeam_5: controllers.meetTheTeam,
  // @LINE:21
  login_0: controllers.login,
  // @LINE:25
  signUp_4: controllers.signUp,
  // @LINE:32
  setup_2: controllers.setup,
  // @LINE:38
  dashboard_1: controllers.dashboard,
  // @LINE:44
  answerQuery_3: controllers.answerQuery,
  // @LINE:49
  MailerService_7: controllers.MailerService,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_10: controllers.HomeController,
    // @LINE:9
    CountController_6: controllers.CountController,
    // @LINE:11
    AsyncController_9: controllers.AsyncController,
    // @LINE:14
    Assets_8: controllers.Assets,
    // @LINE:18
    meetTheTeam_5: controllers.meetTheTeam,
    // @LINE:21
    login_0: controllers.login,
    // @LINE:25
    signUp_4: controllers.signUp,
    // @LINE:32
    setup_2: controllers.setup,
    // @LINE:38
    dashboard_1: controllers.dashboard,
    // @LINE:44
    answerQuery_3: controllers.answerQuery,
    // @LINE:49
    MailerService_7: controllers.MailerService
  ) = this(errorHandler, HomeController_10, CountController_6, AsyncController_9, Assets_8, meetTheTeam_5, login_0, signUp_4, setup_2, dashboard_1, answerQuery_3, MailerService_7, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_10, CountController_6, AsyncController_9, Assets_8, meetTheTeam_5, login_0, signUp_4, setup_2, dashboard_1, answerQuery_3, MailerService_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trial""", """controllers.HomeController.trialPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meetTheTeam""", """controllers.meetTheTeam.showTeamPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.login.loginPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkinglogin""", """controllers.login.loginValidate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signupsetup""", """controllers.signUp.sendSignupSetupPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.signUp.sendSignupPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkingsignup""", """controllers.signUp.getSignupInfo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbacksetupinfo""", """controllers.setup.getSetUpInfo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbackempinfo""", """controllers.setup.getEmpData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbackAddRoles""", """controllers.setup.getAddRoles"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewDashboard""", """controllers.dashboard.viewDashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createPage""", """controllers.dashboard.createPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getPageData""", """controllers.dashboard.getPageData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewPages""", """controllers.dashboard.viewPages"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """answer""", """controllers.answerQuery.getQuestionToAnswer(bookNametemp:String, qsNo:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trial1""", """controllers.HomeController.upload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trial3""", """controllers.MailerService.send()"""),
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
    HomeController_10.index,
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

  // @LINE:7
  private[this] lazy val controllers_HomeController_trialPage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trial")))
  )
  private[this] lazy val controllers_HomeController_trialPage1_invoker = createInvoker(
    HomeController_10.trialPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "trialPage",
      Nil,
      "GET",
      this.prefix + """trial""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CountController_count2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count2_invoker = createInvoker(
    CountController_6.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AsyncController_message3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message3_invoker = createInvoker(
    AsyncController_9.message,
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
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_8.versioned(fakeValue[String]),
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
  private[this] lazy val controllers_meetTheTeam_showTeamPage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meetTheTeam")))
  )
  private[this] lazy val controllers_meetTheTeam_showTeamPage5_invoker = createInvoker(
    meetTheTeam_5.showTeamPage,
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

  // @LINE:21
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

  // @LINE:22
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

  // @LINE:25
  private[this] lazy val controllers_signUp_sendSignupSetupPage8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signupsetup")))
  )
  private[this] lazy val controllers_signUp_sendSignupSetupPage8_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_signUp_sendSignupPage9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_signUp_sendSignupPage9_invoker = createInvoker(
    signUp_4.sendSignupPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.signUp",
      "sendSignupPage",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_signUp_getSignupInfo10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkingsignup")))
  )
  private[this] lazy val controllers_signUp_getSignupInfo10_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_setup_getSetUpInfo11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbacksetupinfo")))
  )
  private[this] lazy val controllers_setup_getSetUpInfo11_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_setup_getEmpData12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbackempinfo")))
  )
  private[this] lazy val controllers_setup_getEmpData12_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_setup_getAddRoles13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbackAddRoles")))
  )
  private[this] lazy val controllers_setup_getAddRoles13_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_dashboard_viewDashboard14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewDashboard")))
  )
  private[this] lazy val controllers_dashboard_viewDashboard14_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_dashboard_createPage15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPage")))
  )
  private[this] lazy val controllers_dashboard_createPage15_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_dashboard_getPageData16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPageData")))
  )
  private[this] lazy val controllers_dashboard_getPageData16_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_dashboard_viewPages17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewPages")))
  )
  private[this] lazy val controllers_dashboard_viewPages17_invoker = createInvoker(
    dashboard_1.viewPages,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.dashboard",
      "viewPages",
      Nil,
      "GET",
      this.prefix + """viewPages""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_answerQuery_getQuestionToAnswer18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("answer")))
  )
  private[this] lazy val controllers_answerQuery_getQuestionToAnswer18_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_HomeController_upload19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trial1")))
  )
  private[this] lazy val controllers_HomeController_upload19_invoker = createInvoker(
    HomeController_10.upload,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "upload",
      Nil,
      "POST",
      this.prefix + """trial1""",
      """Following are for test purposes
GET		/trial					controllers.HomeController.trialPage	""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_MailerService_send20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trial3")))
  )
  private[this] lazy val controllers_MailerService_send20_invoker = createInvoker(
    MailerService_7.send(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MailerService",
      "send",
      Nil,
      "GET",
      this.prefix + """trial3""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_10.index)
      }
  
    // @LINE:7
    case controllers_HomeController_trialPage1_route(params@_) =>
      call { 
        controllers_HomeController_trialPage1_invoker.call(HomeController_10.trialPage)
      }
  
    // @LINE:9
    case controllers_CountController_count2_route(params@_) =>
      call { 
        controllers_CountController_count2_invoker.call(CountController_6.count)
      }
  
    // @LINE:11
    case controllers_AsyncController_message3_route(params@_) =>
      call { 
        controllers_AsyncController_message3_invoker.call(AsyncController_9.message)
      }
  
    // @LINE:14
    case controllers_Assets_versioned4_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned4_invoker.call(Assets_8.versioned(file))
      }
  
    // @LINE:18
    case controllers_meetTheTeam_showTeamPage5_route(params@_) =>
      call { 
        controllers_meetTheTeam_showTeamPage5_invoker.call(meetTheTeam_5.showTeamPage)
      }
  
    // @LINE:21
    case controllers_login_loginPage6_route(params@_) =>
      call { 
        controllers_login_loginPage6_invoker.call(login_0.loginPage)
      }
  
    // @LINE:22
    case controllers_login_loginValidate7_route(params@_) =>
      call { 
        controllers_login_loginValidate7_invoker.call(login_0.loginValidate)
      }
  
    // @LINE:25
    case controllers_signUp_sendSignupSetupPage8_route(params@_) =>
      call { 
        controllers_signUp_sendSignupSetupPage8_invoker.call(signUp_4.sendSignupSetupPage)
      }
  
    // @LINE:26
    case controllers_signUp_sendSignupPage9_route(params@_) =>
      call { 
        controllers_signUp_sendSignupPage9_invoker.call(signUp_4.sendSignupPage)
      }
  
    // @LINE:30
    case controllers_signUp_getSignupInfo10_route(params@_) =>
      call { 
        controllers_signUp_getSignupInfo10_invoker.call(signUp_4.getSignupInfo)
      }
  
    // @LINE:32
    case controllers_setup_getSetUpInfo11_route(params@_) =>
      call { 
        controllers_setup_getSetUpInfo11_invoker.call(setup_2.getSetUpInfo)
      }
  
    // @LINE:34
    case controllers_setup_getEmpData12_route(params@_) =>
      call { 
        controllers_setup_getEmpData12_invoker.call(setup_2.getEmpData)
      }
  
    // @LINE:35
    case controllers_setup_getAddRoles13_route(params@_) =>
      call { 
        controllers_setup_getAddRoles13_invoker.call(setup_2.getAddRoles)
      }
  
    // @LINE:38
    case controllers_dashboard_viewDashboard14_route(params@_) =>
      call { 
        controllers_dashboard_viewDashboard14_invoker.call(dashboard_1.viewDashboard)
      }
  
    // @LINE:39
    case controllers_dashboard_createPage15_route(params@_) =>
      call { 
        controllers_dashboard_createPage15_invoker.call(dashboard_1.createPage)
      }
  
    // @LINE:40
    case controllers_dashboard_getPageData16_route(params@_) =>
      call { 
        controllers_dashboard_getPageData16_invoker.call(dashboard_1.getPageData)
      }
  
    // @LINE:41
    case controllers_dashboard_viewPages17_route(params@_) =>
      call { 
        controllers_dashboard_viewPages17_invoker.call(dashboard_1.viewPages)
      }
  
    // @LINE:44
    case controllers_answerQuery_getQuestionToAnswer18_route(params@_) =>
      call(params.fromQuery[String]("bookNametemp", None), params.fromQuery[Int]("qsNo", None)) { (bookNametemp, qsNo) =>
        controllers_answerQuery_getQuestionToAnswer18_invoker.call(answerQuery_3.getQuestionToAnswer(bookNametemp, qsNo))
      }
  
    // @LINE:48
    case controllers_HomeController_upload19_route(params@_) =>
      call { 
        controllers_HomeController_upload19_invoker.call(HomeController_10.upload)
      }
  
    // @LINE:49
    case controllers_MailerService_send20_route(params@_) =>
      call { 
        controllers_MailerService_send20_invoker.call(MailerService_7.send())
      }
  }
}
