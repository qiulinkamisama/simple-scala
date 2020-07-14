package com.qiulinsama.class02

import scala.collection.mutable

/**
 * 校验和累加器
 * val acc = new ChecksumAccumulator01
 */
class ChecksumAccumulator01 {
  private var sum = 0
  /**
   * scala 默认访问级别是public
   */
  val constant = 100

  /**
   * 方法的参数b是val，因此，如果试图在scala方法中对入参重新赋值，编译会报错
   */
  def add(b: Byte)= {sum += b}

  def checksum():Int = ~(sum & 0xFF) + 1

  def getCache = ChecksumAccumulator01.cache

}

/**
 * 单例对象，只不过class关键字被换成了object
 * 当单例对象跟某个类同一个名字，它被称作这个类的伴生对象。必须在同一个源码文件中定义类和类的伴生对象。
 * 类和他的伴生对象可以互相访问对方的私有成员,如getCache方法和getSum方法。
 */
object ChecksumAccumulator01{
  private val cache = mutable.Map.empty[String,Int]

  def getSum = {
    val acc = new ChecksumAccumulator01
    acc.sum
  }

  def calculate(s: String)={
    if(cache.contains(s))
      cache(s)
    else{
      val acc = new ChecksumAccumulator01
      for( c <- s)//遍历传入字符串的每一个字符
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }

  /**
   * 类和单例对象的一个区别就是单例对象不接收参数，而类可以。由于你没法用new实例化单例对象，也就没有任何手段向它传参。
   * 单例对象从初始化的语义上跟Java的静态成员是一致的。尤其体现在单例对象在有代码访问时才被初始化。
   */
  def main(args: Array[String]): Unit = {
    val checkSum: Int = ChecksumAccumulator01.calculate("test")
    println(checkSum)//-192
    val acc = new ChecksumAccumulator01
    println(acc.getCache)//Map(test -> -192) 即单例对象的成员变量对所有new出来的对象都是相同独一份的
    acc.add(100)
    println(ChecksumAccumulator01.getSum)//0  这里获取到的sum不是acc的sum
  }
}
