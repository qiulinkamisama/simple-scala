package com.qiulinsama.basic01

object Tuple08 {

  def main(args: Array[String]): Unit = {
    /**
     * 元组(tuple)和list类似，也是不可变的，不同之处是元组可以容纳不容类型的元素
     */
    val person: (String, Int) = ("age", 18)//person类型为Tuple2[String, Int]
    println(person._1)
    println(person._2)

    val date: (String, Int, String, String, Int) = ("today", 2020, "/", "05", 20)//date类型为Tuple5[String, Int, String, String, Int]


  }
}
