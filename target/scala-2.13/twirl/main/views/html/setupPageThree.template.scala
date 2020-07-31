
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
    	 <title>Team Members setup</title>
    	 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    	 <link rel="stylesheet" href=""""),_display_(/*11.37*/assetsFinder/*11.49*/.path("stylesheets/utils/roles.css")),format.raw/*11.85*/(""""></link>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
    	
    	<div class="container-fluid part1">
		<div class="inner">
		<p class="heading">Based on the given Employee data list, we have found the following roles in your organization:</p></br>
		<ul class="sub">
    	"""),_display_(/*20.7*/for(task <- tasks) yield /*20.25*/{_display_(Seq[Any](format.raw/*20.26*/("""
    		"""),format.raw/*21.7*/("""<li>"""),_display_(/*21.12*/task),format.raw/*21.16*/("""</li>
    		""")))}),format.raw/*22.8*/("""
    	"""),format.raw/*23.6*/("""</ul>
    	</br>
    	
    	
    	<form method = "POST" action =""""),_display_(/*27.38*/routes/*27.44*/.setup.getAddRoles),format.raw/*27.62*/("""" id="formSubmit">
		<div class="texts">
				<label for="usr"><span class="heading2">If you would like to add more roles, write them down in the following text-box.(If you want to add multiple write them as XXX, YYY, ZZZ)
    	</span></label></br>
    	
    	
    	
    	"""),_display_(/*34.7*/helper/*34.13*/.CSRF.formField),format.raw/*34.28*/("""
    	"""),format.raw/*35.6*/("""<input type="text" name="addRoles" value="" id ="addRoles"/>
    	</div>
    	<input type="SUBMIT" value="SUBMIT"  class="btn btn-outline-secondary"/>    	
    	</form>
		</div>
		</div>
    	
    	
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>

		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    	
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
                  DATE: 2020-07-31T16:37:39.833
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/setupPageThree.scala.html
                  HASH: 066c825f2c15870606d0ffc34d0e8e083cdebc13
                  MATRIX: 793->28|949->113|993->129|1020->130|1278->361|1299->373|1356->409|1848->875|1882->893|1921->894|1955->901|1987->906|2012->910|2055->923|2088->929|2181->995|2196->1001|2235->1019|2533->1291|2548->1297|2584->1312|2617->1318
                  LINES: 21->2|24->3|27->4|28->5|34->11|34->11|34->11|43->20|43->20|43->20|44->21|44->21|44->21|45->22|46->23|50->27|50->27|50->27|57->34|57->34|57->34|58->35
                  -- GENERATED --
              */
          