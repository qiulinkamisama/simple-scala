package com.qiulinsama.function05

object SpecialCallMethod05 {
  def main(args: Array[String]): Unit = {
    /**
     * 变长可重复参数
     * 在echo内部，args的类型其实是Array[String]
     */
    def echo(args: String*) =
      for (arg <- args) println(arg)

    echo("hello","world")

    /**
     * 但是不能将Array[String]作为参数传入echo，需要在数组实参后面加上一个冒号和一个_*符号。
     * 这种表示方法告诉编译器将arr的每个元素作为参数传给echo
     */
    val arr = Array("What,s", "up", "doc?")
    echo(arr: _*)

    println("---------------------------")

    /**
     * 带名字的参数
     */
    def speed(distance: Float, time: Float)= distance/time
    println(s"速度为${speed(100,10)}")
    println(s"速度为${speed(distance = 100, time = 10)}")
    println(s"速度为${speed(time = 10,distance = 100)}")

    println("---------------------------")

    /**
     * 缺省值数值
     */
    def printTime(out: java.io.PrintStream = Console.out) =
      out.println("time = " + System.currentTimeMillis())

    def printTime2(out: java.io.PrintStream = Console.out, divisor: Int = 1) =
      out.println("time = " + System.currentTimeMillis()/divisor)
    
    printTime2(divisor = 1000)
    printTime2(out = Console.err)

  }

}
