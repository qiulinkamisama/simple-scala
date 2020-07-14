package com.qiulinsama.class02

object Operator06{

  def main(args: Array[String]): Unit = {
    /**
     * 操作符即方法，1调用了Int类中的叫+的方法
     */
    val sum = 1 + 2;
    val sumMore = 1.+(2)

    /**
     * 任何方法都可以是操作符
     */
    val s = "Hello,world!"
    val i1: Int = s indexOf 'o'//将调用s.indexOf('o')
    val i2: Int = s indexOf ('o',5)//将调用s.indexOf('o',5)

    println(s toLowerCase)//将调用s.toLowerCase()
  }
}
