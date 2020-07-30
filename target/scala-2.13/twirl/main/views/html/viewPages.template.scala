
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
        <title> TRACK QUERIES </title>
	    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>
	    <link rel="stylesheet" href=""""),_display_(/*11.36*/assetsFinder/*11.48*/.path("stylesheets/utils/viewPage.css")),format.raw/*11.87*/("""" type="text/css"/>  
		<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*12.55*/assetsFinder/*12.67*/.path("/images/title images/apple-touch-icon.png")),format.raw/*12.117*/("""">
		<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*13.58*/assetsFinder/*13.70*/.path("/images/title images/favicon-32x32.png")),format.raw/*13.117*/("""">
		<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*14.58*/assetsFinder/*14.70*/.path("/images/title images/favicon-16x16.png")),format.raw/*14.117*/("""">
		<link rel="manifest" href=""""),_display_(/*15.31*/assetsFinder/*15.43*/.path("/images/title images/site.webmanifest")),format.raw/*15.89*/("""">
	
	        	<!--Write your link and src tags after this comment-->
	        	
	
	</head>
    <body>
			
	<nav class="navbar navbar-light sticky-top flex-md-nowrap p-0 style=" background-color:grey"="">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="#">
      <img src="images.jpg" width="55" alt="" class="d-inline-block align-middle rounded-circle mr-1"><span class="image1">BUG TRACKER</span></a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-toggle="collapse" data-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>  
	</nav>
<div class="container-fluid">
 
  <div class="row">
    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="sidebar-sticky pt-3 part1">
	  <div class="space"></div>
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link sidebar-heading" href="#">
              <span></span>
              TRACK
            </a><hr class="my-1">
          </li>
          <li>
            <a class="nav-link hel" href="#">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-airplay"><path d="M5 17H4a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h16a2 2 0 0 1 2 2v10a2 2 0 0 1-2 2h-1"></path><polygon points="12 15 17 21 7 21 12 15"></polygon></svg>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href="#">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file"><path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path><polyline points="13 2 13 9 20 9"></polyline></svg>
              Pages
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href="#">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-help-circle"><circle cx="12" cy="12" r="10"></circle><path d="M9.09 9a3 3 0 0 1 5.83 1c0 2-3 3-3 3"></path><line x1="12" y1="17" x2="12" y2="17"></line></svg>
              Questions Asked
            </a>
          </li>
        <span style="padding:2%"></span>
        </ul>
          <a class="nav-link sidebar-heading" href="#">ACCOUNT</a><hr class="my-1">
        
        <ul class="nav flex-column mb-2">
          <li class="nav-item">
            <a class="nav-link hel" href="#">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit"><path d="M20 14.66V20a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V6a2 2 0 0 1 2-2h5.34"></path><polygon points="18 2 22 6 12 16 8 16 8 12 18 2"></polygon></svg>
              Change password
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href="#">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path></svg>
              Delete Account
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href="#">
              <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-message-square"><path d="M21 15a2 2 0 0 1-2 2H7l-4 4V5a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2z"></path></svg>
              FAQ
            </a>
          </li>
        </ul>
       
      <ul class="navbar-nav px-3 col-12">
        <li class="nav-item text-nowrap d-flex justify-content-center">
        <a class="nav-link " href="#"><span class="sign">Sign out</span></a>
        </li>
      </ul>
      </div>
    </nav>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">ALL Queries</h1>
      </div>
      
      """),_display_(/*99.8*/for((name,infoList)<-userToBookMap) yield /*99.43*/{_display_(Seq[Any](format.raw/*99.44*/("""
 """),_display_(/*100.3*/for((qsNo,pageName,pageTarget)<-infoList) yield /*100.44*/{_display_(Seq[Any](format.raw/*100.45*/("""
"""),format.raw/*101.1*/("""<div class="card">
		<div class="card-header">
			<div class="row">
				<div class="col-lg-9 col-md-7 col-sm-12 d-flex justify-content-start"><span class="page" style ="display:inline;">"""),_display_(/*104.120*/pageName),format.raw/*104.128*/("""</span></div>
				<div class="col-lg-3 col-md-5 col-sm-12  justify-content-center">	
						<div class="btn-toolbar mb-2 mb-md-0">
							<form action="answer" method="GET">
							<input type ="text" name = "bookNametemp"  value="""),_display_(/*108.58*/name),format.raw/*108.62*/(""" """),format.raw/*108.63*/("""style ="visibility:hidden">
  			 				<input type ="number" name = "qsNo"  value="""),_display_(/*109.55*/qsNo),format.raw/*109.59*/(""" """),format.raw/*109.60*/("""style ="visibility:hidden"> 
							<input type="submit" class="btn  btn-success btn-sm" value ="Ans" id="Ans">
								
								
							</form>
							
							
						</div>
				</div>
			</div>
		</div>
  <div class="row">
  <div class="card-body col-9">
  <div class="inner1">
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bolder text-wrap"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem"> Created By</span></div>
		<div class="col-sm-9"><span class="me"> """),_display_(/*125.44*/name),format.raw/*125.48*/("""</span></div>

	</div>
		<div class="space"></div>
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem">Target</span></div>
		<div class="col-sm-9"><span class="me">"""),_display_(/*131.43*/pageTarget),format.raw/*131.53*/("""</span></div>
	</div>
  </div>
  </div>
  </div>
	</div>
	<div class="space"></div>
	""")))}),format.raw/*138.3*/("""
""")))}),format.raw/*139.2*/("""
	 
	"""),format.raw/*141.2*/("""<div class="container space"></div>		
			
			
			
    	
        
	    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
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
                  DATE: 2020-07-30T02:45:04.999
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/viewPages.scala.html
                  HASH: b15862813b7ee42396ff31484ceca401baadf9a8
                  MATRIX: 831->31|1020->149|1064->165|1091->166|1570->618|1591->630|1651->669|1754->745|1775->757|1847->807|1934->867|1955->879|2024->926|2111->986|2132->998|2201->1045|2261->1078|2282->1090|2349->1136|7199->5960|7250->5995|7289->5996|7319->5999|7377->6040|7417->6041|7446->6042|7662->6229|7693->6237|7951->6467|7977->6471|8007->6472|8117->6554|8143->6558|8173->6559|8703->7061|8729->7065|9013->7321|9045->7331|9162->7417|9195->7419|9228->7424
                  LINES: 21->2|24->3|27->4|28->5|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|122->99|122->99|122->99|123->100|123->100|123->100|124->101|127->104|127->104|131->108|131->108|131->108|132->109|132->109|132->109|148->125|148->125|154->131|154->131|161->138|162->139|164->141
                  -- GENERATED --
              */
          