package days.first

import helpers.PathUtil

import scala.io.Source

object First {
  def main(args: Array[String]): Unit = {

    val finalFloor = instructions.foldLeft(0)(nextFloor)
    println(finalFloor)
  }

  def nextFloor(actualFloor: Int, step: Char) = {
    val move = step match {
      case '(' => 1
      case ')' => -1
    }
    actualFloor + move
  }

  val instructions = Source.fromFile(PathUtil.InputsPath + "1th").getLines().next()

}
