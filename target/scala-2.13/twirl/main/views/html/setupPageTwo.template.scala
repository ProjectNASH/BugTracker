
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

object setupPageTwo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* trails Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""

"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    	
    	<link href=""""),_display_(/*12.19*/assetsFinder/*12.31*/.path("stylesheets/utils/signupUpload.css")),format.raw/*12.74*/("""" rel="stylesheet">
         <title>UPLOAD PAGE</title>
         
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(/*16.61*/assetsFinder/*16.73*/.path("/images/title images/apple-touch-icon.png")),format.raw/*16.123*/("""">
		<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(/*17.58*/assetsFinder/*17.70*/.path("/images/title images/favicon-32x32.png")),format.raw/*17.117*/("""">
		<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(/*18.58*/assetsFinder/*18.70*/.path("/images/title images/favicon-16x16.png")),format.raw/*18.117*/("""">
		<link rel="manifest" href=""""),_display_(/*19.31*/assetsFinder/*19.43*/.path("/images/title images/site.webmanifest")),format.raw/*19.89*/("""">
        
    </head>
    <body>
    	
    <main role="main" style="background-color:##66ccff">
  <section class="jumbotron text-center" style="background-color:##66ccff">
    <div class="container">
      <h1>Please Upload Employee List in .csv format</h1>
      <p class="lead text-muted">Your .csv file must have the following coloumns: Employee Identity Number(as EmpId); Employee Name(as EmpName) and Employee Department(as EmpDept)<br>
      Click on the below icon or drag and drop the .csv file
      </p>
    </div>
	<!--   <a href="#" class="btn btn-danger btn-lg my-2">Go to Dashboard</a> -->
  </section>
  <div class="container" style="height:30px"></div>
  <section>
  <form action=""""),_display_(/*36.18*/routes/*36.24*/.setup.getEmpData),format.raw/*36.41*/("""" method="POST" enctype="multipart/form-data">
    """),_display_(/*37.6*/helper/*37.12*/.CSRF.formField),format.raw/*37.27*/("""
    """),format.raw/*38.5*/("""<div class="container third">
      <div class="row d-flex justify-content-center">
        <div class="col-md-6">
          <div class="form-group">
            <div class="preview-zone hidden">
              <div class="box box-solid">
                
					<button type="button" class="btn btn-danger btn-lg remove-preview">
                      <i class="fa fa-times"></i> Reset The Field
						</button>
		  <div class="box-body"></div>
              </div>
            </div>
            <div class="dropzone-wrapper d-flex justify-content-center align-items-center border border-white">
              
			  <img src=""""),_display_(/*53.17*/assetsFinder/*53.29*/.path("/images/upload.png")),format.raw/*53.56*/("""" class="img-fluid img-thumbnail five">
              <input type="file" name="sqlFile" class="dropzone">
			 
            </div>
          </div>
        </div>
      </div>

      <div class="row d-flex justify-content-center" >
        <div class="col-md-6 d-flex justify-content-center">
          <button type="submit" class="btn btn-danger btn-lg pull-right">Upload File</button>
        </div>
      </div>
    </div>
  </form>
</section>

</main>	
    	
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    <script  src=""""),_display_(/*75.20*/assetsFinder/*75.32*/.path("/js/setupUpload.js")),format.raw/*75.59*/(""""></script>    
            
    
    </body>
<html>"""))
      }
    }
  }

  def render(request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply()(request,assetsFinder)

  def f:(() => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = () => (request,assetsFinder) => apply()(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-15T18:47:24.474
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/setupPageTwo.scala.html
                  HASH: 2bf2675ef733f20e80b8652a5af4edf41cac4a59
                  MATRIX: 778->28|914->93|958->109|986->111|1191->289|1212->301|1276->344|1649->690|1670->702|1742->752|1829->812|1850->824|1919->871|2006->931|2027->943|2096->990|2156->1023|2177->1035|2244->1081|2971->1781|2986->1787|3024->1804|3102->1856|3117->1862|3153->1877|3185->1882|3838->2508|3859->2520|3907->2547|5011->3624|5032->3636|5080->3663
                  LINES: 21->2|24->3|27->4|29->6|35->12|35->12|35->12|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|59->36|59->36|59->36|60->37|60->37|60->37|61->38|76->53|76->53|76->53|98->75|98->75|98->75
                  -- GENERATED --
              */
          