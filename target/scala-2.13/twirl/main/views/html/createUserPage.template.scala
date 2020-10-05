
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

object createUserPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[String],RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* createUserPage Template File */
  def apply/*2.2*/( r :List[String])(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
	    <title>Create Page</title>
	    <meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>   
	    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css" integrity="sha384-HzLeBuhoNPvSl5KYnjx0BT+WB0QEEqLprO+NBkkk5gbc67FTaL7XIGa2w1L0Xbgc" crossorigin="anonymous">
	    
		<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*15.55*/assetsFinder/*15.67*/.path("/images/title images/apple-touch-icon.png")),format.raw/*15.117*/("""">
		<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*16.58*/assetsFinder/*16.70*/.path("/images/title images/favicon-32x32.png")),format.raw/*16.117*/("""">
		<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*17.58*/assetsFinder/*17.70*/.path("/images/title images/favicon-16x16.png")),format.raw/*17.117*/("""">
		<link rel="manifest" href=""""),_display_(/*18.31*/assetsFinder/*18.43*/.path("/images/title images/site.webmanifest")),format.raw/*18.89*/("""">
		
	    <link rel="stylesheet" type="text/css" href=""""),_display_(/*20.52*/assetsFinder/*20.64*/.path("stylesheets/utils/query.css")),format.raw/*20.100*/(""""></link>
	     <script src="https://unpkg.com/feather-icons"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
	</head>
    <body>
			<nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href=""""),_display_(/*27.62*/routes/*27.68*/.HomeController.index),format.raw/*27.89*/("""">
      <img src=""""),_display_(/*28.18*/assetsFinder/*28.30*/.path("/images/images.jpeg")),format.raw/*28.58*/("""" width="45" alt="" class="d-inline-block align-middle rounded-circle mr-1"><span class="image1">BUG TRACKER</a>
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
            <a class="nav-link hel" href=""""),_display_(/*52.44*/routes/*52.50*/.dashboard.viewDashboard),format.raw/*52.74*/("""">
              <span data-feather="airplay"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*58.44*/routes/*58.50*/.dashboard.viewMyPages),format.raw/*58.72*/("""">
              <span data-feather="file"></span>
              My Queries/Answers
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*64.44*/routes/*64.50*/.dashboard.viewPages),format.raw/*64.70*/("""">
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
            <a class="nav-link hel" href=""""),_display_(/*78.44*/routes/*78.50*/.dashboard.changePassWordOne),format.raw/*78.78*/("""">
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
        <form class="nav-link " action=""""),_display_(/*93.42*/routes/*93.48*/.login.logout()),format.raw/*93.63*/("""" method ="GET"><input type = "submit" class="btn btn-danger" value ="Sign Out"></input></form>
        </li>
      </ul>
      </div>
    </nav>
    
    
		<main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Write a Query</h1>
      </div>
	 <div class="card">
		<div class="card-header">
			In poetry, content and form combine to create meaning. Poetic content refers to a poem's language. ... Elements like the poem's type, stanza structure, line lengths, rhyme scheme, and rhythm express its form. Together, content and form make meaning, which is the message the poet gives to the reader.
		</div>
  <div class="card-body">
		<div class="cotainer">
			<form name="getPageInfo" action =""""),_display_(/*110.39*/routes/*110.45*/.dashboard.getPageData),format.raw/*110.67*/("""" method="POST">
			 """),_display_(/*111.6*/helper/*111.12*/.CSRF.formField),format.raw/*111.27*/("""
				"""),format.raw/*112.5*/("""<div class="form-group">
					<label for="title"><span class="subhead">TITLE</span></label></br>
					<input type="text" name="pageName" value="" />
				</div>
				<div class="form-group">
					<label for="body"><span class="subhead">BODY</span></label><br>
					<textarea id="body" class="body" name="pageBody"></textarea>
				</div>				
			
			<div><span class="subhead2">Target</span></div>
			<div class="subhead3">
			Select the team with whom you want to share this query. If none selected, query will be shared with all teams.
			</div><br>
			"""),_display_(/*125.5*/for(data<-r) yield /*125.17*/{_display_(Seq[Any](format.raw/*125.18*/("""
			"""),format.raw/*126.4*/("""<div class="form-check form-check-inline">
					<input class="form-check-input" type="checkbox" id=""""),_display_(/*127.59*/data),format.raw/*127.63*/("""" value=""""),_display_(/*127.73*/data),format.raw/*127.77*/("""" name="pageTarget">
					<label class="form-check-label" for=""""),_display_(/*128.44*/data),format.raw/*128.48*/("""">"""),_display_(/*128.51*/data),format.raw/*128.55*/("""</label>
			</div>
			""")))}),format.raw/*130.5*/("""

			"""),format.raw/*132.4*/("""<div class="row">
				<div class="col-lg-9 col-md-7 col-sm-12"><span class="page"></span></div>
				<div class="col-lg-3 col-md-5 col-sm-12  justify-content-center">	
						<div class="btn-toolbar mb-2 mb-md-0">
							<input type = "submit" value = "Submit"  class="btn  btn-success btn-sm">
								
								
							
							<div class="space4"></div>
							
						</div>
				</div>
				</div>
				</form>
			</div>
  </div>
	</div>

	<div class="container space"></div>

    	
        
	    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
		<script src="track.js">
		(function () """),format.raw/*159.16*/("""{"""),format.raw/*159.17*/("""
	          """),format.raw/*160.12*/("""'use strict'

	        feather.replace()
	              """),format.raw/*163.16*/("""}"""),format.raw/*163.17*/("""())
		</script>
    </body>  
     
    
</html>


"""))
      }
    }
  }

  def render(r:List[String],request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(r)(request,assetsFinder)

  def f:((List[String]) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (r) => (request,assetsFinder) => apply(r)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-25T00:31:16.871
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/createUserPage.scala.html
                  HASH: 9eeb45c115d7261fa8ed9b98addbba3315c1ffcd
                  MATRIX: 801->36|953->117|997->133|1024->134|1842->925|1863->937|1935->987|2022->1047|2043->1059|2112->1106|2199->1166|2220->1178|2289->1225|2349->1258|2370->1270|2437->1316|2521->1373|2542->1385|2600->1421|2953->1747|2968->1753|3010->1774|3057->1794|3078->1806|3127->1834|4157->2837|4172->2843|4217->2867|4430->3053|4445->3059|4488->3081|4707->3273|4722->3279|4763->3299|5217->3726|5232->3732|5281->3760|5820->4272|5835->4278|5871->4293|6752->5146|6768->5152|6812->5174|6861->5196|6877->5202|6914->5217|6947->5222|7526->5774|7555->5786|7595->5787|7627->5791|7756->5892|7782->5896|7820->5906|7846->5910|7938->5974|7964->5978|7995->5981|8021->5985|8075->6008|8108->6013|9366->7242|9396->7243|9437->7255|9522->7311|9552->7312
                  LINES: 21->2|24->3|27->4|28->5|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|43->20|43->20|43->20|50->27|50->27|50->27|51->28|51->28|51->28|75->52|75->52|75->52|81->58|81->58|81->58|87->64|87->64|87->64|101->78|101->78|101->78|116->93|116->93|116->93|133->110|133->110|133->110|134->111|134->111|134->111|135->112|148->125|148->125|148->125|149->126|150->127|150->127|150->127|150->127|151->128|151->128|151->128|151->128|153->130|155->132|182->159|182->159|183->160|186->163|186->163
                  -- GENERATED --
              */
          