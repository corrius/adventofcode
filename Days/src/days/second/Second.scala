package days.second

import days.second.model.Gift
import helpers.PathUtil

import scala.io.Source

object Second {

  def main(args: Array[String]): Unit = {

    val inputPath = PathUtil.InputsPath + "2th"

    val inputLines = Source.fromFile(inputPath).getLines()
    val gifts = inputLines.map(Gift.fromString).toList
    val totalArea = gifts.foldLeft(0)((accumulatedArea, gift) => accumulatedArea + gift.wrappingArea)
    println(s"Total gift paper needed $totalArea square feet")
    val totalRibbon = gifts.foldLeft(0)((totalLength, gift) => totalLength + gift.ribbonNeeded)
    println(s"Total ribbon needed $totalRibbon feet")

  }


}
