package helpers

import java.io.File

object PathUtil {

  val ProjectPath = new File(".").getCanonicalPath()
  val InputsPath = ProjectPath + "/Days/src/inputs/"

}
