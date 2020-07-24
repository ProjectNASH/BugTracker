
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

object createUserPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[String],RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* createUserPage Template File */
  def apply/*2.2*/( r :List[String])(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
	    <title>Create Page</title>
	    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	        
	    <!--<link rel="stylesheet" href=""""),_display_(/*11.40*/assetsFinder/*11.52*/.path("stylesheets/utils/signup.css")),format.raw/*11.89*/("""" type="text/css"/>  
		<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*12.55*/assetsFinder/*12.67*/.path("/images/title images/apple-touch-icon.png")),format.raw/*12.117*/("""">
		<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*13.58*/assetsFinder/*13.70*/.path("/images/title images/favicon-32x32.png")),format.raw/*13.117*/("""">
		<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*14.58*/assetsFinder/*14.70*/.path("/images/title images/favicon-16x16.png")),format.raw/*14.117*/("""">
		<link rel="manifest" href=""""),_display_(/*15.31*/assetsFinder/*15.43*/.path("/images/title images/site.webmanifest")),format.raw/*15.89*/("""">-->
	
	        	<!--Write your link and src tags after this comment-->
	        	
	
	</head>
    <body>
		
		
		<form name="getPageInfo" action =""""),_display_(/*24.38*/routes/*24.44*/.dashboard.getPageData),format.raw/*24.66*/("""" method="POST">
		"""),_display_(/*25.4*/helper/*25.10*/.CSRF.formField),format.raw/*25.25*/("""
		"""),format.raw/*26.3*/("""Title: <input type="text" name="pageName" value="" /><br>
		Body:  <input type="text" name="pageBody" value="" /><br>
		Target:<br>
		"""),_display_(/*29.4*/for(data<-r) yield /*29.16*/{_display_(Seq[Any](format.raw/*29.17*/("""		 	
			"""),format.raw/*30.4*/("""<input type="checkbox" name="pageTarget" value=""""),_display_(/*30.53*/data),format.raw/*30.57*/("""" id=""""),_display_(/*30.64*/data),format.raw/*30.68*/(""""/><label for=""""),_display_(/*30.84*/data),format.raw/*30.88*/("""">"""),_display_(/*30.91*/data),format.raw/*30.95*/("""</label><br>		
		""")))}),format.raw/*31.4*/("""
		"""),format.raw/*32.3*/("""<input type = "submit" value = "Submit">
		</form>

    	
        
	    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>  
     
    
</html>


"""))
      }
    }
  }

  def render(r:List[String],request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(r)(request,assetsFinder)

  def f:((List[String]) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (r) => (request,assetsFinder) => apply(r)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-20T00:10:18.137
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/createUserPage.scala.html
                  HASH: 4aa5518737c269d6a5f7deaf3fcea11682dfb567
                  MATRIX: 801->36|953->117|997->133|1024->134|1383->466|1404->478|1462->515|1565->591|1586->603|1658->653|1745->713|1766->725|1835->772|1922->832|1943->844|2012->891|2072->924|2093->936|2160->982|2336->1131|2351->1137|2394->1159|2440->1179|2455->1185|2491->1200|2521->1203|2682->1338|2710->1350|2749->1351|2784->1359|2860->1408|2885->1412|2919->1419|2944->1423|2987->1439|3012->1443|3042->1446|3067->1450|3115->1468|3145->1471
                  LINES: 21->2|24->3|27->4|28->5|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|47->24|47->24|47->24|48->25|48->25|48->25|49->26|52->29|52->29|52->29|53->30|53->30|53->30|53->30|53->30|53->30|53->30|53->30|53->30|54->31|55->32
                  -- GENERATED --
              */
          