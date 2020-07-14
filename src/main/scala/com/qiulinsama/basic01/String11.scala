package com.qiulinsama.basic01

/**
 * extends App 可以不用编写main方法
 * 可以通过名为args的字符串数组来访问命令行参数
 */
object String11 extends App {
  /**
   * 原生字符串，以三个双引号开始并以三个双引号结束，内部可包含任何字符，包括换行、单双引号和其他特殊字符，当然，连续三个双引号除外
   */
  val str1 = """"\\\"\'""""
  println("str1 is " + str1)

  /**
   * 输出
   * str2 is a
   *        b
   *        c
   */
  val str2 =
    """a
       b
       c"""
  println("str2 is " + str2)

  /**
   * 输出
   * str3 is
   * a
   * b
   * b
   */
  val str3 =
    """
      |a
      |b
      |b
      |""".stripMargin
  println("str3 is " + str3)

  /**
   * 字符串插值
   */
  var name = "LiLei"
  println(s"Hello, my name is $name.")
  println(s"I'm ${3 * 6} years old.")
  var pi = "Pi"
  println(f"$pi is approximately ${math.Pi}%.8f.")// 输出Pi is approximately 3.14159265.
  println(raw"No\\\\escape")// 输出No\\\\escape
}
