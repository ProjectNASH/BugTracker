
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

object errorPageTwo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,String,String,String,String,RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* errorPageTwo Template File */
  def apply/*2.2*/(time:String,title: String, head:String, body:String,url:String)(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="utf-8">
    	 <title>"""),_display_(/*9.15*/title),format.raw/*9.20*/("""</title>
    	 <meta http-equiv = "refresh" content = """"),_display_(/*10.48*/time),format.raw/*10.52*/("""; url = """),_display_(/*10.61*/url),format.raw/*10.64*/("""" />
    	 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    	 <link rel="stylesheet" href=""""),_display_(/*12.37*/assetsFinder/*12.49*/.path("stylesheets/utils/roles.css")),format.raw/*12.85*/(""""></link>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
    	
    	<div class="container-fluid part1">
		<div class="inner">
		<p class="heading">"""),_display_(/*19.23*/head),format.raw/*19.27*/("""</p></br>
	
    	</br>
    	
    	
    	<label for="usr"><span class="heading2">
				"""),_display_(/*25.6*/body),format.raw/*25.10*/("""
    	"""),format.raw/*26.6*/("""</span></label></br>   	
    	
  	
  	
			
			
    	
    	
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

  def render(time:String,title:String,head:String,body:String,url:String,request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(time,title,head,body,url)(request,assetsFinder)

  def f:((String,String,String,String,String) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (time,title,head,body,url) => (request,assetsFinder) => apply(time,title,head,body,url)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-26T03:11:43.317
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/errorPageTwo.scala.html
                  HASH: e43f9f08aad201dd7b26610dbf1d163dda3379d1
                  MATRIX: 819->34|1017->161|1061->177|1088->178|1190->254|1215->259|1298->315|1323->319|1359->328|1383->331|1544->465|1565->477|1622->513|1987->851|2012->855|2124->941|2149->945|2182->951
                  LINES: 21->2|24->3|27->4|28->5|32->9|32->9|33->10|33->10|33->10|33->10|35->12|35->12|35->12|42->19|42->19|48->25|48->25|49->26
                  -- GENERATED --
              */
          