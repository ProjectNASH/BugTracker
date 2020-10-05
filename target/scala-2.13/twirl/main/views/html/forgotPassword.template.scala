
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

object forgotPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* errorPageTwo Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="utf-8">
    	 <title>Forgot Password</title>
    	 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    	 <link rel="stylesheet" href=""""),_display_(/*11.37*/assetsFinder/*11.49*/.path("stylesheets/utils/roles.css")),format.raw/*11.85*/(""""></link>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
    	
    	<div class="container-fluid part1">
		<div class="inner">
		<p class="heading">Forgot Password?</p></br>
	
    	</br>
    	
    	
    	<form action = """"),_display_(/*23.23*/routes/*23.29*/.resetPassword.sendEmail),format.raw/*23.53*/("""" method ="POST" >
    	"""),_display_(/*24.7*/helper/*24.13*/.CSRF.formField),format.raw/*24.28*/("""
		"""),format.raw/*25.3*/("""<div class="texts">
				<label for="usr"><span class="heading2">
				Please Enter the email id which is registered with BugTracker. (You can contact your System Adminstrator to know with which email you were registered)
    	</span></label></br>   	
    	
  	
  	
			
			Email: &nbsp;<input type="email" id="email" name="email">
			<input type="submit">
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

  def render(request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply()(request,assetsFinder)

  def f:(() => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = () => (request,assetsFinder) => apply()(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-26T01:00:54.077
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/forgotPassword.scala.html
                  HASH: 85eee286a9b6419d51509a5c8f6da4ae10997706
                  MATRIX: 786->34|922->99|966->115|993->116|1248->344|1269->356|1326->392|1763->802|1778->808|1823->832|1874->857|1889->863|1925->878|1955->881
                  LINES: 21->2|24->3|27->4|28->5|34->11|34->11|34->11|46->23|46->23|46->23|47->24|47->24|47->24|48->25
                  -- GENERATED --
              */
          