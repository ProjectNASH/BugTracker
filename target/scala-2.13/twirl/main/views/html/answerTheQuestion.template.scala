
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

object answerTheQuestion extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template10[String,Int,String,String,List[String],List[scala.Tuple5[Int, Int, String, String, Int]],Int,String,RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* answerTheQuestion Template File */
  def apply/*2.2*/(bookNameTemp:String,qsNo: Int, bookname:String,pagehead: String, pageBody:List[String],existingAns : List[((Int,Int,String,String,Int))], no:Int, username: String)(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    	<title>Answer a Query</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>
      	
      	<link rel="stylesheet" href=""""),_display_(/*15.38*/assetsFinder/*15.50*/.path("stylesheets/utils/answerTheQuestion.css")),format.raw/*15.98*/("""" type="text/css"/>  
	<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*16.54*/assetsFinder/*16.66*/.path("/images/title images/apple-touch-icon.png")),format.raw/*16.116*/("""">
	<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*17.57*/assetsFinder/*17.69*/.path("/images/title images/favicon-32x32.png")),format.raw/*17.116*/("""">
	<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*18.57*/assetsFinder/*18.69*/.path("/images/title images/favicon-16x16.png")),format.raw/*18.116*/("""">
	<link rel="manifest" href=""""),_display_(/*19.30*/assetsFinder/*19.42*/.path("/images/title images/site.webmanifest")),format.raw/*19.88*/("""">

        	<!--Write your link and src tags after this comment-->
        	

    </head>
    <body><nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href=""""),_display_(/*26.62*/routes/*26.68*/.dashboard.viewDashboard),format.raw/*26.92*/("""">
      <img src=""""),_display_(/*27.18*/assetsFinder/*27.30*/.path("/images/images.jpeg")),format.raw/*27.58*/("""" width="45" alt="" class="d-inline-block align-middle rounded-circle mr-1"><span class="image1">BUG TRACKER</a>
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
            <a class="nav-link hel" href=""""),_display_(/*47.44*/routes/*47.50*/.dashboard.viewDashboard),format.raw/*47.74*/("""">
              <span data-feather="airplay"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*53.44*/routes/*53.50*/.dashboard.viewMyPages),format.raw/*53.72*/("""">
              <span data-feather="file"></span>
              My Queries/Answers
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link hel" href=""""),_display_(/*59.44*/routes/*59.50*/.dashboard.viewPages),format.raw/*59.70*/("""">
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
            <a class="nav-link hel" href=""""),_display_(/*73.44*/routes/*73.50*/.dashboard.changePassWordOne),format.raw/*73.78*/("""">
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
        <form class="nav-link " action=""""),_display_(/*88.42*/routes/*88.48*/.login.logout()),format.raw/*88.63*/("""" method ="GET"><input type = "submit" class="btn btn-danger" value ="Sign Out"></input></form>
        </li>
      </ul>
      </div>
    </nav>
    
          
	 
	<div class="container space"></div>	
    
    
    
    
    
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <div class="h3">"""),_display_(/*104.26*/pagehead),format.raw/*104.34*/("""</div>
      </div>
     
	 <div class="card">
	 
		<div class="card-header">
		<div class="card-text col-sm-3 font-weight-bolder text-wrap">Posted By<span class="badge badge-light" style="font-size:0.9rem">"""),_display_(/*110.131*/bookNameTemp),format.raw/*110.143*/("""</span></div><br>
		
		<ol>"""),_display_(/*112.8*/for(line<-pageBody) yield /*112.27*/{_display_(Seq[Any](format.raw/*112.28*/("""
                   """),format.raw/*113.20*/("""<li>"""),_display_(/*113.25*/line),format.raw/*113.29*/("""</li><br>
                 """)))}),format.raw/*114.19*/("""
        """),format.raw/*115.9*/("""</ol>
                 
		</div>
		<br>
		<div class="h3">&nbsp;
		"""),_display_(/*120.4*/no),format.raw/*120.6*/(""" """),format.raw/*120.7*/("""Answers
		</div>
	"""),_display_(/*122.3*/for((slno,qsno,ans,solver,working)<-existingAns) yield /*122.51*/{_display_(Seq[Any](format.raw/*122.52*/("""
	"""),_display_(/*123.3*/if(!ans.equals("null"))/*123.26*/{_display_(Seq[Any](format.raw/*123.27*/("""	
    """),format.raw/*124.5*/("""<div class="card-body">
		<div class="container">		
		"""),_display_(/*126.4*/if(bookNameTemp.equals(username))/*126.37*/{_display_(Seq[Any](format.raw/*126.38*/("""
		"""),format.raw/*127.3*/("""<form action = """"),_display_(/*127.20*/routes/*127.26*/.answerQuery.markWorkingSolution(slno,bookNameTemp,working,qsno)),format.raw/*127.90*/("""" type="GET">			
			<div class="card-text col-sm-6 col-6 font-weight-bolder text-wrap" style="float:right;">
			<input type="hidden" name="slno" value=""""),_display_(/*129.45*/slno),format.raw/*129.49*/("""" style="visibility:hidden;">
			<input type="hidden" name="bookNameTemp" value=""""),_display_(/*130.53*/bookNameTemp),format.raw/*130.65*/("""" style="visibility:hidden;">
			<input type="hidden" name="qsno" value=""""),_display_(/*131.45*/qsno),format.raw/*131.49*/("""" style="visibility:hidden;">
			<input type="hidden" name="working" value=""""),_display_(/*132.48*/working),format.raw/*132.55*/("""" style="visibility:hidden;">
			"""),_display_(/*133.5*/if(working == 0)/*133.21*/{_display_(Seq[Any](format.raw/*133.22*/("""
			"""),format.raw/*134.4*/("""<input type="submit" value="Mark as Working" style="background-color:red;color:white;border-radius: 25px;">
			""")))}),format.raw/*135.5*/("""
			
			"""),_display_(/*137.5*/if(working == 1)/*137.21*/{_display_(Seq[Any](format.raw/*137.22*/("""
			"""),format.raw/*138.4*/("""<input type="submit" value="Working Solution" style="background-color:green;color:white;border-radius: 25px;">		
			""")))}),format.raw/*139.5*/("""
			
			
			"""),format.raw/*142.4*/("""</div>		
			</form>
		""")))}),format.raw/*144.4*/("""
		
			"""),format.raw/*146.4*/("""<div class="card-text col-sm-6 col-6 font-weight-bolder text-wrap">By <span class="badge badge-secondary" style="font-size:0.85rem">"""),_display_(/*146.137*/solver),format.raw/*146.143*/("""</span></div><br>
			
			
			<div class="col-sm-12"><span class="me"> """),_display_(/*149.46*/ans),format.raw/*149.49*/("""</span></div>
		</div>
</div>
<br>
""")))}),format.raw/*153.2*/("""
""")))}),format.raw/*154.2*/("""




		
		
	
	
	"""),format.raw/*163.2*/("""<br>
	
  <div class="card-body" id ="quillEdit">
		<div class="cotainer">
			<form action = """"),_display_(/*167.21*/routes/*167.27*/.answerQuery.answerThequestion),format.raw/*167.57*/("""" method ="POST" enctype="multipart/form-data">
  	"""),_display_(/*168.5*/helper/*168.11*/.CSRF.formField),format.raw/*168.26*/("""
				"""),format.raw/*169.5*/("""<div class="form-group">
					<label for="body"><span class="subhead">Your Answer</span></label><br>
					<textarea id="body" class="body" name = "answer"></textarea>
				</div>
			
				
				<input type="hidden" name="qsNo" value=""""),_display_(/*175.46*/qsNo),format.raw/*175.50*/("""" style="visibility:hidden;">
				<input type="hidden" name="bookname" value=""""),_display_(/*176.50*/bookname),format.raw/*176.58*/("""" style="visibility:hidden;position:absolute; ">
				
				
				<span id="third"></span>
			
			<div class="row">
				<div class="col-lg-9 col-md-7 col-sm-12"><span class="page"></span></div>
				<div class="col-lg-3 col-md-5 col-sm-12  justify-content-center">	
						<div class="btn-toolbar mb-2 mb-md-0">						
								
								<input type="submit" value="Submit" class="btn btn-info" >
								
							<div class="space4"></div>							
						</div>
				   </div>
			    </div>
			    </form>
			  </div>
			</div>
		  
		  </div>
		</main>	
	</div>
  </div>
  		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <script>
      (function () """),format.raw/*206.20*/("""{"""),format.raw/*206.21*/("""
          """),format.raw/*207.11*/("""'use strict'

        feather.replace()
"""),format.raw/*210.1*/("""}"""),format.raw/*210.2*/("""())
const l = document.getElementById("first");
const m = document.getElementById("second");
const n = document.getElementById("third");

m.addEventListener("click", function() """),format.raw/*215.40*/("""{"""),format.raw/*215.41*/("""
  """),format.raw/*216.3*/("""l.click();
"""),format.raw/*217.1*/("""}"""),format.raw/*217.2*/(""");

l.addEventListener("change", function() """),format.raw/*219.41*/("""{"""),format.raw/*219.42*/("""
  """),format.raw/*220.3*/("""if (l.value) """),format.raw/*220.16*/("""{"""),format.raw/*220.17*/("""
    """),format.raw/*221.5*/("""n.innerHTML = l.value.match(/[\/\\]([\w\d\s\.\-\(\)]+)$/)[1];
  """),format.raw/*222.3*/("""}"""),format.raw/*222.4*/(""" """),format.raw/*222.5*/("""else """),format.raw/*222.10*/("""{"""),format.raw/*222.11*/("""
    """),format.raw/*223.5*/("""n.innerHTML = "No file chosen, yet.";
  """),format.raw/*224.3*/("""}"""),format.raw/*224.4*/("""
"""),format.raw/*225.1*/("""}"""),format.raw/*225.2*/(""");


      </script> 
  </body>
  </html>
    


"""))
      }
    }
  }

  def render(bookNameTemp:String,qsNo:Int,bookname:String,pagehead:String,pageBody:List[String],existingAns:List[scala.Tuple5[Int, Int, String, String, Int]],no:Int,username:String,request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(bookNameTemp,qsNo,bookname,pagehead,pageBody,existingAns,no,username)(request,assetsFinder)

  def f:((String,Int,String,String,List[String],List[scala.Tuple5[Int, Int, String, String, Int]],Int,String) => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (bookNameTemp,qsNo,bookname,pagehead,pageBody,existingAns,no,username) => (request,assetsFinder) => apply(bookNameTemp,qsNo,bookname,pagehead,pageBody,existingAns,no,username)(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-30T17:37:28.980
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/answerTheQuestion.scala.html
                  HASH: 4db1c682d2484415a18754b9fcb27bf695bb3c17
                  MATRIX: 894->39|1192->266|1236->282|1263->283|1878->871|1899->883|1968->931|2070->1006|2091->1018|2163->1068|2249->1127|2270->1139|2339->1186|2425->1245|2446->1257|2515->1304|2574->1336|2595->1348|2662->1394|2929->1634|2944->1640|2989->1664|3036->1684|3057->1696|3106->1724|4002->2593|4017->2599|4062->2623|4275->2809|4290->2815|4333->2837|4552->3029|4567->3035|4608->3055|5062->3482|5077->3488|5126->3516|5665->4028|5680->4034|5716->4049|6194->4499|6224->4507|6461->4715|6496->4727|6551->4755|6587->4774|6627->4775|6676->4795|6709->4800|6735->4804|6795->4832|6832->4841|6927->4909|6950->4911|6979->4912|7025->4931|7090->4979|7130->4980|7160->4983|7193->5006|7233->5007|7267->5013|7349->5068|7392->5101|7432->5102|7463->5105|7508->5122|7524->5128|7610->5192|7791->5345|7817->5349|7927->5431|7961->5443|8063->5517|8089->5521|8194->5598|8223->5605|8284->5639|8310->5655|8350->5656|8382->5660|8525->5772|8561->5781|8587->5797|8627->5798|8659->5802|8807->5919|8847->5931|8901->5954|8936->5961|9098->6094|9127->6100|9226->6171|9251->6174|9318->6210|9351->6212|9395->6228|9517->6322|9533->6328|9585->6358|9664->6410|9680->6416|9717->6431|9750->6436|10010->6668|10036->6672|10143->6751|10173->6759|11493->8050|11523->8051|11563->8062|11631->8102|11660->8103|11866->8280|11896->8281|11927->8284|11966->8295|11995->8296|12068->8340|12098->8341|12129->8344|12171->8357|12201->8358|12234->8363|12326->8427|12355->8428|12384->8429|12418->8434|12448->8435|12481->8440|12549->8480|12578->8481|12607->8482|12636->8483
                  LINES: 21->2|24->3|27->4|28->5|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|49->26|49->26|49->26|50->27|50->27|50->27|70->47|70->47|70->47|76->53|76->53|76->53|82->59|82->59|82->59|96->73|96->73|96->73|111->88|111->88|111->88|127->104|127->104|133->110|133->110|135->112|135->112|135->112|136->113|136->113|136->113|137->114|138->115|143->120|143->120|143->120|145->122|145->122|145->122|146->123|146->123|146->123|147->124|149->126|149->126|149->126|150->127|150->127|150->127|150->127|152->129|152->129|153->130|153->130|154->131|154->131|155->132|155->132|156->133|156->133|156->133|157->134|158->135|160->137|160->137|160->137|161->138|162->139|165->142|167->144|169->146|169->146|169->146|172->149|172->149|176->153|177->154|186->163|190->167|190->167|190->167|191->168|191->168|191->168|192->169|198->175|198->175|199->176|199->176|229->206|229->206|230->207|233->210|233->210|238->215|238->215|239->216|240->217|240->217|242->219|242->219|243->220|243->220|243->220|244->221|245->222|245->222|245->222|245->222|245->222|246->223|247->224|247->224|248->225|248->225
                  -- GENERATED --
              */
          