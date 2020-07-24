// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Fri Jul 24 16:38:29 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_8: controllers.HomeController,
  // @LINE:9
  CountController_4: controllers.CountController,
  // @LINE:11
  AsyncController_7: controllers.AsyncController,
  // @LINE:14
  Assets_6: controllers.Assets,
  // @LINE:18
  login_0: controllers.login,
  // @LINE:22
  signUp_3: controllers.signUp,
  // @LINE:29
  setup_2: controllers.setup,
  // @LINE:35
  dashboard_1: controllers.dashboard,
  // @LINE:44
  MailerService_5: controllers.MailerService,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_8: controllers.HomeController,
    // @LINE:9
    CountController_4: controllers.CountController,
    // @LINE:11
    AsyncController_7: controllers.AsyncController,
    // @LINE:14
    Assets_6: controllers.Assets,
    // @LINE:18
    login_0: controllers.login,
    // @LINE:22
    signUp_3: controllers.signUp,
    // @LINE:29
    setup_2: controllers.setup,
    // @LINE:35
    dashboard_1: controllers.dashboard,
    // @LINE:44
    MailerService_5: controllers.MailerService
  ) = this(errorHandler, HomeController_8, CountController_4, AsyncController_7, Assets_6, login_0, signUp_3, setup_2, dashboard_1, MailerService_5, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_8, CountController_4, AsyncController_7, Assets_6, login_0, signUp_3, setup_2, dashboard_1, MailerService_5, prefix)
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
    HomeController_8.index,
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
    HomeController_8.trialPage,
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
    CountController_4.count,
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
    AsyncController_7.message,
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
    Assets_6.versioned(fakeValue[String]),
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
  private[this] lazy val controllers_login_loginPage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_login_loginPage5_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_login_loginValidate6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkinglogin")))
  )
  private[this] lazy val controllers_login_loginValidate6_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_signUp_sendSignupSetupPage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signupsetup")))
  )
  private[this] lazy val controllers_signUp_sendSignupSetupPage7_invoker = createInvoker(
    signUp_3.sendSignupSetupPage,
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

  // @LINE:23
  private[this] lazy val controllers_signUp_sendSignupPage8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_signUp_sendSignupPage8_invoker = createInvoker(
    signUp_3.sendSignupPage,
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

  // @LINE:27
  private[this] lazy val controllers_signUp_getSignupInfo9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkingsignup")))
  )
  private[this] lazy val controllers_signUp_getSignupInfo9_invoker = createInvoker(
    signUp_3.getSignupInfo,
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

  // @LINE:29
  private[this] lazy val controllers_setup_getSetUpInfo10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbacksetupinfo")))
  )
  private[this] lazy val controllers_setup_getSetUpInfo10_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_setup_getEmpData11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbackempinfo")))
  )
  private[this] lazy val controllers_setup_getEmpData11_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_setup_getAddRoles12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbackAddRoles")))
  )
  private[this] lazy val controllers_setup_getAddRoles12_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_dashboard_viewDashboard13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewDashboard")))
  )
  private[this] lazy val controllers_dashboard_viewDashboard13_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_dashboard_createPage14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPage")))
  )
  private[this] lazy val controllers_dashboard_createPage14_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_dashboard_getPageData15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPageData")))
  )
  private[this] lazy val controllers_dashboard_getPageData15_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_dashboard_viewPages16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewPages")))
  )
  private[this] lazy val controllers_dashboard_viewPages16_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_HomeController_upload17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trial1")))
  )
  private[this] lazy val controllers_HomeController_upload17_invoker = createInvoker(
    HomeController_8.upload,
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

  // @LINE:44
  private[this] lazy val controllers_MailerService_send18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trial3")))
  )
  private[this] lazy val controllers_MailerService_send18_invoker = createInvoker(
    MailerService_5.send(),
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
        controllers_HomeController_index0_invoker.call(HomeController_8.index)
      }
  
    // @LINE:7
    case controllers_HomeController_trialPage1_route(params@_) =>
      call { 
        controllers_HomeController_trialPage1_invoker.call(HomeController_8.trialPage)
      }
  
    // @LINE:9
    case controllers_CountController_count2_route(params@_) =>
      call { 
        controllers_CountController_count2_invoker.call(CountController_4.count)
      }
  
    // @LINE:11
    case controllers_AsyncController_message3_route(params@_) =>
      call { 
        controllers_AsyncController_message3_invoker.call(AsyncController_7.message)
      }
  
    // @LINE:14
    case controllers_Assets_versioned4_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned4_invoker.call(Assets_6.versioned(file))
      }
  
    // @LINE:18
    case controllers_login_loginPage5_route(params@_) =>
      call { 
        controllers_login_loginPage5_invoker.call(login_0.loginPage)
      }
  
    // @LINE:19
    case controllers_login_loginValidate6_route(params@_) =>
      call { 
        controllers_login_loginValidate6_invoker.call(login_0.loginValidate)
      }
  
    // @LINE:22
    case controllers_signUp_sendSignupSetupPage7_route(params@_) =>
      call { 
        controllers_signUp_sendSignupSetupPage7_invoker.call(signUp_3.sendSignupSetupPage)
      }
  
    // @LINE:23
    case controllers_signUp_sendSignupPage8_route(params@_) =>
      call { 
        controllers_signUp_sendSignupPage8_invoker.call(signUp_3.sendSignupPage)
      }
  
    // @LINE:27
    case controllers_signUp_getSignupInfo9_route(params@_) =>
      call { 
        controllers_signUp_getSignupInfo9_invoker.call(signUp_3.getSignupInfo)
      }
  
    // @LINE:29
    case controllers_setup_getSetUpInfo10_route(params@_) =>
      call { 
        controllers_setup_getSetUpInfo10_invoker.call(setup_2.getSetUpInfo)
      }
  
    // @LINE:31
    case controllers_setup_getEmpData11_route(params@_) =>
      call { 
        controllers_setup_getEmpData11_invoker.call(setup_2.getEmpData)
      }
  
    // @LINE:32
    case controllers_setup_getAddRoles12_route(params@_) =>
      call { 
        controllers_setup_getAddRoles12_invoker.call(setup_2.getAddRoles)
      }
  
    // @LINE:35
    case controllers_dashboard_viewDashboard13_route(params@_) =>
      call { 
        controllers_dashboard_viewDashboard13_invoker.call(dashboard_1.viewDashboard)
      }
  
    // @LINE:36
    case controllers_dashboard_createPage14_route(params@_) =>
      call { 
        controllers_dashboard_createPage14_invoker.call(dashboard_1.createPage)
      }
  
    // @LINE:37
    case controllers_dashboard_getPageData15_route(params@_) =>
      call { 
        controllers_dashboard_getPageData15_invoker.call(dashboard_1.getPageData)
      }
  
    // @LINE:38
    case controllers_dashboard_viewPages16_route(params@_) =>
      call { 
        controllers_dashboard_viewPages16_invoker.call(dashboard_1.viewPages)
      }
  
    // @LINE:43
    case controllers_HomeController_upload17_route(params@_) =>
      call { 
        controllers_HomeController_upload17_invoker.call(HomeController_8.upload)
      }
  
    // @LINE:44
    case controllers_MailerService_send18_route(params@_) =>
      call { 
        controllers_MailerService_send18_invoker.call(MailerService_5.send())
      }
  }
}
