
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object loginPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""


"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
<title>Login Form</title>
	<link rel="stylesheet" media="screen" type="text/css" href=""""),_display_(/*11.63*/assetsFinder/*11.75*/.path("stylesheets/utils/loginPage.css")),format.raw/*11.115*/("""">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css" integrity="sha384-HzLeBuhoNPvSl5KYnjx0BT+WB0QEEqLprO+NBkkk5gbc67FTaL7XIGa2w1L0Xbgc" crossorigin="anonymous">
	<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*13.54*/assetsFinder/*13.66*/.path("/images/title images/apple-touch-icon.png")),format.raw/*13.116*/("""">
	<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*14.57*/assetsFinder/*14.69*/.path("/images/title images/favicon-32x32.png")),format.raw/*14.116*/("""">
	<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*15.57*/assetsFinder/*15.69*/.path("/images/title images/favicon-16x16.png")),format.raw/*15.116*/("""">
	<link rel="manifest" href=""""),_display_(/*16.30*/assetsFinder/*16.42*/.path("/images/title images/site.webmanifest")),format.raw/*16.88*/("""">
	
	
</head>
<body>
		<div class="login">
		<img src=""""),_display_(/*22.14*/assetsFinder/*22.26*/.path("/images/images.jpeg")),format.raw/*22.54*/("""" class="bug">
			<h1> Login Here</h1>
			<form method ="POST" action = """"),_display_(/*24.36*/routes/*24.42*/.login.loginValidate()),format.raw/*24.64*/("""">
			"""),_display_(/*25.5*/helper/*25.11*/.CSRF.formField),format.raw/*25.26*/("""
			"""),format.raw/*26.4*/("""<p>Email/Username</p>
			<input type="text" name="username" placeholder="Enter Username">
			<p>Password</p>
			<input type="password" name="password" placeholder="Enter Password">
			<input type="submit" name="submit" value="Login">
			</form>
			<a href=""""),_display_(/*32.14*/routes/*32.20*/.resetPassword.sendOtpChange),format.raw/*32.48*/("""">
			Lost Your Password?</a><br>
			<!-- <a href="#">Create Account</a> -->
			
		</div>
</body>
<script>
	
</script>
</html>

	

"""))
      }
    }
  }

  def render(request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply()(request,assetsFinder)

  def f:(() => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = () => (request,assetsFinder) => apply()(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-27T23:46:42.037
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/loginPage.scala.html
                  HASH: 79655d22207d442bd9f6417542e2ebd28d05645c
                  MATRIX: 775->28|911->93|955->109|984->112|1139->240|1160->252|1222->292|1502->545|1523->557|1595->607|1681->666|1702->678|1771->725|1857->784|1878->796|1947->843|2006->875|2027->887|2094->933|2178->990|2199->1002|2248->1030|2349->1104|2364->1110|2407->1132|2440->1139|2455->1145|2491->1160|2522->1164|2807->1422|2822->1428|2871->1456
                  LINES: 21->2|24->3|27->4|30->7|34->11|34->11|34->11|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|45->22|45->22|45->22|47->24|47->24|47->24|48->25|48->25|48->25|49->26|55->32|55->32|55->32
                  -- GENERATED --
              */
          