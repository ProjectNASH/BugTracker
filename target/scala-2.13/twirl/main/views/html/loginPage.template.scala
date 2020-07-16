
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
			"""),format.raw/*26.4*/("""<p>Username</p>
			<input type="text" name="username" placeholder="Enter Username">
			<p>Password</p>
			<input type="password" name="password" placeholder="Enter Password">
			<input type="submit" name="submit" value="Login">
			<a href="#">Lost Your Password?</a><br>
			<a href="#">Create Account</a>
			</form>
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
                  DATE: 2020-07-15T18:47:24.408
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/loginPage.scala.html
                  HASH: 4055e7e0e3f0b8429195ef691058f17867812d3b
                  MATRIX: 775->28|911->93|955->109|984->112|1139->240|1160->252|1222->292|1307->350|1328->362|1400->412|1486->471|1507->483|1576->530|1662->589|1683->601|1752->648|1811->680|1832->692|1899->738|1983->795|2004->807|2053->835|2154->909|2169->915|2212->937|2245->944|2260->950|2296->965|2327->969
                  LINES: 21->2|24->3|27->4|30->7|34->11|34->11|34->11|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|45->22|45->22|45->22|47->24|47->24|47->24|48->25|48->25|48->25|49->26
                  -- GENERATED --
              */
          