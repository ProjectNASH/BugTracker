
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

object homePage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
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
	  <a class="navbar-brand" href="#">
	  	<img src=""""),_display_(/*21.16*/assetsFinder/*21.28*/.path("/images/images.jpeg")),format.raw/*21.56*/("""" width="40" height="40" class="d-inline-block align-top" alt=""/>
	  </a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>

	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Documentation
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="#">What is BugTracker</a>
	          <div class="dropdown-divider"></div>
	          <a class="dropdown-item" href="#">How to upload your queries</a>
	          <div class="dropdown-divider"></div>
	          <a class="dropdown-item" href="#">How to create an account</a>
	        </div>
	      </li>

	      <li class="nav-item">
	        <a class="nav-link" href="#">Meet the Team</a>
	      </li>
	     
	    </ul>
	    
	  </div>
	</nav>






	   	<div class="jumbotron">   			
				<h1 class="display-4" id ="headerText"></h1>
				<p class="lead">BugTracker provides you with a simple solution for your enteprise to track and mark all the bugs that developers encounter. This makes way for easier communication between different teams, resulting in hassle free and easier bug removal process</p>
				<hr class="my-4">
				<p class="logSignup">Log in up if your organization already uses BugTracker. If not, then ask your System Adminstrator to set up bugtracker. It takes less than 5 minutes to do so.</p>
				<p class="lead">


				   <div class="text-center">
				   
				   <form method ="GET" action = "" id="signupForm" >
					"""),_display_(/*70.7*/helper/*70.13*/.CSRF.formField),format.raw/*70.28*/("""
				   	"""),format.raw/*71.9*/("""<input type="submit" class="btn btn-outline-secondary btn-lg" value="Set Up"  onclick="signup()" /></form>
				   	
				   	
				   	<form method ="GET" action = "" id="loginForm">
					"""),_display_(/*75.7*/helper/*75.13*/.CSRF.formField),format.raw/*75.28*/("""
				   	"""),format.raw/*76.9*/("""<input type="submit" class="btn btn-outline-secondary btn-lg" value="Login" onclick="login()" />
				   	</form>
				   
				   
				    <!-- <form method ="GET" action = "" id="setupForm" >
					"""),_display_(/*81.7*/helper/*81.13*/.CSRF.formField),format.raw/*81.28*/("""
				   	"""),format.raw/*82.9*/("""<input type="submit" class="btn btn-outline-secondary btn-lg" value="Set Up"  onclick="setup()" />
				   	</form> -->
				   	
				   
				   </div>
				</p>
				
			
		</div>


		<section id="testimonials">
			<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  			<div class="carousel-inner">
   				<div class="carousel-item active">
					<h2>Absolute delight to work with Bugtracker, was able to quicly solve all the bus</h2>
					<h3>-Sam Smith</h3>
				</div>
				<div class="carousel-item">
					<h2>Dosent work absolute garbage plese fix it before i call the cops</h2>
					<h3>-Sam Smith</h3>
				</div>	
				<div class="carousel-item">
					<h2>ASdknjdka Jndoanms, soidja nfdi us idjsojdoam fidfnika sdiojnfkjdsn jindkk sjd</h2>
					<h3>-Sam Smith</h3>
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
		
	    <script type="text/javascript" src=""""),_display_(/*125.43*/assetsFinder/*125.55*/.path("js/homePage.js")),format.raw/*125.78*/(""""> </script> 
	    <script>
	    function signup()"""),format.raw/*127.23*/("""{"""),format.raw/*127.24*/("""
	    	"""),format.raw/*128.7*/("""document.getElementById("signupForm").action = """"),_display_(/*128.56*/routes/*128.62*/.signUp.sendSignupPage),format.raw/*128.84*/("""";
	    	document.getElementById("signupForm").submit();			
			
		"""),format.raw/*131.3*/("""}"""),format.raw/*131.4*/("""
		
		"""),format.raw/*133.3*/("""function login()"""),format.raw/*133.19*/("""{"""),format.raw/*133.20*/("""
	    	"""),format.raw/*134.7*/("""document.getElementById("loginForm").action = """"),_display_(/*134.55*/routes/*134.61*/.login.loginPage),format.raw/*134.77*/("""";
	    	document.getElementById("loginForm").submit();			
			
		"""),format.raw/*137.3*/("""}"""),format.raw/*137.4*/("""
		
	    """),format.raw/*139.6*/("""</script>
	     
         
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
                  DATE: 2020-07-15T18:47:24.314
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/homePage.scala.html
                  HASH: 1db24f339dbedd2839ea3dda508cada26a87ff74
                  MATRIX: 774->28|910->93|954->109|981->110|1342->444|1363->456|1428->500|1536->581|1557->593|1629->643|1715->702|1736->714|1805->761|1891->820|1912->832|1981->879|2040->911|2061->923|2128->969|2317->1131|2338->1143|2387->1171|4475->3233|4490->3239|4526->3254|4562->3263|4775->3450|4790->3456|4826->3471|4862->3480|5085->3677|5100->3683|5136->3698|5172->3707|6791->5298|6813->5310|6858->5333|6937->5383|6967->5384|7002->5391|7079->5440|7095->5446|7139->5468|7233->5534|7262->5535|7296->5541|7341->5557|7371->5558|7406->5565|7482->5613|7498->5619|7536->5635|7629->5700|7658->5701|7695->5710
                  LINES: 21->2|24->3|27->4|28->5|33->10|33->10|33->10|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|44->21|44->21|44->21|93->70|93->70|93->70|94->71|98->75|98->75|98->75|99->76|104->81|104->81|104->81|105->82|148->125|148->125|148->125|150->127|150->127|151->128|151->128|151->128|151->128|154->131|154->131|156->133|156->133|156->133|157->134|157->134|157->134|157->134|160->137|160->137|162->139
                  -- GENERATED --
              */
          