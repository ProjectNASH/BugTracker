
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

object viewPages extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Map[String, List[scala.Tuple2[String, String]]],RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* viewPages Template File */
  def apply/*2.2*/(userToBookMap : Map[String,List[(String,String)]])(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
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
		
		
			 
			 
	  		 
  			 
  			 """),_display_(/*28.8*/for((name,infoList)<-userToBookMap) yield /*28.43*/{_display_(Seq[Any](format.raw/*28.44*/("""
  			 	"""),_display_(/*29.9*/for((pageName,pageTarget)<-infoList) yield /*29.45*/{_display_(Seq[Any](format.raw/*29.46*/("""
  			 	"""),format.raw/*30.8*/("""<div class="card second w-75">
  			 	<h5 class="card-header">"""),_display_(/*31.33*/pageName),format.raw/*31.41*/("""</h5>
	  		 
  			 	<div class="card-body">
					<div class="row">
						<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem ">Created By </span></div>
						<div class="col-sm-9"><span class="me">"""),_display_(/*36.47*/name),format.raw/*36.51*/("""</span></div>
					</div>
				
				<div class="space"></div>
				
					<div class="row">
							<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem">Domain</span></div>
							<div class="col-sm-9"><span class="me">"""),_display_(/*43.48*/pageTarget),format.raw/*43.58*/("""</span></div>
						
					</div>
				</div>
				</div>
				<br>
				""")))}),format.raw/*49.6*/("""
				
			""")))}),format.raw/*51.5*/(""" 
			
			
			
			
    	
        
	    """),format.raw/*58.6*/("""<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>  
     
    
</html>


"""))
      }
    }
  }

  def render(userToBookMap:Map[String, List[scala.Tuple2[String, String]]],request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(userToBookMap)(request,assetsFinder)

  def f:((Map[String, List[scala.Tuple2[String, String]]]) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (userToBookMap) => (request,assetsFinder) => apply(userToBookMap)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-24T18:19:02.720
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/viewPages.scala.html
                  HASH: c9c7af957c24df9f2235239f2ca9a3a9d9ebba8e
                  MATRIX: 826->31|1011->145|1055->161|1082->162|1438->491|1459->503|1517->540|1620->616|1641->628|1713->678|1800->738|1821->750|1890->797|1977->857|1998->869|2067->916|2127->949|2148->961|2215->1007|2384->1150|2435->1185|2474->1186|2509->1195|2561->1231|2600->1232|2635->1240|2725->1303|2754->1311|3048->1578|3073->1582|3385->1867|3416->1877|3515->1946|3555->1956|3620->1994
                  LINES: 21->2|24->3|27->4|28->5|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|51->28|51->28|51->28|52->29|52->29|52->29|53->30|54->31|54->31|59->36|59->36|66->43|66->43|72->49|74->51|81->58
                  -- GENERATED --
              */
          