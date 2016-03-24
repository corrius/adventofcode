package days.second.model

case class Gift(length: Int, width: Int, height: Int) {

  val edgesSorted = Array(length, width, height).sortWith(_ < _)
  val surfaceArea = 2*length*width + 2*width*height + 2*height*length
  val smallestSideArea = edgesSorted.take(2).reduce(_ * _)
  val wrappingArea = surfaceArea + smallestSideArea
  val volume = length * width * height
  val shortestDistanceAroundSides = 2 * (edgesSorted.take(2).reduce(_ + _))
  val ribbonNeeded = volume + shortestDistanceAroundSides

}

object Gift {
  def fromString (dimensions: String) = {
    val arrayDimensions = dimensions.toLowerCase.split('x')
    Gift(length = arrayDimensions(0).toInt, width = arrayDimensions(1).toInt, height = arrayDimensions(2).toInt)
  }
}
