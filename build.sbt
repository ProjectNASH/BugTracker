lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-scala-starter-example""",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.1",
    resolvers += "Atlassian Releases" at "https://maven.atlassian.com/public/",
    libraryDependencies ++= Seq(
      guice,
      javaJdbc,
      jdbc,      
      "com.h2database" % "h2" % "1.4.199",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      "mysql" % "mysql-connector-java" % "8.0.17",
      "com.typesafe.play" %% "play-slick" % "5.0.0",      
      "com.typesafe.slick" %% "slick-codegen" % "3.3.2",
      "org.playframework.anorm" %% "anorm" % "2.6.5",
      "org.webjars" % "bootstrap" % "3.3.4",
      "com.mohiva" %% "play-silhouette" % "7.0.0",
      "com.mohiva" %% "play-silhouette-password-bcrypt" % "7.0.0",
      "com.mohiva" %% "play-silhouette-crypto-jca" % "7.0.0",
     "com.mohiva" %% "play-silhouette-persistence" % "7.0.0",
     "com.mohiva" %% "play-silhouette-testkit" % "7.0.0" % "test",
     "com.pauldijou" %% "jwt-play-json" % "4.3.0",
     "com.pauldijou" %% "jwt-play" % "4.3.0",
     "com.pauldijou" %% "jwt-core" % "4.3.0",
     "io.spray" %%  "spray-json" % "1.3.5"
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    ),
    resolvers ++= Seq("scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"),
   
  )

updateOptions := updateOptions.value.withCachedResolution(false)

includeFilter in (Assets, LessKeys.less) := "*.less"

excludeFilter in (Assets, LessKeys.less) := "_*.less"

