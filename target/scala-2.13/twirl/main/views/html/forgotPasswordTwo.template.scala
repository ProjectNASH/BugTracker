
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

object forgotPasswordTwo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* forgotPasswordTwo Template File */
  def apply/*2.2*/(bookname:String)(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
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
		<p class="heading">Enter OTP</p></br>
	
    	</br>
    	
    	
    	<form action = """"),_display_(/*23.23*/routes/*23.29*/.resetPassword.getOTP),format.raw/*23.50*/("""" method ="POST" >
    	"""),_display_(/*24.7*/helper/*24.13*/.CSRF.formField),format.raw/*24.28*/("""
		"""),format.raw/*25.3*/("""<div class="texts">
				<label for="usr"><span class="heading2">
				We have sent you an OTP to the registered email id. Please enter the OTP in the following text box. OTP expires in 10minutes.<br>
				<b>NOTE:</b>After entering the OTP, all bugTracker session will expire. 
    	</span></label><br>   	
    	
  	
  	
			
			OTP<input type="text" id="otpstring" name="otpstring">
			<input type="hidden" value=""""),_display_(/*35.33*/bookname),format.raw/*35.41*/("""" name="userEmail" />
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

  def render(bookname:String,request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(bookname)(request,assetsFinder)

  def f:((String) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (bookname) => (request,assetsFinder) => apply(bookname)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-25T03:04:25.117
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/forgotPasswordTwo.scala.html
                  HASH: 6175bf9bedae00f59e3989ac23eea64d40b18377
                  MATRIX: 801->39|952->119|996->135|1023->136|1281->367|1302->379|1359->415|1789->818|1804->824|1846->845|1897->870|1912->876|1948->891|1978->894|2418->1307|2447->1315
                  LINES: 21->2|24->3|27->4|28->5|34->11|34->11|34->11|46->23|46->23|46->23|47->24|47->24|47->24|48->25|58->35|58->35
                  -- GENERATED --
              */
          