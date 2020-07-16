// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Wed Jul 15 18:47:23 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_6: controllers.HomeController,
  // @LINE:9
  CountController_3: controllers.CountController,
  // @LINE:11
  AsyncController_5: controllers.AsyncController,
  // @LINE:14
  Assets_4: controllers.Assets,
  // @LINE:16
  login_0: controllers.login,
  // @LINE:20
  signUp_2: controllers.signUp,
  // @LINE:27
  setup_1: controllers.setup,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_6: controllers.HomeController,
    // @LINE:9
    CountController_3: controllers.CountController,
    // @LINE:11
    AsyncController_5: controllers.AsyncController,
    // @LINE:14
    Assets_4: controllers.Assets,
    // @LINE:16
    login_0: controllers.login,
    // @LINE:20
    signUp_2: controllers.signUp,
    // @LINE:27
    setup_1: controllers.setup
  ) = this(errorHandler, HomeController_6, CountController_3, AsyncController_5, Assets_4, login_0, signUp_2, setup_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_6, CountController_3, AsyncController_5, Assets_4, login_0, signUp_2, setup_1, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.signUp.sendSignupPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkingsignup""", """controllers.signUp.getSignupInfo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbacksetupinfo""", """controllers.setup.getSetUpInfo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbackempinfo""", """controllers.setup.getEmpData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbackAddRoles""", """controllers.setup.getAddRoles"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewDashboard""", """controllers.login.viewDashboard"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trial1""", """controllers.HomeController.upload"""),
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
    HomeController_6.index,
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
    HomeController_6.trialPage,
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
    CountController_3.count,
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
    AsyncController_5.message,
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
    Assets_4.versioned(fakeValue[String]),
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

  // @LINE:16
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
      """""",
      Seq()
    )
  )

  // @LINE:17
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

  // @LINE:20
  private[this] lazy val controllers_signUp_sendSignupPage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_signUp_sendSignupPage7_invoker = createInvoker(
    signUp_2.sendSignupPage,
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

  // @LINE:23
  private[this] lazy val controllers_signUp_getSignupInfo8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkingsignup")))
  )
  private[this] lazy val controllers_signUp_getSignupInfo8_invoker = createInvoker(
    signUp_2.getSignupInfo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.signUp",
      "getSignupInfo",
      Nil,
      "POST",
      this.prefix + """checkingsignup""",
      """ We send setup page i.e setupPageOne from this POST request directly""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_setup_getSetUpInfo9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbacksetupinfo")))
  )
  private[this] lazy val controllers_setup_getSetUpInfo9_invoker = createInvoker(
    setup_1.getSetUpInfo,
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

  // @LINE:29
  private[this] lazy val controllers_setup_getEmpData10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbackempinfo")))
  )
  private[this] lazy val controllers_setup_getEmpData10_invoker = createInvoker(
    setup_1.getEmpData,
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

  // @LINE:30
  private[this] lazy val controllers_setup_getAddRoles11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbackAddRoles")))
  )
  private[this] lazy val controllers_setup_getAddRoles11_invoker = createInvoker(
    setup_1.getAddRoles,
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

  // @LINE:32
  private[this] lazy val controllers_login_viewDashboard12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewDashboard")))
  )
  private[this] lazy val controllers_login_viewDashboard12_invoker = createInvoker(
    login_0.viewDashboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.login",
      "viewDashboard",
      Nil,
      "GET",
      this.prefix + """viewDashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HomeController_upload13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trial1")))
  )
  private[this] lazy val controllers_HomeController_upload13_invoker = createInvoker(
    HomeController_6.upload,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "upload",
      Nil,
      "POST",
      this.prefix + """trial1""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_6.index)
      }
  
    // @LINE:7
    case controllers_HomeController_trialPage1_route(params@_) =>
      call { 
        controllers_HomeController_trialPage1_invoker.call(HomeController_6.trialPage)
      }
  
    // @LINE:9
    case controllers_CountController_count2_route(params@_) =>
      call { 
        controllers_CountController_count2_invoker.call(CountController_3.count)
      }
  
    // @LINE:11
    case controllers_AsyncController_message3_route(params@_) =>
      call { 
        controllers_AsyncController_message3_invoker.call(AsyncController_5.message)
      }
  
    // @LINE:14
    case controllers_Assets_versioned4_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned4_invoker.call(Assets_4.versioned(file))
      }
  
    // @LINE:16
    case controllers_login_loginPage5_route(params@_) =>
      call { 
        controllers_login_loginPage5_invoker.call(login_0.loginPage)
      }
  
    // @LINE:17
    case controllers_login_loginValidate6_route(params@_) =>
      call { 
        controllers_login_loginValidate6_invoker.call(login_0.loginValidate)
      }
  
    // @LINE:20
    case controllers_signUp_sendSignupPage7_route(params@_) =>
      call { 
        controllers_signUp_sendSignupPage7_invoker.call(signUp_2.sendSignupPage)
      }
  
    // @LINE:23
    case controllers_signUp_getSignupInfo8_route(params@_) =>
      call { 
        controllers_signUp_getSignupInfo8_invoker.call(signUp_2.getSignupInfo)
      }
  
    // @LINE:27
    case controllers_setup_getSetUpInfo9_route(params@_) =>
      call { 
        controllers_setup_getSetUpInfo9_invoker.call(setup_1.getSetUpInfo)
      }
  
    // @LINE:29
    case controllers_setup_getEmpData10_route(params@_) =>
      call { 
        controllers_setup_getEmpData10_invoker.call(setup_1.getEmpData)
      }
  
    // @LINE:30
    case controllers_setup_getAddRoles11_route(params@_) =>
      call { 
        controllers_setup_getAddRoles11_invoker.call(setup_1.getAddRoles)
      }
  
    // @LINE:32
    case controllers_login_viewDashboard12_route(params@_) =>
      call { 
        controllers_login_viewDashboard12_invoker.call(login_0.viewDashboard)
      }
  
    // @LINE:39
    case controllers_HomeController_upload13_route(params@_) =>
      call { 
        controllers_HomeController_upload13_invoker.call(HomeController_6.upload)
      }
  }
}
