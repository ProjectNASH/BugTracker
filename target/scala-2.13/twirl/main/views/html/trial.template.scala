
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

object trial extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.65*/("""
"""),format.raw/*4.1*/("""


"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
<title>Login Form</title>
	<link rel="stylesheet" media="screen" type="text/css" href=""""),_display_(/*11.63*/assetsFinder/*11.75*/.path("stylesheets/utils/trial.css")),format.raw/*11.111*/("""">
	
</head>
<body>
<h1>Its working</h1>

	
  	<form action = """"),_display_(/*18.21*/routes/*18.27*/.HomeController.upload),format.raw/*18.49*/("""" method ="POST" enctype="multipart/form-data">
  	"""),_display_(/*19.5*/helper/*19.11*/.CSRF.formField),format.raw/*19.26*/("""
    """),format.raw/*20.5*/("""<input type="file" name="picture">
    
    <p>
        <input type="submit">
    </p>
    </form>
   
    


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
                  DATE: 2020-07-15T18:47:24.504
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/trial.scala.html
                  HASH: 4220beca798954295704a3cce1ef2f9f72b33fd5
                  MATRIX: 771->29|907->95|952->92|980->112|1012->118|1171->250|1192->262|1250->298|1348->369|1363->375|1406->397|1485->450|1500->456|1536->471|1569->477
                  LINES: 21->2|24->3|27->2|28->4|31->7|35->11|35->11|35->11|42->18|42->18|42->18|43->19|43->19|43->19|44->20
                  -- GENERATED --
              */
          