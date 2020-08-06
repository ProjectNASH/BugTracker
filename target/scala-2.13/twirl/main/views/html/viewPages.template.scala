
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
			
	<nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="#">
      <img src=""""),_display_(/*25.18*/assetsFinder/*25.30*/.path("/images/images.jpeg")),format.raw/*25.58*/("""" width="45" alt="" class="d-inline-block align-middle rounded-circle mr-1"><span class="image1">BUG TRACKER</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-toggle="collapse" data-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <ul class="navbar-nav px-3">
    <li class="nav-item text-nowrap">
      <a class="nav-link" href="#">Home</a>
    </li>
  </ul>
  
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
      
      """),_display_(/*105.8*/for((name,infoList)<-userToBookMap) yield /*105.43*/{_display_(Seq[Any](format.raw/*105.44*/("""
 """),_display_(/*106.3*/for((qsNo,pageName,pageTarget)<-infoList) yield /*106.44*/{_display_(Seq[Any](format.raw/*106.45*/("""
"""),format.raw/*107.1*/("""<div class="card">
		<div class="card-header">
			<div class="row">
				<div class="col-lg-9 col-md-7 col-sm-12 d-flex justify-content-start"><span class="page" style ="display:inline;">"""),_display_(/*110.120*/pageName),format.raw/*110.128*/("""</span></div>
				<div class="col-lg-3 col-md-5 col-sm-12  justify-content-center">	
						<div class="btn-toolbar mb-2 mb-md-0">
							<form action="answer" method="GET">
							<input type ="text" name = "bookNametemp"  value="""),_display_(/*114.58*/name),format.raw/*114.62*/(""" """),format.raw/*114.63*/("""style ="visibility:hidden">
  			 				<input type ="number" name = "qsNo"  value="""),_display_(/*115.55*/qsNo),format.raw/*115.59*/(""" """),format.raw/*115.60*/("""style ="visibility:hidden"> 
  			 				<input type ="text" name = "pageTarget"  value="""),_display_(/*116.59*/pageTarget),format.raw/*116.69*/(""" """),format.raw/*116.70*/("""style ="visibility:hidden"> 
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
		<div class="col-sm-9"><span class="me"> """),_display_(/*132.44*/name),format.raw/*132.48*/("""</span></div>

	</div>
		<div class="space"></div>
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem">Target</span></div>
		<div class="col-sm-9"><span class="me">"""),_display_(/*138.43*/pageTarget),format.raw/*138.53*/("""</span></div>
	</div>
  </div>
  </div>
  </div>
	</div>
	<div class="space"></div>
	""")))}),format.raw/*145.3*/("""
""")))}),format.raw/*146.2*/("""
	 
	"""),format.raw/*148.2*/("""<div class="container space"></div>		
			
			
			
    	
        
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
                  DATE: 2020-08-06T17:10:27.143
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/viewPages.scala.html
                  HASH: de8d8efff0f66409fb85e69462f816f04c75d491
                  MATRIX: 831->31|1020->149|1064->165|1091->166|1570->618|1591->630|1651->669|1754->745|1775->757|1847->807|1934->867|1955->879|2024->926|2111->986|2132->998|2201->1045|2261->1078|2282->1090|2349->1136|2644->1404|2665->1416|2714->1444|7394->6097|7446->6132|7486->6133|7516->6136|7574->6177|7614->6178|7643->6179|7859->6366|7890->6374|8148->6604|8174->6608|8204->6609|8314->6691|8340->6695|8370->6696|8485->6783|8517->6793|8547->6794|9077->7296|9103->7300|9387->7556|9419->7566|9536->7652|9569->7654|9602->7659
                  LINES: 21->2|24->3|27->4|28->5|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|48->25|48->25|48->25|128->105|128->105|128->105|129->106|129->106|129->106|130->107|133->110|133->110|137->114|137->114|137->114|138->115|138->115|138->115|139->116|139->116|139->116|155->132|155->132|161->138|161->138|168->145|169->146|171->148
                  -- GENERATED --
              */
          