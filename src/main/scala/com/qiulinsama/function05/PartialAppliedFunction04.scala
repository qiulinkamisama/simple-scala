package com.qiulinsama.function05

object PartialAppliedFunction04 {
  def main(args: Array[String]): Unit = {
    def sum(a: Int, b: Int, c: Int) = a + b + c
    println(sum(1, 2, 3))

    /**
     * 部分应用函数是一个表达式，在这个表达式中，并不给出函数需要的所有参数，而是给出部分，或完全不给
     */
    val a = sum _
    val b = sum(1, _: Int, 3)

    println(s"${a(1,2,3)}会转化为${a.apply(1,2,3)}")

    /**
     * 这里的b.apply调用了sum(1,4,3)和sum(1,5,3)
     */
    println(b(4))
    println(b(5))
  }
}
