package com.qiulinsama.abstract06

import java.io.{File, PrintWriter}

object Currying05 {
  def main(args: Array[String]): Unit = {
    println(twice(_ + 1, 5))//7.0

    withPrinterWriter(new File("date.txt"), writer => writer.println(new java.util.Date()))
  }

  def twice(op: Double => Double, x: Double) = op(op(x))

  /**
   * 贷出模式
   * withPrinterWriter将一个PrinterWriter"贷出"给函数op
   */
  def withPrinterWriter(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally{
      writer.close()
    }
  }
}
