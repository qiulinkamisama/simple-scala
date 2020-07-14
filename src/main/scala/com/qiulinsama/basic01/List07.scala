package com.qiulinsama.basic01

object List07 {
  def main(args: Array[String]): Unit = {
    /**
     * list中的内容不可变的，类似于被final修饰
     */
    val oneTwoThree = List(1, 2, 3)

    val fourFive = List(4, 5)

    val oneToFive: List[Int] = oneTwoThree ::: fourFive
    /**
     * :::用于列表拼接，是List的方法，返回的是一个新的列表
     */
    oneToFive.foreach(println)

    /**
     * ::在一个已有列表前面添加一个新元素，是List的方法，返回的是一个新的列表
     */
    val zeroToSix: List[Int] = 0 :: oneToFive
    zeroToSix.foreach(println(_))

    /**
     * Nil表示空列表 :: 是List的方法，所以最后要加上Nil
     */
    val sevenToNine = 7 :: 8 :: 9 :: Nil
    println(sevenToNine)//List(7, 8, 9)

    /**
     * 为什么不在列表末尾追加元素？
     * List提供了:+方法用于追加。但是如果列表过大，追加操作耗时随着列表的大小线性增加，而头部添加元素(::)只需要常量时间。
     * 如果想通过追加元素高效构建列表，可是依次在头部添加完成后再调用reverse，或者使用ListBuffer。
     */
  }

}
