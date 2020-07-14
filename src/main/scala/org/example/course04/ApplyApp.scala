package org.example.course04

object ApplyApp {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10)
      ApplyTest.incr
    println(ApplyTest.count) // 10 说明object本身就是一个单例对象

    val a = ApplyTest() // ==> Object.apply

    println("~~~~~~~~~~~~~~~~~")
    val c = new ApplyTest
    c()

    // 类名() ==> Object.apply
    // 对象() ==> Class.apply
  }
}

/**
 * 伴生类和伴生对象
 */
class ApplyTest{
  println("new ApplyTest")
  def apply() = {
    println("class apply")
    new ApplyTest()
  }
}

object ApplyTest{
  var count = 0

  def incr = {
    count += 1
  }

  //最佳实践：在Object的apply方法中去new Class
  def apply() = {
    println("object apply")
    new ApplyTest()
  }

}