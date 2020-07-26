// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Sat Jul 25 17:16:31 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
