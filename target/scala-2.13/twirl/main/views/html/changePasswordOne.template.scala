
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

object changePasswordOne extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* changePassword1 Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""

"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="utf-8">
    	 <title>Change Password Step 1/2</title>
    	 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    	 <link rel="stylesheet" href=""""),_display_(/*12.37*/assetsFinder/*12.49*/.path("stylesheets/utils/roles.css")),format.raw/*12.85*/(""""></link>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>
	    <link rel="stylesheet" href=""""),_display_(/*15.36*/assetsFinder/*15.48*/.path("stylesheets/utils/viewPage.css")),format.raw/*15.87*/("""" type="text/css"/>  
		<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*16.55*/assetsFinder/*16.67*/.path("/images/title images/apple-touch-icon.png")),format.raw/*16.117*/("""">
		<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*17.58*/assetsFinder/*17.70*/.path("/images/title images/favicon-32x32.png")),format.raw/*17.117*/("""">
		<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*18.58*/assetsFinder/*18.70*/.path("/images/title images/favicon-16x16.png")),format.raw/*18.117*/("""">
		<link rel="manifest" href=""""),_display_(/*19.31*/assetsFinder/*19.43*/.path("/images/title images/site.webmanifest")),format.raw/*19.89*/("""">
    
    
    </head>
    
    
    
    
    
    <body>
     <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href=""""),_display_(/*30.62*/routes/*30.68*/.dashboard.viewDashboard),format.raw/*30.92*/("""">
      <img src=""""),_display_(/*31.18*/assetsFinder/*31.30*/.path("/images/images.jpeg")),format.raw/*31.58*/("""" width="45" alt="" class="d-inline-block align-middle rounded-circle mr-1"><span class="image1">BUG TRACKER</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-toggle="collapse" data-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button></nav>
  
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
            <a class="nav-link hel" href=""""),_display_(/*49.44*/routes/*49.50*/.dashboard.viewDashboard),format.raw/*49.74*/("""">
              <span data-feather="airplay"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*55.44*/routes/*55.50*/.dashboard.viewMyPages),format.raw/*55.72*/("""">
              <span data-feather="file"></span>
              My Queries/Answers
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*61.44*/routes/*61.50*/.dashboard.viewPages),format.raw/*61.70*/("""">
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
            <a class="nav-link hel" href=""""),_display_(/*75.44*/routes/*75.50*/.dashboard.changePassWordOne),format.raw/*75.78*/("""">
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
        <form class="nav-link " action=""""),_display_(/*92.42*/routes/*92.48*/.login.logout()),format.raw/*92.63*/("""" method ="GET"><input type = "submit" class="btn btn-danger" value ="Sign Out"></input></form>
        </li>
      </ul>
      </div>
    </nav>
    
    
    
    	
    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">		
		 <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        		<div class="h3">Change Password</div>
      	</div>
		
		
		<div class="texts">
				<label for="usr">
				<span class="heading2"> 
				Enter your current Password to continue to change your password
				</span>
				</label>
				<br><br>
    	
    	<form action = """"),_display_(/*115.23*/routes/*115.29*/.dashboard.changePasswordTwo),format.raw/*115.57*/("""" method ="POST" >
		"""),_display_(/*116.4*/helper/*116.10*/.CSRF.formField),format.raw/*116.25*/("""
		"""),format.raw/*117.3*/("""Current Password  &nbsp<input type="password" id="pass" name="userpassword">
		<input type="submit">
		</form>
    	
    	
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

  def render(request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply()(request,assetsFinder)

  def f:(() => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = () => (request,assetsFinder) => apply()(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-24T23:37:55.988
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/changePasswordOne.scala.html
                  HASH: 068415b6aec145de0ed803bd19ba4922aa90be1f
                  MATRIX: 792->37|928->102|972->118|1000->120|1264->357|1285->369|1342->405|1754->790|1775->802|1835->841|1938->917|1959->929|2031->979|2118->1039|2139->1051|2208->1098|2295->1158|2316->1170|2385->1217|2445->1250|2466->1262|2533->1308|2765->1513|2780->1519|2825->1543|2872->1563|2893->1575|2942->1603|3847->2481|3862->2487|3907->2511|4120->2697|4135->2703|4178->2725|4397->2917|4412->2923|4453->2943|4907->3370|4922->3376|4971->3404|5528->3934|5543->3940|5579->3955|6241->4589|6257->4595|6307->4623|6356->4645|6372->4651|6409->4666|6440->4669
                  LINES: 21->2|24->3|27->4|29->6|35->12|35->12|35->12|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|53->30|53->30|53->30|54->31|54->31|54->31|72->49|72->49|72->49|78->55|78->55|78->55|84->61|84->61|84->61|98->75|98->75|98->75|115->92|115->92|115->92|138->115|138->115|138->115|139->116|139->116|139->116|140->117
                  -- GENERATED --
              */
          