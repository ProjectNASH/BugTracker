
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

object errorPageThree extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Int,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(errorCode: Int, head:String,body:String,time:String,url:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.66*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="utf-8">
    	 <title>"""),_display_(/*7.15*/head),format.raw/*7.19*/("""</title>
    	 <meta http-equiv = "refresh" content = """"),_display_(/*8.48*/time),format.raw/*8.52*/("""; url = """),_display_(/*8.61*/url),format.raw/*8.64*/("""" />

    	 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
    	
    	<div class="container-fluid part1">
		<div class="inner">
		<p class="heading"><h1>"""),_display_(/*17.27*/head),format.raw/*17.31*/("""</h1></p></br>
	
    	</br>
    	<hr>
    	
    	<label for="usr"><span class="heading2">
				<h2>"""),_display_(/*23.10*/body),format.raw/*23.14*/("""</h2>
    	</span></label></br>  
    	
		</div>
		</div>
    	
    	
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>

		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    	
    </body>
</html>"""))
      }
    }
  }

  def render(errorCode:Int,head:String,body:String,time:String,url:String): play.twirl.api.HtmlFormat.Appendable = apply(errorCode,head,body,time,url)

  def f:((Int,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (errorCode,head,body,time,url) => apply(errorCode,head,body,time,url)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-30T15:20:31.081
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/errorPageThree.scala.html
                  HASH: 76a2ddbb6bb6959b20c46b8047e45c8280f03164
                  MATRIX: 763->1|922->65|952->69|1058->149|1082->153|1165->210|1189->214|1224->223|1247->226|1718->670|1743->674|1875->779|1900->783
                  LINES: 21->1|26->1|28->3|32->7|32->7|33->8|33->8|33->8|33->8|42->17|42->17|48->23|48->23
                  -- GENERATED --
              */
          