
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

object setupPageThree extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[String],RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/(tasks : List[String])(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    </head>
    <body>
    	Based on the given Employee data list, we have found the following roles in your organization
    	<ul>
    	"""),_display_(/*14.7*/for(task <- tasks) yield /*14.25*/{_display_(Seq[Any](format.raw/*14.26*/("""
    		"""),format.raw/*15.7*/("""<li>"""),_display_(/*15.12*/task),format.raw/*15.16*/("""</li>
    		""")))}),format.raw/*16.8*/("""
    	"""),format.raw/*17.6*/("""</ul>
    	If you would like to add more roles, write them down in the following text-box.(If you want to add multiple write them as XXX, YYY, ZZZ)
    	<form method = "POST" action =""""),_display_(/*19.38*/routes/*19.44*/.setup.getAddRoles),format.raw/*19.62*/("""" id="formSubmit">
    	"""),_display_(/*20.7*/helper/*20.13*/.CSRF.formField),format.raw/*20.28*/("""
    	"""),format.raw/*21.6*/("""<input type="text" name="addRoles" value="" id ="addRoles"/>
    	<input type="SUBMIT" value="SUBMIT" />    	
    	</form>
    	
    	

    	
    </body>
</html>"""))
      }
    }
  }

  def render(tasks:List[String],request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(tasks)(request,assetsFinder)

  def f:((List[String]) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => (request,assetsFinder) => apply(tasks)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-15T18:47:24.451
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/setupPageThree.scala.html
                  HASH: 2e9fd74cbd7e20a652e25e744d1c93f8fc7c4360
                  MATRIX: 793->28|949->113|993->129|1020->130|1338->422|1372->440|1411->441|1445->448|1477->453|1502->457|1545->470|1578->476|1790->661|1805->667|1844->685|1895->710|1910->716|1946->731|1979->737
                  LINES: 21->2|24->3|27->4|28->5|37->14|37->14|37->14|38->15|38->15|38->15|39->16|40->17|42->19|42->19|42->19|43->20|43->20|43->20|44->21
                  -- GENERATED --
              */
          