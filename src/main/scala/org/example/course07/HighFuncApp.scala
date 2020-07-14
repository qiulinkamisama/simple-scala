package org.example.course07

object HighFuncApp extends App {
  val l = List(1,2,3,4,5,6,7,8)

  //map:逐个去操作集合中的每个元素,不会改变数据结构
  l.map((x:Int) => x+1)
  l.map((x) => x*2)
  l.map(x => x*2)//一个元素可以省略()
  l.map(_*2)//_占位符表示每一个元素
  l.map(_*2).foreach(println)

  println("~~~~~~~~~~~~~~~~~~~")
  l.map(_*2).filter(_>8).foreach(println)

  l.take(4).foreach(println)

  println("~~~~~~~~~~~~~~~~~~~")
  println(l.reduce(_ + _))//元素两两相加
  println(l.reduceLeft(_ - _))//1-tail
  println(l.reduceRight(_ - _))

  println("~~~~~~~~~~~~~~~~~~~")
  val f = List(List(1,2),List(3,4),List(5,6))
  f.flatten.foreach(println)
  // flatMap
  f.map(_.map(_*2)).foreach(println)
  f.flatMap(_.map(_*2)).foreach(println)
}
