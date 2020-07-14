package com.qiulinsama.basic01

object ForeachAndFor05 {
  def main(args: Array[String]): Unit = {
    val msgs = Array("Scala","is","Fun")


    //x => println(x)叫foreach方法所接收的函数字面量
    msgs.foreach(x => println(x))

    /**
     * 如果函数字面量只是接收一个单个参数的语句，可以不必给出参数名和参数本身
     */
    msgs.foreach(println)


    /**
     * msg 是一个val不可变量 <- 符号类似于in的意思
     */
    for(msg <- msgs)
      println(msg)


    /**
     * 如果一个方法只接收一个参数，在调用它的时候，可以不使用英文句点或圆括号
     * to实际上是是接收一个Int参数的方法 0 to msgs.length-1 会被转换为(0).to(msgs.length-1)
     * 注意，这种方式仅在显式地给出方法调用的目标对象时才有效
     * 例如 println 10 是不行的，可以写成 Console println 10
     * println为Console的一个方法
     * 实际上+ — * / 都是Int对象的方法
     */
    for(i <- 0 to msgs.length - 1)
      println(msgs(i))

    Console println 10
  }

}
