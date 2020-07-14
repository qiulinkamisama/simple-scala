package org.example.course05
import scala.collection.mutable._
object MapApp extends App {

  val a = Map("y" -> 18,"q" ->20,"l"->12)
  a("y") = 10
  println(a("y"))
  println(a("q"))
  println(a.get("y").get)
  println(a.getOrElse("lalala",10000))
  a("c")=40
  println(a("c"))

  println("~~~~~~~~~~~~~~~~~")
  for((key,value) <- a){
    println(key + " : " + value)
  }

  for(key <- a.keySet){
    println(key + " : " + a.getOrElse(key,9))
  }

  for(value <- a.values){
    println(value)
  }

  for((key,_) <- a){
    println(key + ":" + a.getOrElse(key,9))
  }
}
