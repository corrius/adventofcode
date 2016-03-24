package days.third.model

case class Santa (position: Position = Position(), visitedHouses: Set[Position] = Set.empty){
  def takeOrder (order: Char) = {
    Santa(position = position.nextPosition(order), visitedHouses = visitedHouses + position)
  }
  def takeOrders (orders: String) = orders.foldLeft(this)((lastSanta, order) => lastSanta.takeOrder(order))
}
