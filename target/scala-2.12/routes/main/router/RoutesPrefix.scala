// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Wed May 15 08:28:05 WAT 2019


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
