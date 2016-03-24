package days.third.model

case class SantaTeam (santa: Santa = Santa(), roboSanta: RoboSanta = RoboSanta()) {
  def visitedHouses = santa.visitedHouses ++ roboSanta.visitedHouses
}

