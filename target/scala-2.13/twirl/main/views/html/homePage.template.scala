
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

object homePage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/()(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title> SignUp to BugTracker </title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
      	<link rel="stylesheet" href=""""),_display_(/*10.38*/assetsFinder/*10.50*/.path("stylesheets/utils/homePagestyle.css")),format.raw/*10.94*/("""" type ="text/css">
      	
	<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*12.54*/assetsFinder/*12.66*/.path("/images/title images/apple-touch-icon.png")),format.raw/*12.116*/("""">
	<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*13.57*/assetsFinder/*13.69*/.path("/images/title images/favicon-32x32.png")),format.raw/*13.116*/("""">
	<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*14.57*/assetsFinder/*14.69*/.path("/images/title images/favicon-16x16.png")),format.raw/*14.116*/("""">
	<link rel="manifest" href=""""),_display_(/*15.30*/assetsFinder/*15.42*/.path("/images/title images/site.webmanifest")),format.raw/*15.88*/("""">

    </head>
    <body onload="showText()">
	  <nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href=""""),_display_(/*20.35*/routes/*20.41*/.HomeController.index),format.raw/*20.62*/("""">
	  	<img src=""""),_display_(/*21.16*/assetsFinder/*21.28*/.path("/images/images.jpeg")),format.raw/*21.56*/("""" width="40" height="40" class="d-inline-block align-top" alt=""/>
	  </a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>

	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href=""""),_display_(/*30.37*/routes/*30.43*/.HomeController.index),format.raw/*30.64*/("""">Home <span class="sr-only">(current)</span></a>
	      </li>

	      <li class="nav-item">
	        <a class="nav-link" href=""""),_display_(/*34.37*/routes/*34.43*/.meetTheTeam.documentation),format.raw/*34.69*/("""">Documentation</a>
	      </li>

	      <li class="nav-item">
	        <a class="nav-link" href=""""),_display_(/*38.37*/routes/*38.43*/.meetTheTeam.showTeamPage),format.raw/*38.68*/("""">Meet the Team</a>
	      </li>
	     
	    </ul>
	    
	  </div>
	</nav>






	   	<div class="jumbotron">   			
				<h1 class="display-4" id ="headerText"></h1>
				<p class="lead">BugTracker provides you with a simple solution for your enterprise to track and mark all the bugs that developers encounter. This makes way for easier communication between different teams, resulting in hassle free and easier bug removal process</p>
				<hr class="my-4">
				<p class="logSignup">Sign up/Log in up if your organization already uses BugTracker. If not, then it takes only 3 steps to setup. </p>
				<p class="lead">


				   <div class="text-center">
				   
				   <a href = """"),_display_(/*61.20*/routes/*61.26*/.signUp.sendSignupSetupPage),format.raw/*61.53*/("""">					
				   	<button class="btn btn-outline-secondary btn-lg">Setup</button>
				   	</a>
				   	
				   	
				   	
				   	<a href = """"),_display_(/*67.21*/routes/*67.27*/.login.loginPage),format.raw/*67.43*/("""">	
				   	<button class="btn btn-outline-secondary btn-lg">Login</button>
				   	</a>				   
				   
				   
				   	
				   
				   </div>
				</p>
				
			
		</div>


		<section id="testimonials">
			<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  			<div class="carousel-inner">
   				<div class="carousel-item active">
					<h2>"Absolute delight to work with Bugtracker, was able to quicly solve all the bus"</h2>
					<h3>-Sam Smith</h3>
				</div>
				<div class="carousel-item">
					<h2>"It is better than putting up all the bugs on a public forum."</h2>
					<h3>-Mike Tyson</h3>
				</div>	
				<div class="carousel-item">
					<h2>"Quick and simple mechanism to post and solve bugs"</h2>
					<h3>-Thanos Stark</h3>
				</div>	

			</div>
			</div>
		</section>
		
		


		<footer>
			Copyright © Bug Tracker. All Rights Reserved | Contact Us: +91 123456789
		</footer>
	</body>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		
	    <script type="text/javascript" src=""""),_display_(/*113.43*/assetsFinder/*113.55*/.path("js/homePage.js")),format.raw/*113.78*/(""""> </script> 
	    
		
		
	   
	     
         
</html>
"""))
      }
    }
  }

  def render(assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply()(assetsFinder)

  def f:(() => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = () => (assetsFinder) => apply()(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-10-05T12:41:53.903
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/homePage.scala.html
                  HASH: aa9f6303dc7f566d0809af8569f313c4d4dd301d
                  MATRIX: 760->28|893->68|921->70|1282->404|1303->416|1368->460|1476->541|1497->553|1569->603|1655->662|1676->674|1745->721|1831->780|1852->792|1921->839|1980->871|2001->883|2068->929|2239->1073|2254->1079|2296->1100|2341->1118|2362->1130|2411->1158|2955->1675|2970->1681|3012->1702|3168->1831|3183->1837|3230->1863|3356->1962|3371->1968|3417->1993|4123->2672|4138->2678|4186->2705|4353->2845|4368->2851|4405->2867|5994->4428|6016->4440|6061->4463
                  LINES: 21->2|26->3|28->5|33->10|33->10|33->10|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|43->20|43->20|43->20|44->21|44->21|44->21|53->30|53->30|53->30|57->34|57->34|57->34|61->38|61->38|61->38|84->61|84->61|84->61|90->67|90->67|90->67|136->113|136->113|136->113
                  -- GENERATED --
              */
          