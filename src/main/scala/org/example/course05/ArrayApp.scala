package org.example.course05

object ArrayApp extends App {
//  val a = new Array[String](5)
//  a.length
//  a(1) = "hello"
//
//  val b = Array("hadoop","spark","storm")
//  val c = Array(1,2,3,4,5,6)
//  println(c.sum)
//  println(c.mkString)
//  println(c.mkString(","))
//  println(c.mkString("<,",",",">"))

  val d = scala.collection.mutable.ArrayBuffer[Int]()
  d += 1
  d += 2
  d += (3,4,5)
  d ++= Array(6,7,8)
  d.insert(0,0)
  d.remove(1)
  d.remove(0,3)
  d.trimEnd(2)
  val c = Array(1,2,3,4,5,6)
  c(1) = 10
  for(ele <- c){
    println(ele)
  }
  val b = Array("hadoop","spark","storm")
  println(b(1))
//  for(i <- 0 until c.length)
//    println(d(i))

//  for(i <- (0.until(d.length).reverse))
//    println(d(i))
}
