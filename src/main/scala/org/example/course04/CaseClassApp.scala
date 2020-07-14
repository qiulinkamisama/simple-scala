package org.example.course04
//通常用在模式匹配
object CaseClassApp {
  def main(args: Array[String]): Unit = {
    println(Dog("zs").name)
  }
}
//case class 不用new
case class Dog(name:String)
