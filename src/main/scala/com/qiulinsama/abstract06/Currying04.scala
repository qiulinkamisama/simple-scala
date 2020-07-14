package com.qiulinsama.abstract06

object Currying04 {
  /**
   * 当你调用curriedSum，实际上是连着做了两次传统的函数调用。
   * 第一次调用接收了一个名为x的Int参数，返回一个用于第二次调用的函数值，这个函数接收了一个Int参数y。
   */
  def curriedSum(x: Int)(y: Int) = x + y

  def first(x: Int) = (y: Int) => x + y

  def main(args: Array[String]): Unit = {
    println(curriedSum(1)(2))
    /**
     * 返回第一次调用后的产生的函数
     */
    println(curriedSum(1)_)

    val Second: Int => Int = first(1)
    val result: Int = Second(2)
    println(result)
  }
}
