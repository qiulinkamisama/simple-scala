package com.qiulinsama.basic01

import scala.collection.mutable

/**
 * 同set，也分可变和不可变，默认不可变
 */
object Map10 {
  def main(args: Array[String]): Unit = {
    /**
     * 不可变
     */
    val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III")
    println(romanNumeral(4))

    /**
     * 可变
     */
    val treasureMap: mutable.Map[Int, String] = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))
  }

}
