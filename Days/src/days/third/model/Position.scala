package days.third.model

case class Position (x: Int = 0, y: Int = 0) {
  private val moves = Map('^' -> (0, 5),
    'v' -> (0, -5),
    '>' -> (5, 0),
    '<' -> (-5, 0))

  def nextPosition (order: Char) = Position(moves(order)._1 + x, moves(order)._2 + y)
}
