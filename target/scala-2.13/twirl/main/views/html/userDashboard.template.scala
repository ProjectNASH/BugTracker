
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

object userDashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Map[String, String],Int,Int,Int,RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/(argsMaps:Map[String,String], qsno:Int,ansno:Int,notans:Int)(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
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
        	
        
        	
        	
        	
        	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">

      // Load the Visualization API and the corechart package.
      google.charts.load('current', """),format.raw/*31.37*/("""{"""),format.raw/*31.38*/("""'packages':['corechart']"""),format.raw/*31.62*/("""}"""),format.raw/*31.63*/(""");

      // Set a callback to run when the Google Visualization API is loaded.
      google.charts.setOnLoadCallback(drawChart);

      // Callback that creates and populates a data table,
      // instantiates the pie chart, passes in the data and
      // draws it.
      function drawChart() """),format.raw/*39.28*/("""{"""),format.raw/*39.29*/("""

        """),format.raw/*41.9*/("""// Create the data table.
              
      var data = new google.visualization.DataTable();
        data.addColumn('string', 'DomainQs');
        data.addColumn('number', 'No');
        data.addRows([
          ['Unanswered', """),_display_(/*47.27*/notans),format.raw/*47.33*/("""],
          ['Answered', """),_display_(/*48.25*/ansno),format.raw/*48.30*/("""]          
        ]);

var options = """),format.raw/*51.15*/("""{"""),format.raw/*51.16*/("""'title':'Total Qs:"""),_display_(/*51.35*/qsno),format.raw/*51.39*/("""',
                       'width':300,
                       'height':300"""),format.raw/*53.36*/("""}"""),format.raw/*53.37*/(""";

var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      """),format.raw/*57.7*/("""}"""),format.raw/*57.8*/("""
    """),format.raw/*58.5*/("""</script>

    </head>
    <body><nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href=""""),_display_(/*62.62*/routes/*62.68*/.dashboard.viewDashboard),format.raw/*62.92*/("""">
      <img src=""""),_display_(/*63.18*/assetsFinder/*63.30*/.path("/images/images.jpeg")),format.raw/*63.58*/("""" width="45" alt="" class="d-inline-block align-middle rounded-circle mr-1"><span class="image1">BUG TRACKER</a>
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
            <a class="nav-link hel" href=""""),_display_(/*83.44*/routes/*83.50*/.dashboard.viewDashboard),format.raw/*83.74*/("""">
              <span data-feather="airplay"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*89.44*/routes/*89.50*/.dashboard.viewMyPages),format.raw/*89.72*/("""">
              <span data-feather="file"></span>
              My Queries/Answers
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*95.44*/routes/*95.50*/.dashboard.viewPages),format.raw/*95.70*/("""">
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
            <a class="nav-link hel" href=""""),_display_(/*109.44*/routes/*109.50*/.dashboard.changePassWordOne),format.raw/*109.78*/("""">
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
        <form class="nav-link " action=""""),_display_(/*124.42*/routes/*124.48*/.login.logout()),format.raw/*124.63*/("""" method ="GET"><input type = "submit" class="btn btn-danger" value ="Sign Out"></input></form>
        </li>
      </ul>
      </div>
    </nav>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Dashboard</h1>
        		       
        <div class="btn-toolbar mb-2 mb-md-0">
        
                <form name="createPage" action =""""),_display_(/*136.51*/routes/*136.57*/.dashboard.createPage),format.raw/*136.78*/("""" method="GET" style="display:inline-flex; margin:0px;
    padding:0px;">
        """),_display_(/*138.10*/helper/*138.16*/.CSRF.formField),format.raw/*138.31*/("""
          """),format.raw/*139.11*/("""<button type="submit" class="btn btn-sm btn-outline-secondary">
            <span data-feather="help-circle"></span>
            Post Query
          </button>
          </form>
           
          <div class="space"></div>
          
          <form name="viewPage" action =""""),_display_(/*147.43*/routes/*147.49*/.dashboard.viewPages),format.raw/*147.69*/("""" method="GET" style="display:inline-flex; margin:0px;
    padding:0px;">
        """),_display_(/*149.10*/helper/*149.16*/.CSRF.formField),format.raw/*149.31*/("""
          """),format.raw/*150.11*/("""<button type="submit" class="btn btn-sm btn-outline-secondary ">
            <span data-feather="book"></span>
            View Queries
          </button>
          </form>
          
        </div>
      </div>
	 <div class="card first">
  <h5 class="card-header">PROFILE</h5>
  <div class="row">
  <div class="card-body col-6" id ="userinfo">
  <div class="inner1">
  		<h3><div class="col-sm-8">User Info</div></h3><br>
		<div class="row">
		<div class="card-text col-sm-3  text-wrap"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem"> Name </span></div>
		<div class="col-sm-8"><span class="me"> """),_display_(/*166.44*/argsMaps("name")),format.raw/*166.60*/("""</span></div>
		 </div>
	
	<div class="space"></div>

	<div class="row">
		<div class="card-text col-sm-3 font-weight-bolder text-wrap"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem"> Username</span></div>
		<div class="col-sm-9"><span class="me"> """),_display_(/*173.44*/argsMaps("username")),format.raw/*173.64*/("""</span></div>
		
	</div>
		

		<div class="space"></div>
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bold"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem"> Profession </span></div>
		<div class="col-sm-9"><span class="me">	"""),_display_(/*181.44*/argsMaps("dept")),format.raw/*181.60*/("""</span></div>
	</div>
		<div class="space"></div>
	<div class="row">
		<div class="card-text col-sm-3 font-weight-bold text-wrap"><span class="badge badge-secondary" style="width:6rem;font-size:0.85rem">Email</span></div>
		<div class="col-sm-9"><span class="me" >"""),_display_(/*186.44*/argsMaps("email")),format.raw/*186.61*/("""</span></div>
	</div>
 
  </div>
  </div>
  <div class="container d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center col-6">
	<div class="container inner">
 		<div id="chart_div"></div>
	</div>
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
        (function () """),format.raw/*208.22*/("""{"""),format.raw/*208.23*/("""
            """),format.raw/*209.13*/("""'use strict'

          feather.replace()
                """),format.raw/*212.17*/("""}"""),format.raw/*212.18*/("""())
          

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

  def render(argsMaps:Map[String, String],qsno:Int,ansno:Int,notans:Int,request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(argsMaps,qsno,ansno,notans)(request,assetsFinder)

  def f:((Map[String, String],Int,Int,Int) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (argsMaps,qsno,ansno,notans) => (request,assetsFinder) => apply(argsMaps,qsno,ansno,notans)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-31T01:47:07.347
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/userDashboard.scala.html
                  HASH: 31cf004f95c6e701d41b400370a8ebdbc5ac73df
                  MATRIX: 811->28|1005->151|1049->167|1076->168|1700->765|1721->777|1786->821|1888->896|1909->908|1981->958|2067->1017|2088->1029|2157->1076|2243->1135|2264->1147|2333->1194|2392->1226|2413->1238|2480->1284|2858->1634|2887->1635|2939->1659|2968->1660|3292->1956|3321->1957|3358->1967|3616->2198|3643->2204|3697->2231|3723->2236|3790->2275|3819->2276|3865->2295|3890->2299|3992->2373|4021->2374|4177->2503|4205->2504|4237->2509|4436->2681|4451->2687|4496->2711|4543->2731|4564->2743|4613->2771|5513->3644|5528->3650|5573->3674|5786->3860|5801->3866|5844->3888|6063->4080|6078->4086|6119->4106|6574->4533|6590->4539|6640->4567|7180->5079|7196->5085|7233->5100|7763->5602|7779->5608|7822->5629|7933->5712|7949->5718|7986->5733|8026->5744|8333->6023|8349->6029|8391->6049|8502->6132|8518->6138|8555->6153|8595->6164|9248->6789|9286->6805|9589->7080|9631->7100|9928->7369|9966->7385|10259->7650|10298->7667|11218->8558|11248->8559|11290->8572|11377->8630|11407->8631
                  LINES: 21->2|24->3|27->4|28->5|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|54->31|54->31|54->31|54->31|62->39|62->39|64->41|70->47|70->47|71->48|71->48|74->51|74->51|74->51|74->51|76->53|76->53|80->57|80->57|81->58|85->62|85->62|85->62|86->63|86->63|86->63|106->83|106->83|106->83|112->89|112->89|112->89|118->95|118->95|118->95|132->109|132->109|132->109|147->124|147->124|147->124|159->136|159->136|159->136|161->138|161->138|161->138|162->139|170->147|170->147|170->147|172->149|172->149|172->149|173->150|189->166|189->166|196->173|196->173|204->181|204->181|209->186|209->186|231->208|231->208|232->209|235->212|235->212
                  -- GENERATED --
              */
          