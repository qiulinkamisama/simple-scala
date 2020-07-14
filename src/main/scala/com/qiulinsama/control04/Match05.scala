package com.qiulinsama.control04

object Match05 extends App {
  val firstArg = "sauce"

  firstArg match {
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")
  }

  val friend =
    firstArg match {
      case "salt" => "pepper"
      case "chips" => "salsa"
      case "eggs" => "bacon"
      case _ => "huh?"
    }
  println(friend)
}
