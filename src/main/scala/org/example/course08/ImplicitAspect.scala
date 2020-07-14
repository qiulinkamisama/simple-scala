package org.example.course08

import java.io.File
import ImplicitApp._
object ImplicitAspect extends App {

  val file = new File("/Users/qiulinsama/yql.sh")
  println(file.read())

  val man = new Man("YQL")
  man.fly()
}
