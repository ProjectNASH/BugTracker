
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

object trial extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Int,String,String,RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/(qsNo: Int, bookname:String,pageTarget: String)(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.110*/("""
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
    
   
    
  	<form action = """"),_display_(/*29.21*/routes/*29.27*/.answerQuery.answerThequestion),format.raw/*29.57*/("""" method ="POST" enctype="multipart/form-data">
  	"""),_display_(/*30.5*/helper/*30.11*/.CSRF.formField),format.raw/*30.26*/("""
    	
		"""),format.raw/*32.3*/("""<textarea name = "answer"></textarea>
		<br>
		<input type="file" name="picture">
		<input type="number" name="qsNo" value=""""),_display_(/*35.44*/qsNo),format.raw/*35.48*/("""">
		<ul>
		"""),_display_(/*37.4*/for(target<-pageTarget) yield /*37.27*/{_display_(Seq[Any](format.raw/*37.28*/("""
				
		""")))}),format.raw/*39.4*/("""
		"""),format.raw/*40.3*/("""</ul>
		<input type="text" name="bookname" value=""""),_display_(/*41.46*/bookname),format.raw/*41.54*/("""">
		<input type="text" name="bookname" value=""""),_display_(/*42.46*/pageTarget),format.raw/*42.56*/("""">
		<input type="submit">
	</form>
    
   
    


</html>

	

"""))
      }
    }
  }

  def render(qsNo:Int,bookname:String,pageTarget:String,request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(qsNo,bookname,pageTarget)(request,assetsFinder)

  def f:((Int,String,String) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (qsNo,bookname,pageTarget) => (request,assetsFinder) => apply(qsNo,bookname,pageTarget)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-06T17:10:27.121
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/trial.scala.html
                  HASH: 0ae51e48e46bd4a3f1610052ef20cee21965dc3f
                  MATRIX: 789->29|970->140|1016->137|1044->157|1076->163|1235->295|1256->307|1314->343|1412->414|1427->420|1470->442|1549->495|1564->501|1600->516|1633->522|1802->664|1817->670|1868->700|1947->753|1962->759|1998->774|2036->785|2191->913|2216->917|2257->932|2296->955|2335->956|2376->967|2407->971|2486->1023|2515->1031|2591->1080|2622->1090
                  LINES: 21->2|24->3|27->2|28->4|31->7|35->11|35->11|35->11|42->18|42->18|42->18|43->19|43->19|43->19|44->20|53->29|53->29|53->29|54->30|54->30|54->30|56->32|59->35|59->35|61->37|61->37|61->37|63->39|64->40|65->41|65->41|66->42|66->42
                  -- GENERATED --
              */
          