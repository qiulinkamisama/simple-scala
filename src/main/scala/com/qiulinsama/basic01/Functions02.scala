package com.qiulinsama.basic01

/**
 * 函数是带有参数的表达式
 */
object Functions02 {
  def main(args: Array[String]): Unit = {
    //你可以定义一个匿名函数（即没有名字），来返回一个给定整数加一的结果
    //(x: Int) => x + 1

    //你也可以给函数命名
    val addOne = (x: Int) => x + 1
      println(addOne)//得到函数自身，不会发生函数调用
      println(addOne(1))

    //函数可带有多个参数
    val add = (x: Int, y: Int) => x + y
    println(add(1, 2))

    //或者不带参数
    val getTheAnswer = () => 42
    println(getTheAnswer())

  }

}
