package com.qiulinsama.basic01

/**
 * 方法的表现和行为和函数非常类似，但是它们之间有一些关键的差别。
 *
 * 方法由def关键字定义。def后面跟着一个名字、参数列表、返回类型和方法体。
 */
object Methods03 {

  def main(args: Array[String]): Unit = {
    println("the max value is "+max01(2,3))
    println("the max value is "+max02(4,3))
    greet()
  }

  /**
   * scala方法返回的是该方法计算出的最后一个表达式的值
   * 方法的参数x和y是val，因此，如果试图在scala方法中对入参重新赋值，编译会报错
   */
  def max01(x: Int, y: Int): Int ={
    if(x>y)
      x
    else
      y
  }

  /**
   * 如果方法只有一条语句，也可以选择不使用花括号
   */
  def max02(x: Int, y: Int): Int = if(x>y) x else y

  /**
   * 也可以不接收参数
   */
  def greet() = println("Hello, world!")

}
