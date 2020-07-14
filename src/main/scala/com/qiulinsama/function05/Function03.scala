package com.qiulinsama.function05

object Function03 {

  def main(args: Array[String]): Unit = {
    var increase = (x: Int) => x + 1
    println(increase(10))

    increase = (x: Int) => {
      println("We")
      println("are")
      println("here!")
      x + 1
    }
    println(increase(12))

    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    someNumbers.foreach((x: Int) => println(x))
    someNumbers.foreach(println _)
    someNumbers.foreach(println)

    println(someNumbers.filter((x: Int) => x > 0))
    println(someNumbers.filter(x => x > 0))

    /**
     * 占位符语法 _ 用来表示一个或多个参数，只要满足每个参数只在函数字面量中出现一次即可
     * 这里的下划线并非是单个参数的占位符，它是整个参数列表的占位符
     */
    println(someNumbers.filter(_ > 0))
  }
}
