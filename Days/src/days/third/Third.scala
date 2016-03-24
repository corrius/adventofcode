package days.third

import days.third.model.{OrderWithIndex, SantaTeam, Santa}
import helpers.PathUtil

import scala.io.Source

object Third {

  def main(args: Array[String]): Unit = {

    //First version
    val firstHousesVisited = Santa().takeOrders(orders).visitedHouses
    println(s"Santa visited ${firstHousesVisited.size} different houses")

    //Second version
    val secondVisits = orders.zipWithIndex.map(order => OrderWithIndex(order._1, order._2))
      .foldLeft(SantaTeam())(dealOrders)
    println(s"Santa with Robo Santa visited ${secondVisits.visitedHouses.size} different houses")


  }

  def dealOrders (santas: SantaTeam, orderWitIndex: OrderWithIndex) = {
    if (orderWitIndex.idx % 2 == 0) santas.copy(santa = santas.santa.takeOrder(orderWitIndex.order))
    else santas.copy(roboSanta = santas.roboSanta.takeOrder(orderWitIndex.order))
  }

  val orders = Source.fromFile(PathUtil.InputsPath + "3th").getLines().next()


}

