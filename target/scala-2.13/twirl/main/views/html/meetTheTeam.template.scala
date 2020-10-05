
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

object meetTheTeam extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* meetTheTeam Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Meet The Team</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*12.49*/assetsFinder/*12.61*/.path("stylesheets/utils/team.css")),format.raw/*12.96*/(""""></link>
    </head>
    <body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<img src=""""),_display_(/*16.15*/assetsFinder/*16.27*/.path("/images/images.jpeg")),format.raw/*16.55*/("""" width="50" alt="" class="d-inline-block align-middle rounded-circle">
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
			<li class="nav-item active">
				<a class="nav-link" href=""""),_display_(/*23.32*/routes/*23.38*/.HomeController.index),format.raw/*23.59*/(""""><span class="sub">Home</span></a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href=""""),_display_(/*26.32*/routes/*26.38*/.meetTheTeam.documentation),format.raw/*26.64*/(""""><span class="sub">Documentation</span></a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href=""""),_display_(/*29.32*/routes/*29.38*/.meetTheTeam.showTeamPage),format.raw/*29.63*/(""""><span class="sub">Meet The Team</span></a>
			</li>
			</ul>
			</div>
		</nav>
		<div class="space"></div>
		<div class="container-fluid">
			<p class="h3"> MEET  THE  TEAM</p></br>
			<div class="container part1 border border-danger">
				<div class="row">
					<div class=" col-lg-9 col-md-8 col-sm-12">
						<div class="container part4">
							<p class="h4"><b>Sanjay Dutta</b></p><p class="content">
						I started Coding back in school and I have never looked back since. I have a serious passion for Coding, Creating Websites, Learning New Algorithms and incorporating them in my work. I consider myself a Full Stack Developer. I love what I am doing and I am highly motivated to collaborate with you guys. So if you are into some project, don't hesitate to contact me.</p>
							
						</div>	
					</div>
					<div class="col-lg-3 col-md-4 col-sm-12 part2">
						<div class="container d-flex justify-content-center part3"> 
							<img src=""""),_display_(/*48.19*/assetsFinder/*48.31*/.path("/images/per2.png")),format.raw/*48.56*/("""" class="img-responsive image1" alt="pic1" style="border-radius: 50%;">
						</div>
					</div>
				</div>
			</div>
			<div class="space"></div>
			<div class="container part1 border border-secondary">
				<div class="row">
					<div class="col-lg-3 col-md-4 col-sm-12 part2">
						<div class="container d-flex justify-content-center part3"> 
							<img src=""""),_display_(/*58.19*/assetsFinder/*58.31*/.path("/images/per2.png")),format.raw/*58.56*/("""" class="img-responsive image1" alt="pic1">
						</div>
					</div>
					<div class="col-lg-9 col-md-8 col-sm-12">
						<div class="container part4">
							<p class="content">Within the field of literary criticism, "text" also refers to the original information content of a particular piece of writing; that is,the "text" of a work is that primal symbolic arrangement of letters as originally composed, apart from later alterations, deterioration, commentary, translations, paratext, etc. Therefore, when literary criticism is concerned with the determination of a "text", it is concerned with the distinguishing of the original information content from whatever has been added to or subtracted from that content as it appears in a given textual</p>
							
						</div>	
					</div>
				</div>
			</div>
			<div class="space"></div>
			<div class="container part1 border border-danger">
				<div class="row">
					<div class="col-lg-9 col-md-8 col-sm-12">
						<div class="container part4">
							<p class="content">Within the field of literary criticism, "text" also refers to the original information content of a particular piece of writing; that is,the "text" of a work is that primal symbolic arrangement of letters as originally composed, apart from later alterations, deterioration, commentary, translations, paratext, etc. Therefore, when literary criticism is concerned with the determination of a "text", it is concerned with the distinguishing of the original information content from whatever has been added to or subtracted from that content as it appears in a given textual</p>
							
						</div>	
					</div>
					<div class="col-lg-3 col-md-4 col-sm-12 part2">
						<div class="container d-flex justify-content-center part3"> 
							<img src=""""),_display_(/*80.19*/assetsFinder/*80.31*/.path("/images/per2.png")),format.raw/*80.56*/("""" class="img-responsive image1" alt="pic1">
						</div>
					</div>
				</div>
			</div>
			<div class="space"></div>
			<div class="container part1 border border-secondary">
				<div class="row">
					<div class="col-lg-3 col-md-4 col-sm-12 part2">
						<div class="container d-flex justify-content-center part3"> 
							<img src=""""),_display_(/*90.19*/assetsFinder/*90.31*/.path("/images/per2.png")),format.raw/*90.56*/("""" class="img-responsive image1" alt="pic1">
						</div>
					</div>
					<div class="col-lg-9 col-md-8 col-sm-12">
						<div class="container part4">
							<p class="content">Within the field of literary criticism, "text" also refers to the original information content of a particular piece of writing; that is,the "text" of a work is that primal symbolic arrangement of letters as originally composed, apart from later alterations, deterioration, commentary, translations, paratext, etc. Therefore, when literary criticism is concerned with the determination of a "text", it is concerned with the distinguishing of the original information content from whatever has been added to or subtracted from that content as it appears in a given textual</p>
							
						</div>	
					</div>
				</div>
			</div>
		</div>
		<div class="space1"></div>
            <a href = """"),_display_(/*103.25*/routes/*103.31*/.HomeController.index),format.raw/*103.52*/("""">Go Back</a>

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
                  DATE: 2020-10-05T13:01:51.141
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/meetTheTeam.scala.html
                  HASH: ef33f39edcaf03e0581d5701cfc469ef3c2b3a36
                  MATRIX: 782->33|918->98|962->114|989->115|1463->562|1484->574|1540->609|1676->718|1697->730|1746->758|2226->1211|2241->1217|2283->1238|2411->1339|2426->1345|2473->1371|2610->1481|2625->1487|2671->1512|3656->2470|3677->2482|3723->2507|4114->2871|4135->2883|4181->2908|5979->4679|6000->4691|6046->4716|6409->5052|6430->5064|6476->5089|7375->5960|7391->5966|7434->5987
                  LINES: 21->2|24->3|27->4|28->5|35->12|35->12|35->12|39->16|39->16|39->16|46->23|46->23|46->23|49->26|49->26|49->26|52->29|52->29|52->29|71->48|71->48|71->48|81->58|81->58|81->58|103->80|103->80|103->80|113->90|113->90|113->90|126->103|126->103|126->103
                  -- GENERATED --
              */
          