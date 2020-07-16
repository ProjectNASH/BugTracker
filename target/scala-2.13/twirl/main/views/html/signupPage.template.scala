
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

object signupPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""


"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title> SignUp to BugTracker </title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" href=""""),_display_(/*13.39*/assetsFinder/*13.51*/.path("stylesheets/utils/signup.css")),format.raw/*13.88*/("""" type="text/css"/>
        
        
	<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*16.54*/assetsFinder/*16.66*/.path("/images/title images/apple-touch-icon.png")),format.raw/*16.116*/("""">
	<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*17.57*/assetsFinder/*17.69*/.path("/images/title images/favicon-32x32.png")),format.raw/*17.116*/("""">
	<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*18.57*/assetsFinder/*18.69*/.path("/images/title images/favicon-16x16.png")),format.raw/*18.116*/("""">
	<link rel="manifest" href=""""),_display_(/*19.30*/assetsFinder/*19.42*/.path("/images/title images/site.webmanifest")),format.raw/*19.88*/("""">
        
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
                            <p id="signup">Sign up to kill the bugs!</p>
                            <form method ="POST" action = """"),_display_(/*32.61*/routes/*32.67*/.signUp.getSignupInfo()),format.raw/*32.90*/("""">
                            """),_display_(/*33.30*/helper/*33.36*/.CSRF.formField),format.raw/*33.51*/("""
                                """),format.raw/*34.33*/("""<div class="form-group">
                                     <label for="Name">Name</label>
                                     <input type="text" class="form-control form-group" name="username" placeholder="Name">
                                </div>
                                <div class="form-group">
                                     <label for="Contact">Department</label>
                                     <input type="text" class="form-control form-group" name="dept" placeholder="Department(e.g. Testing)">
                                </div>
                                
                                <div class="form-group">
                                     <label for="Email">Email</label>
                                     <input type="text" class="form-control form-group" name="email" placeholder="Email">
                                </div>
                                <div class="form-group">
                                    <label for="Password">Password</label>
                                    <input type="Password" class="form-control form-group" name="password" placeholder="Password">
                                 </div>
                                 
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
                  DATE: 2020-07-15T18:47:24.488
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/signupPage.scala.html
                  HASH: d755aac6a522ae57b8ba95450e0bf57aeb3cf7ad
                  MATRIX: 776->28|912->93|956->109|985->112|1359->459|1380->471|1438->508|1556->599|1577->611|1649->661|1735->720|1756->732|1825->779|1911->838|1932->850|2001->897|2060->929|2081->941|2148->987|2709->1521|2724->1527|2768->1550|2827->1582|2842->1588|2878->1603|2939->1636
                  LINES: 21->2|24->3|27->4|30->7|36->13|36->13|36->13|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|55->32|55->32|55->32|56->33|56->33|56->33|57->34
                  -- GENERATED --
              */
          