
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

object setupPageOne extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""



"""),format.raw/*8.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title> Setup BugTracker </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        
      	<link rel="stylesheet" href=""""),_display_(/*14.38*/assetsFinder/*14.50*/.path("stylesheets/utils/signup.css")),format.raw/*14.87*/("""" type="text/css"/> 
       
        
	<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*17.54*/assetsFinder/*17.66*/.path("/images/title images/apple-touch-icon.png")),format.raw/*17.116*/("""">
	<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*18.57*/assetsFinder/*18.69*/.path("/images/title images/favicon-32x32.png")),format.raw/*18.116*/("""">
	<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*19.57*/assetsFinder/*19.69*/.path("/images/title images/favicon-16x16.png")),format.raw/*19.116*/("""">
	<link rel="manifest" href=""""),_display_(/*20.30*/assetsFinder/*20.42*/.path("/images/title images/site.webmanifest")),format.raw/*20.88*/("""">
        
    </head>
    <body>
    	<div class="container">
            <div class="row">
                <div class="col-xs-6 col-sm-8 col-md-auto">
                    <div class ="panel panel-default">
                        <div class="panel-heading">
                            <h1>Welcome to BugTracker!</h1>
                        </div>
                        <div class="panel-body">
                            <p id="signup" style="font-size:2em;">Setup BugTracker for your organisation. Spend less time communicating and solve bugs quickly</p>
                            <form method ="POST" action = """"),_display_(/*33.61*/routes/*33.67*/.setup.getSetUpInfo()),format.raw/*33.88*/("""">
                            """),_display_(/*34.30*/helper/*34.36*/.CSRF.formField),format.raw/*34.51*/("""
                                """),format.raw/*35.33*/("""<div class="form-group">
                                     <label for="Name">Full Name</label>
                                     <input type="text" class="form-control form-group" name="username" placeholder="Name">
                                </div>
                                <div class="form-group">
                                     <label for="Contact">Organisation Name</label>
                                     <input type="text" class="form-control form-group" name="org" placeholder="E.g. Facebook">
                                </div>
                                
                                <div class="form-group">
                                     <label for="Email">Registered Company Domain</label>
                                     <input type="text" class="form-control form-group" name="domain" placeholder="E.g heritageit.edu.in">
                                </div>
                                <div class="form-group">
                                     <label for="Email">Organization Provided Email</label>
                                     <input type="text" class="form-control form-group" name="sysemail" placeholder="E.g heritageit.edu.in">
                                </div>
                                <div class="form-group">
                                     <label for="Email">Create Password</label>
                                     <input type="password" class="form-control form-group" name="syspassword" placeholder="E.g heritageit.edu.in">
                                </div>
                                <!-- <div class="form-group">
                                     <label for="Email">Confirm Password</label>
                                     <input type="text" class="form-control form-group" name="syspassword" placeholder="E.g heritageit.edu.in">
                                </div> -->
                                
                                 
                                <input type="submit" value="Submit" class="btn btn-primary">    
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>  
        
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
                  DATE: 2020-07-15T18:47:24.439
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/setupPageOne.scala.html
                  HASH: e1e4d6c14ee5f77bd5f1c831292738d223b6be6c
                  MATRIX: 778->28|914->93|958->109|988->113|1357->455|1378->467|1436->504|1554->595|1575->607|1647->657|1733->716|1754->728|1823->775|1909->834|1930->846|1999->893|2058->925|2079->937|2146->983|2797->1607|2812->1613|2854->1634|2913->1666|2928->1672|2964->1687|3025->1720
                  LINES: 21->2|24->3|27->4|31->8|37->14|37->14|37->14|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|56->33|56->33|56->33|57->34|57->34|57->34|58->35
                  -- GENERATED --
              */
          