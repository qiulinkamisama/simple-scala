package com.qiulinsama.function05

/**
 * 那什么是闭包呢，一言以蔽之：一个持有外部环境变量的函数就是闭包。
 *
 * 理解闭包通常有着以下几个关键点：
 * 1.函数
 * 2.自由变量
 * 3.环境
 */
object Closure05 {
  def main(args: Array[String]): Unit = {
    var more = 10
    /**
     * 函数addMore因为捕获了外部作用域（环境）中的变量more，因此形成了闭包。
     * 而由于变量中的变量more并不属于函数addMore，所以在概念里被称之为「自由变量」。
     */
    var addMore = (x: Int) => x + more

    println(s"more的值为：$more")
    println(s"addMore的值为：${addMore(10)}")

    /**
     * 如果一个闭包访问了某个随着程序运行会产生多个副本的变量会如何呢，
     * 闭包引用的实例是在闭包被创建时活跃的那一个。
     * makeIncreaser每被调用一次，就会创建一个新的闭包。每个闭包都会访问那个在它创建时活跃的变量more。
     */
    def makeIncreaser(more: Int) = (x: Int) => x + more
    val inc1 = makeIncreaser(1)
    val inc9999 = makeIncreaser(9999)
    println(inc1(10))
    println(inc9999(10))
  }
}
