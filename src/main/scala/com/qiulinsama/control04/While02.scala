package com.qiulinsama.control04

import scala.io.StdIn

/**
 * 建议对代码中的while保持警惕，如果对于某个特定的while或do-while循环，找不到合适的理由来使用它，
 * 那么应该尝试采用其他方案来完成同样的工作。
 */
object While02 {
  def main(args: Array[String]): Unit = {
    var line = ""
    do {
      line = StdIn.readLine()
      println("Read: " +  line)
    } while (line != "")
    println(gcd(50, 70))
  }

  /**
   * 计算最大公约数
   */
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while(a != 0){
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def gcd(p: Long,q: Long): Long = if(q == 0) p else gcd(q, p % q)

}
