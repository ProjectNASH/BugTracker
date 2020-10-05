
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

object viewPages extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Map[String, List[scala.Tuple3[Int, String, String]]],String,String,RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* viewPages Template File */
  def apply/*2.2*/(userToBookMap : Map[String,List[(Int,String,String)]], myall: String,temp:String)(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
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
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href=""""),_display_(/*24.62*/routes/*24.68*/.dashboard.viewDashboard),format.raw/*24.92*/("""">
      <img src=""""),_display_(/*25.18*/assetsFinder/*25.30*/.path("/images/images.jpeg")),format.raw/*25.58*/("""" width="45" alt="" class="d-inline-block align-middle rounded-circle mr-1"><span class="image1">BUG TRACKER</a>
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
        <form class="nav-link " action=""""),_display_(/*86.42*/routes/*86.48*/.login.logout()),format.raw/*86.63*/("""" method ="GET"><input type = "submit" class="btn btn-danger" value ="Sign Out"></input></form>
        </li>
      </ul>
      </div>
    </nav>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">"""),_display_(/*94.25*/myall),format.raw/*94.30*/(""" """),format.raw/*94.31*/("""Queries</h1>
      </div>
      
      """),_display_(/*97.8*/for((name,infoList)<-userToBookMap) yield /*97.43*/{_display_(Seq[Any](format.raw/*97.44*/("""
 """),_display_(/*98.3*/for((qsNo,pageName,pageTarget)<-infoList) yield /*98.44*/{_display_(Seq[Any](format.raw/*98.45*/("""
"""),format.raw/*99.1*/("""<div class="card">
		<div class="card-header">
			<div class="row">
				<div class="col-lg-9 col-md-7 col-sm-12 d-flex justify-content-start"><span class="page" style ="display:inline;">"""),_display_(/*102.120*/pageName),format.raw/*102.128*/("""</span></div>
				<div class="col-lg-3 col-md-5 col-sm-12  justify-content-center">	
						<div class="btn-toolbar mb-2 mb-md-0">
							<form action="answer" method="GET">
							<input type ="text" name = "bookNametemp"  value="""),_display_(/*106.58*/name),format.raw/*106.62*/(""" """),format.raw/*106.63*/("""style ="visibility:hidden">
  			 				<input type ="number" name = "qsNo"  value="""),_display_(/*107.55*/qsNo),format.raw/*107.59*/(""" """),format.raw/*107.60*/("""style ="visibility:hidden"> 
  			 				<input type ="text" name = "pageTarget"  value="""),_display_(/*108.59*/pageTarget),format.raw/*108.69*/(""" """),format.raw/*108.70*/("""style ="visibility:hidden"> 
							<input type="submit" class="btn  btn-success btn-sm" value =""""),_display_(/*109.70*/temp),format.raw/*109.74*/("""" id="Ans">
								
								
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
		<div class="col-sm-9"><span class="me"> """),_display_(/*124.44*/name),format.raw/*124.48*/("""</span></div>

	</div>
		<div class="space"></div>
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem">Target</span></div>
		<div class="col-sm-9"><span class="me">"""),_display_(/*130.43*/pageTarget),format.raw/*130.53*/("""</span></div>
	</div>
  </div>
  </div>
  </div>
	</div>
	<div class="space"></div>
	""")))}),format.raw/*137.3*/("""
""")))}),format.raw/*138.2*/("""
	 
	"""),format.raw/*140.2*/("""<div class="container space"></div>		
			
			
			
    	
        
	    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>  
     
    
</html>


"""))
      }
    }
  }

  def render(userToBookMap:Map[String, List[scala.Tuple3[Int, String, String]]],myall:String,temp:String,request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(userToBookMap,myall,temp)(request,assetsFinder)

  def f:((Map[String, List[scala.Tuple3[Int, String, String]]],String,String) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (userToBookMap,myall,temp) => (request,assetsFinder) => apply(userToBookMap,myall,temp)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-24T17:53:48.762
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/viewPages.scala.html
                  HASH: 9b3a0d37657f0b78bcc30af716829089f40773a7
                  MATRIX: 845->31|1061->176|1105->192|1132->193|1611->645|1632->657|1692->696|1795->772|1816->784|1888->834|1975->894|1996->906|2065->953|2152->1013|2173->1025|2242->1072|2302->1105|2323->1117|2390->1163|2665->1411|2680->1417|2725->1441|2772->1461|2793->1473|2842->1501|3743->2375|3758->2381|3803->2405|4016->2591|4031->2597|4074->2619|4293->2811|4308->2817|4349->2837|4803->3264|4818->3270|4867->3298|5406->3810|5421->3816|5457->3831|5848->4195|5874->4200|5903->4201|5969->4241|6020->4276|6059->4277|6088->4280|6145->4321|6184->4322|6212->4323|6428->4510|6459->4518|6717->4748|6743->4752|6773->4753|6883->4835|6909->4839|6939->4840|7054->4927|7086->4937|7116->4938|7242->5036|7268->5040|7698->5442|7724->5446|8008->5702|8040->5712|8157->5798|8190->5800|8223->5805
                  LINES: 21->2|24->3|27->4|28->5|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|47->24|47->24|47->24|48->25|48->25|48->25|68->45|68->45|68->45|74->51|74->51|74->51|80->57|80->57|80->57|94->71|94->71|94->71|109->86|109->86|109->86|117->94|117->94|117->94|120->97|120->97|120->97|121->98|121->98|121->98|122->99|125->102|125->102|129->106|129->106|129->106|130->107|130->107|130->107|131->108|131->108|131->108|132->109|132->109|147->124|147->124|153->130|153->130|160->137|161->138|163->140
                  -- GENERATED --
              */
          