
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

object viewPages extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Map[String, List[scala.Tuple3[Int, String, String]]],RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* viewPages Template File */
  def apply/*2.2*/(userToBookMap : Map[String,List[(Int,String,String)]])(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
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
			 """),_display_(/*22.6*/for((name,infoList)<-userToBookMap) yield /*22.41*/{_display_(Seq[Any](format.raw/*22.42*/("""
  			 	"""),_display_(/*23.9*/for((qsNo,pageName,pageTarget)<-infoList) yield /*23.50*/{_display_(Seq[Any](format.raw/*23.51*/("""
  			 	"""),format.raw/*24.8*/("""<div class="card second w-75">
  			 	<h5 class="card-header">"""),_display_(/*25.33*/pageName),format.raw/*25.41*/("""</h5>
  			 	<form action="answer" method="GET">
  			 	<input type ="text" name = "bookNametemp"  value="""),_display_(/*27.58*/name),format.raw/*27.62*/(""" """),format.raw/*27.63*/("""style ="visibility:hidden">
  			 	<input type ="number" name = "qsNo"  value="""),_display_(/*28.52*/qsNo),format.raw/*28.56*/(""" """),format.raw/*28.57*/("""style ="visibility:hidden">
	  		 	<input type ="submit" value ="Ans" style="float:right; display:inline; width:15%;">
  			 	</form>
  			 	<div class="card-body">
					<div class="row">
						<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem ">Created By </span></div>
						<div class="col-sm-9"><span class="me">"""),_display_(/*34.47*/name),format.raw/*34.51*/("""</span></div>
					</div>
				
				<div class="space"></div>
				
					<div class="row">
							<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem">Domain</span></div>
							<div class="col-sm-9"><span class="me">"""),_display_(/*41.48*/pageTarget),format.raw/*41.58*/("""</span></div>
						
					</div>
				</div>
				</div>
				<br>
				""")))}),format.raw/*47.6*/("""
				
			""")))}),format.raw/*49.5*/(""" 
			
			
			
			
    	
        
	    """),format.raw/*56.6*/("""<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>  
     
    
</html>


"""))
      }
    }
  }

  def render(userToBookMap:Map[String, List[scala.Tuple3[Int, String, String]]],request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(userToBookMap)(request,assetsFinder)

  def f:((Map[String, List[scala.Tuple3[Int, String, String]]]) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (userToBookMap) => (request,assetsFinder) => apply(userToBookMap)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-26T13:31:51.216
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/viewPages.scala.html
                  HASH: 2cd5eef5640adfb2951e27a4bc68023bae8ef1dc
                  MATRIX: 831->31|1020->149|1064->165|1091->166|1447->495|1468->507|1526->544|1629->620|1650->632|1722->682|1809->742|1830->754|1899->801|1986->861|2007->873|2076->920|2136->953|2157->965|2224->1011|2361->1122|2412->1157|2451->1158|2486->1167|2543->1208|2582->1209|2617->1217|2707->1280|2736->1288|2869->1394|2894->1398|2923->1399|3029->1478|3054->1482|3083->1483|3498->1871|3523->1875|3835->2160|3866->2170|3965->2239|4005->2249|4070->2287
                  LINES: 21->2|24->3|27->4|28->5|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|45->22|45->22|45->22|46->23|46->23|46->23|47->24|48->25|48->25|50->27|50->27|50->27|51->28|51->28|51->28|57->34|57->34|64->41|64->41|70->47|72->49|79->56
                  -- GENERATED --
              */
          