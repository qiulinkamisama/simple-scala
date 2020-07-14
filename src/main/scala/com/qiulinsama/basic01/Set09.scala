package com.qiulinsama.basic01

import scala.collection.mutable
import scala.collection.immutable

/**
 * set有不可变集和可变集，默认是不可变集（不可变数据结构是函数式编程的基石之一）
 * 可变位于scala.collection.mutable包下，不可变位于scala.collection.immutable下
 */
object Set09 {

  def main(args: Array[String]): Unit = {
    /**
     * 不可变集
     * 实际上调用了不可变集 + 方法
     * Creates a new set with an additional element, unless the element is already present.
     */
    var fruitsSet = Set("apple", "banana", "orange")
    fruitsSet += "pear"
    println(fruitsSet.contains("apple"))

    /**
     * 可变集
     * 实际上调用了可变集 += 方法
     */
    val numsSet: mutable.Set[String] = scala.collection.mutable.Set("one", "two", "three")
    numsSet += "four"
    println(numsSet)//Set(four, three, two, one)


    mutable.HashSet("1","2")
    immutable.HashSet("2","3")

  }
}
