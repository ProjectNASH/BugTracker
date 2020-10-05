
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

object errorPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[String,String,String,String,String,String,RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* errorPage Template File */
  def apply/*2.2*/(time:String,title: String, head:String, body:String,url:String, typeForm:String)(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
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
    	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>
	    <link rel="stylesheet" href=""""),_display_(/*16.36*/assetsFinder/*16.48*/.path("stylesheets/utils/viewPage.css")),format.raw/*16.87*/("""" type="text/css"/>  
		<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*17.55*/assetsFinder/*17.67*/.path("/images/title images/apple-touch-icon.png")),format.raw/*17.117*/("""">
		<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*18.58*/assetsFinder/*18.70*/.path("/images/title images/favicon-32x32.png")),format.raw/*18.117*/("""">
		<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*19.58*/assetsFinder/*19.70*/.path("/images/title images/favicon-16x16.png")),format.raw/*19.117*/("""">
		<link rel="manifest" href=""""),_display_(/*20.31*/assetsFinder/*20.43*/.path("/images/title images/site.webmanifest")),format.raw/*20.89*/("""">
    
    </head>
     <body>
     <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href=""""),_display_(/*25.62*/routes/*25.68*/.dashboard.viewDashboard),format.raw/*25.92*/("""">
      <img src=""""),_display_(/*26.18*/assetsFinder/*26.30*/.path("/images/images.jpeg")),format.raw/*26.58*/("""" width="45" alt="" class="d-inline-block align-middle rounded-circle mr-1"><span class="image1">BUG TRACKER</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-toggle="collapse" data-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>  
	</nav>
    
    <div class="container-fluid">
 
  	<div class="row">
        <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      	<div class="sidebar-sticky pt-3 part1">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link sidebar-heading" href="#">
              <span></span>
              TRACK
            </a><hr class="my-1">
          </li>
          <li>
            <a class="nav-link hel" href=""""),_display_(/*45.44*/routes/*45.50*/.dashboard.viewDashboard),format.raw/*45.74*/("""">
              <span data-feather="airplay"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*51.44*/routes/*51.50*/.dashboard.viewMyPages),format.raw/*51.72*/("""">
              <span data-feather="file"></span>
              My Queries/Answers
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*57.44*/routes/*57.50*/.dashboard.viewPages),format.raw/*57.70*/("""">
              <span data-feather="help-circle"></span>
              View All Questions
            </a>
          </li>
        <span style="padding:2%"></span>
        </ul>
          <a class="nav-link sidebar-heading" href="#">
          ACCOUNT
          </a>
          <hr class="my-1">
        </h6>
        <ul class="nav flex-column mb-2">
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*71.44*/routes/*71.50*/.dashboard.changePassWordOne),format.raw/*71.78*/("""">
              <span data-feather="edit"></span>
              Change password
            </a>
          </li>          
          <li class="nav-item">
            <a class="nav-link hel" href="#">
              <span data-feather="message-square"></span>
              FAQ
            </a>
          </li>
        </ul>
        
        
      <div class="space"></div>
      <ul class="navbar-nav px-3 col-12">
        <li class="nav-item text-nowrap d-flex justify-content-center">
        <form class="nav-link " action=""""),_display_(/*88.42*/routes/*88.48*/.login.logout()),format.raw/*88.63*/("""" method ="GET"><input type = "submit" class="btn btn-danger" value ="Sign Out"></input></form>
        </li>
      </ul>
      </div>
    </nav>
    
    
   
   
   
     <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">	
		 <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        		<div class="h3">"""),_display_(/*100.28*/head),format.raw/*100.32*/("""</div>
      	</div>
      	<div class="texts">
				<label for="usr"><span class="heading2">
				"""),_display_(/*104.6*/body),format.raw/*104.10*/("""
			    """),format.raw/*105.8*/("""</span></label><br>
		</div>
	</main>
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

  def render(time:String,title:String,head:String,body:String,url:String,typeForm:String,request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(time,title,head,body,url,typeForm)(request,assetsFinder)

  def f:((String,String,String,String,String,String) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (time,title,head,body,url,typeForm) => (request,assetsFinder) => apply(time,title,head,body,url,typeForm)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-25T00:04:20.012
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/errorPage.scala.html
                  HASH: 80496707416d56186ad6dba0f99c88a61e587a0a
                  MATRIX: 820->31|1035->175|1079->191|1106->192|1208->268|1233->273|1316->329|1341->333|1377->342|1401->345|1562->479|1583->491|1640->527|2270->1130|2291->1142|2351->1181|2454->1257|2475->1269|2547->1319|2634->1379|2655->1391|2724->1438|2811->1498|2832->1510|2901->1557|2961->1590|2982->1602|3049->1648|3252->1824|3267->1830|3312->1854|3359->1874|3380->1886|3429->1914|4340->2798|4355->2804|4400->2828|4613->3014|4628->3020|4671->3042|4890->3234|4905->3240|4946->3260|5400->3687|5415->3693|5464->3721|6021->4251|6036->4257|6072->4272|6487->4659|6513->4663|6638->4761|6664->4765|6700->4773
                  LINES: 21->2|24->3|27->4|28->5|32->9|32->9|33->10|33->10|33->10|33->10|35->12|35->12|35->12|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|48->25|48->25|48->25|49->26|49->26|49->26|68->45|68->45|68->45|74->51|74->51|74->51|80->57|80->57|80->57|94->71|94->71|94->71|111->88|111->88|111->88|123->100|123->100|127->104|127->104|128->105
                  -- GENERATED --
              */
          