
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
				<a class="nav-link" href="#"><span class="sub">Documentation</span></a>
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
							<p class="content">Within the field of literary criticism, "text" also refers to the original information content of a particular piece of writing; that is,the "text" of a work is that primal symbolic arrangement of letters as originally composed, apart from later alterations, deterioration, commentary, translations, paratext, etc. Therefore, when literary criticism is concerned with the determination of a "text", it is concerned with the distinguishing of the original information content from whatever has been added to or subtracted from that content as it appears in a given textual</p>
							
						</div>	
					</div>
					<div class="col-lg-3 col-md-4 col-sm-12 part2">
						<div class="container d-flex justify-content-center part3"> 
							<img src=""""),_display_(/*47.19*/assetsFinder/*47.31*/.path("/images/per2.png")),format.raw/*47.56*/("""" class="img-responsive image1" alt="pic1">
						</div>
					</div>
				</div>
			</div>
			<div class="space"></div>
			<div class="container part1 border border-secondary">
				<div class="row">
					<div class="col-lg-3 col-md-4 col-sm-12 part2">
						<div class="container d-flex justify-content-center part3"> 
							<img src=""""),_display_(/*57.19*/assetsFinder/*57.31*/.path("/images/per2.png")),format.raw/*57.56*/("""" class="img-responsive image1" alt="pic1">
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
							<img src=""""),_display_(/*79.19*/assetsFinder/*79.31*/.path("/images/per2.png")),format.raw/*79.56*/("""" class="img-responsive image1" alt="pic1">
						</div>
					</div>
				</div>
			</div>
			<div class="space"></div>
			<div class="container part1 border border-secondary">
				<div class="row">
					<div class="col-lg-3 col-md-4 col-sm-12 part2">
						<div class="container d-flex justify-content-center part3"> 
							<img src=""""),_display_(/*89.19*/assetsFinder/*89.31*/.path("/images/per2.png")),format.raw/*89.56*/("""" class="img-responsive image1" alt="pic1">
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
                  DATE: 2020-07-31T16:15:50.042
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/meetTheTeam.scala.html
                  HASH: 3441b1a6c84e46c7d85c4db555a14f5e5077bb11
                  MATRIX: 782->33|918->98|962->114|989->115|1463->562|1484->574|1540->609|1676->718|1697->730|1746->758|2226->1211|2241->1217|2283->1238|2521->1449|2536->1455|2582->1480|3728->2599|3749->2611|3795->2636|4158->2972|4179->2984|4225->3009|6023->4780|6044->4792|6090->4817|6453->5153|6474->5165|6520->5190
                  LINES: 21->2|24->3|27->4|28->5|35->12|35->12|35->12|39->16|39->16|39->16|46->23|46->23|46->23|52->29|52->29|52->29|70->47|70->47|70->47|80->57|80->57|80->57|102->79|102->79|102->79|112->89|112->89|112->89
                  -- GENERATED --
              */
          