import java.io.IOException
import java.net.{MalformedURLException, URL}

import scala.sys.process.Process

val url = "http://horstman.com/fred-tiny.gif"
try {
  Process(new URL(url))
} catch {
  case _: MalformedURLException => print("Bad URL " + url)
  case ex: IOException =>ex.printStackTrace()

} finally {

}