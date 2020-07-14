package org.example.course04

object AbstractApp {
  def main(args: Array[String]): Unit = {
    val stu = new Student2()
    println(stu.age)
  }
}

abstract class Person2{
  def speak

  var name:String

  var age:Int
}

class Student2 extends Person2{
  override def speak: Unit = ???

  override var name: String = _
  override var age: Int = _
}
