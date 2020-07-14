package com.qiulinsama.basic01

/**
 * 常量和变量
 * val和var
 * val和Java中的final变量类似，一旦初始化就不能被重新赋值。
 * 而var类似于Java的非final变量，在整个生命周期内可以被重新赋值。
 */
object ValuesAndVariables01 {

  def main(args: Array[String]): Unit = {
    val msg = "Hello,world!"
    println(msg)
    //msg = "Hello again,world!"

    var greeting = "Hello,world!"
    println(greeting)
    greeting = "Leave me alone,world"
    println(greeting)
  }

}
