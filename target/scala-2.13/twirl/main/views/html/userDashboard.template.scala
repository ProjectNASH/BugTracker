
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

object userDashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    	<title> BUG TRACKER DASH BOARD</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>
      	
      	<link rel="stylesheet" href=""""),_display_(/*15.38*/assetsFinder/*15.50*/.path("stylesheets/utils/userDashboard.css")),format.raw/*15.94*/("""" type="text/css"/>  
	<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*16.54*/assetsFinder/*16.66*/.path("/images/title images/apple-touch-icon.png")),format.raw/*16.116*/("""">
	<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*17.57*/assetsFinder/*17.69*/.path("/images/title images/favicon-32x32.png")),format.raw/*17.116*/("""">
	<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*18.57*/assetsFinder/*18.69*/.path("/images/title images/favicon-16x16.png")),format.raw/*18.116*/("""">
	<link rel="manifest" href=""""),_display_(/*19.30*/assetsFinder/*19.42*/.path("/images/title images/site.webmanifest")),format.raw/*19.88*/("""">

        	<!--Write your link and src tags after this comment-->

    </head>
    <body><nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="#">
      <img src=""""),_display_(/*26.18*/assetsFinder/*26.30*/.path("/images/images.jpeg")),format.raw/*26.58*/("""" width="45" alt="" class="d-inline-block align-middle rounded-circle mr-1"><span class="image1">BUG TRACKER</a>
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
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link sidebar-heading" href="#">
              <span></span>
              TRACK
            </a><hr class="my-1">
          </li>
          <li>
            <a class="nav-link hel" href="#">
              <span data-feather="airplay"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href="#">
              <span data-feather="file"></span>
              Pages
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href="#">
              <span data-feather="help-circle"></span>
              Questions Asked
            </a>
          </li>
        <span style="padding:2%"></span>
        </ul>
          <a class="nav-link sidebar-heading" href="#">ACCOUNT</a><hr class="my-1">
        </h6>
        <ul class="nav flex-column mb-2">
          <li class="nav-item">
            <a class="nav-link hel" href="#">
              <span data-feather="edit"></span>
              Change password
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href="#">
              <span data-feather="trash"></span>
              Delete Account
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
        <a class="nav-link " href="#"><span class="sign">Sign out</span></a>
        </li>
      </ul>
      </div>
    </nav>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Dashboard</h1>
        <div class="btn-toolbar mb-2 mb-md-0">
          <button type="button" class="btn btn-sm btn-outline-secondary">
            <span data-feather="book"></span>
            Create Page
          </button>
          <div class="space"></div>
          <button type="button" class="btn btn-sm btn-outline-secondary ">
            <span data-feather="help-circle"></span>
            Ask Questions
          </button>
        </div>
      </div>
	 <div class="card first">
  <h5 class="card-header">PROFILE</h5>
  <div class="row">
  <div class="card-body col-9">
  <div class="inner1">
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bolder text-wrap"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem"> Username</span></div>
		<div class="col-sm-9"><span class="me"> Lucky02</span></div>
		
	</div>
		<div class="space"></div>
	<div class="row">
		<div class="card-text col-sm-3  text-wrap"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem"> Name </span></div>
		<div class="col-sm-8"> <span class="me">Himanshu Tripathi</span></div>
	</div>
		<div class="space"></div>
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem"> Profession </span></div>
		<div class="col-sm-9"><span class="me">Student</span></div>
	</div>
		<div class="space"></div>
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bold text-wrap"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem">Email</span></div>
		<div class="col-sm-9"><span class="me" >himanshugmail.com</span></div>
	</div>
  </div>
  </div>
  <div class="container d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center col-3">
	<div class="container inner">
		<img src=""""),_display_(/*144.14*/assetsFinder/*144.26*/.path("/images/big_hero.PNG")),format.raw/*144.55*/("""" alt="profile pic" class="image img-fluid img-thumbnail">
		<div class="overlay">
			<a href="https://www.google.com" class="icon" title="Change Profile Picture">
				<i class="fa fa-user"></i>
			</a>
		</div>
	</div>
  </div>
  </div>
</div>
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3">
        <h2 class="h2"><span class="recent">Recent Pages</span></h2>
      </div>
	  <div class="card second w-75">
	  <h5 class="card-header">PageName</h5>
  <div class="card-body">
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem ">Created By </span></div>
		<div class="col-sm-9"><span class="me">Himanshu</span></div>
	</div>
	<div class="space"></div>
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem">Domain</span></div>
		<div class="col-sm-9"><span class="me">DomainName</span></div>
	</div>
  </div>
</div>
	  <div class="space1"></div>
    </main>
  </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="../assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="bootstrap.bundle.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.min.js"></script>
        <script>
        (function () """),format.raw/*180.22*/("""{"""),format.raw/*180.23*/("""
            """),format.raw/*181.13*/("""'use strict'

          feather.replace()
                """),format.raw/*184.17*/("""}"""),format.raw/*184.18*/("""())
          
        </script>


    	
        
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
                  DATE: 2020-07-15T18:47:24.521
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/userDashboard.scala.html
                  HASH: 05abeba8ca145335896375cd6296ddc7e0793416
                  MATRIX: 779->28|915->93|959->109|986->110|1610->707|1631->719|1696->763|1798->838|1819->850|1891->900|1977->959|1998->971|2067->1018|2153->1077|2174->1089|2243->1136|2302->1168|2323->1180|2390->1226|2667->1476|2688->1488|2737->1516|7354->6105|7376->6117|7427->6146|9160->7850|9190->7851|9232->7864|9319->7922|9349->7923
                  LINES: 21->2|24->3|27->4|28->5|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|49->26|49->26|49->26|167->144|167->144|167->144|203->180|203->180|204->181|207->184|207->184
                  -- GENERATED --
              */
          