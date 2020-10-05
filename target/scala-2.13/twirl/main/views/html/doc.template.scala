
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

object doc extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /* documentation Template File */
  def apply/*2.2*/()(implicit request: RequestHeader, assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.65*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>BugTracker Documentation</title>
</head>
<body>
	<font face="Helvetica"><h1><u>BugTracker Documentation</u></h1></font>
	<font size=4 face="Helvetica">BugTracker is a simple web application aimed at teams to post and solve bugs that they encounter during their development cycle. It may be regarded as a type of issue tracking system. The main benefit of a bug-tracking system is to provide a clear centralized overview of development requests. In a corporate environment, a bug-tracking system may be used to generate reports on the productivity of programmers at fixing bugs.</font>

	<font face="Helvetica"><h1><u>Features of BugTracker</u></h1></font>
	<font size=3 face="Helvetica">
		<ol>
			<li>Simple interface</li>
			<li>Encryption Enabled</li>
			<li>Authentication and Authorization</li>
			<li>Email Notification System</li>
			<li>Reset Password</li>
			
		</ol>
	</font>

	<font face="Helvetica"><h1><u>How does BugTracker work?</u></h1></font>
	<font size=4 face="Helvetica">BugTracker was developed keeping simplicity in mind. 
		<ol>
			<li><u><b>Setup BugTracker</b></u></li><br>
			<font size=3 face="Helvetica">
				<p>On server-side, few of the things that needs to setup are- </p>

				<ul>
					<li>DBMS-MySQL</li>
					<li>Scala-sbt</li>
				</ul>
				<br>
				<p>It is important that whoever is setting up the application should have some knowledge of Scala and Play Framework.</p>
				<ol>
					<li>Download BugTracker</li>
					<li>Create a database in MySQL called <i>"bugtracker"</i>.</li>
					<li>Open up CMD and go to <i>"../play-samples-play-scala-starter-example</i>"</li>
					<li>Start the application (usually <i>"sbt run"</i>)</li>
					<li>Open your web-browser and visit <i>"localhost:3000" (You can also setup this up in your backend-server, this documentation is for demonstration purpose)</i></li>
					<li>Click Setup</li>
					<li>Follow as per the instructions provided</li>
					
				</ol>
				<p><b>NOTE:</b> You could face some delay in the setup  because one stage in the process is the "Email Notification Sytem", where email-notifications are sent to the users of the application, notifying them that their account has been set up on BugTracker.</p>
			</font>
			<br>
			<li><u><b>Posting bugs/Answering them</b></u></li>
			<font size=3 face="Helvetica">
			<p>Posting and answering bugs is simple. After logging in, you can see "Post Quesries" or "View Queries" where you can report a bug or answer the queries of your team-mates.</p>
		</ol>
	</font>
	<a href = """"),_display_(/*57.14*/routes/*57.20*/.HomeController.index),format.raw/*57.41*/("""">Go Back</a>
</body>
</html>"""))
      }
    }
  }

  def render(request:RequestHeader,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply()(request,assetsFinder)

  def f:(() => (RequestHeader,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = () => (request,assetsFinder) => apply()(request,assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-10-05T12:43:26.603
                  SOURCE: C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/app/views/doc.scala.html
                  HASH: 1bc9c0b9195cf97d1f757e9b2e7beaf0b598cef2
                  MATRIX: 776->36|912->102|957->99|985->119|1013->121|3651->2732|3666->2738|3708->2759
                  LINES: 21->2|24->3|27->2|28->4|29->5|81->57|81->57|81->57
                  -- GENERATED --
              */
          