package $package$

import org.scalatra._
import scalate.ScalateSupport

class $servlet_name$ extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType="text/html"

    ssp("/index")
  }
}
