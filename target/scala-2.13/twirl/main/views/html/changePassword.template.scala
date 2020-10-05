
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

object changePassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* changePassword Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""


"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="utf-8">
    	 <title>Change Password Step 2/2</title>    	
    	 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    	 <link rel="stylesheet" href=""""),_display_(/*13.37*/assetsFinder/*13.49*/.path("stylesheets/utils/roles.css")),format.raw/*13.85*/(""""></link>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>
	    <link rel="stylesheet" href=""""),_display_(/*17.36*/assetsFinder/*17.48*/.path("stylesheets/utils/viewPage.css")),format.raw/*17.87*/("""" type="text/css"/>  
		<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*18.55*/assetsFinder/*18.67*/.path("/images/title images/apple-touch-icon.png")),format.raw/*18.117*/("""">
		<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*19.58*/assetsFinder/*19.70*/.path("/images/title images/favicon-32x32.png")),format.raw/*19.117*/("""">
		<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*20.58*/assetsFinder/*20.70*/.path("/images/title images/favicon-16x16.png")),format.raw/*20.117*/("""">
		<link rel="manifest" href=""""),_display_(/*21.31*/assetsFinder/*21.43*/.path("/images/title images/site.webmanifest")),format.raw/*21.89*/("""">
    
    </head>
     <body>
     <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href=""""),_display_(/*26.62*/routes/*26.68*/.dashboard.viewDashboard),format.raw/*26.92*/("""">
      <img src=""""),_display_(/*27.18*/assetsFinder/*27.30*/.path("/images/images.jpeg")),format.raw/*27.58*/("""" width="45" alt="" class="d-inline-block align-middle rounded-circle mr-1"><span class="image1">BUG TRACKER</a>
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
            <a class="nav-link hel" href=""""),_display_(/*46.44*/routes/*46.50*/.dashboard.viewDashboard),format.raw/*46.74*/("""">
              <span data-feather="airplay"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*52.44*/routes/*52.50*/.dashboard.viewMyPages),format.raw/*52.72*/("""">
              <span data-feather="file"></span>
              My Queries/Answers
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*58.44*/routes/*58.50*/.dashboard.viewPages),format.raw/*58.70*/("""">
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
            <a class="nav-link hel" href=""""),_display_(/*72.44*/routes/*72.50*/.dashboard.changePassWordOne),format.raw/*72.78*/("""">
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
        <form class="nav-link " action=""""),_display_(/*89.42*/routes/*89.48*/.login.logout()),format.raw/*89.63*/("""" method ="GET"><input type = "submit" class="btn btn-danger" value ="Sign Out"></input></form>
        </li>
      </ul>
      </div>
    </nav>
    
    
   
   
   
     <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">	
     <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        		<div class="h3">Change Password (Step 2/2)</div>
      	</div>
      	
      	
		<div class="texts">
				<label for="usr">
				<span class="heading2"> 
				Enter your new Password. Choose a strong password and don't reuse it for other accounts.
				</span>
				</label>
				<br><br>
		<form action = """"),_display_(/*112.20*/routes/*112.26*/.resetPassword.setNewPassword),format.raw/*112.55*/("""" method ="POST">
		  	"""),_display_(/*113.7*/helper/*113.13*/.CSRF.formField),format.raw/*113.28*/("""
		  	"""),format.raw/*114.6*/("""New Password: &nbsp;&nbsp;<input type="password" name="newPassword"><br><br>
		  	Confirm New Password: &nbsp;&nbsp;<input type="password" name="confirmnewPassword">
		  	<input type = "submit" value="submit">
	  	</form>
	</main>
    </div>
    </div>
   
   
    	
    	
    	
    	
    	
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>

		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    	
    </body>
</html>

"""))
      }
    }
  }

  def render(request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply()(request,assetsFinder)

  def f:(() => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = () => (request,assetsFinder) => apply()(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-24T23:51:15.150
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/changePassword.scala.html
                  HASH: 5e736253b7376e11df63058e9246f2c44fb6ab3e
                  MATRIX: 788->36|924->101|968->117|997->120|1266->362|1287->374|1344->410|1974->1013|1995->1025|2055->1064|2158->1140|2179->1152|2251->1202|2338->1262|2359->1274|2428->1321|2515->1381|2536->1393|2605->1440|2665->1473|2686->1485|2753->1531|2956->1707|2971->1713|3016->1737|3063->1757|3084->1769|3133->1797|4044->2681|4059->2687|4104->2711|4317->2897|4332->2903|4375->2925|4594->3117|4609->3123|4650->3143|5104->3570|5119->3576|5168->3604|5725->4134|5740->4140|5776->4155|6478->4829|6494->4835|6545->4864|6596->4888|6612->4894|6649->4909|6683->4915
                  LINES: 21->2|24->3|27->4|30->7|36->13|36->13|36->13|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|49->26|49->26|49->26|50->27|50->27|50->27|69->46|69->46|69->46|75->52|75->52|75->52|81->58|81->58|81->58|95->72|95->72|95->72|112->89|112->89|112->89|135->112|135->112|135->112|136->113|136->113|136->113|137->114
                  -- GENERATED --
              */
          