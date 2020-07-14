package org.example.course07

object StringApp extends App {
  val s = "Hello:"
  val name = "YQL"
  println(s+name)

  println(s"Hello:$name")

  val team = "AC Milan"
  println(s"Hello:$name, Welcome to $team")

  val b =
    """
      |这是一个多行字符串
      |hello
      |world
      |yql
      |lalal
      |""".stripMargin
}
