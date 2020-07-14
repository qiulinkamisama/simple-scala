package com.qiulinsama.control04

object If01 {
  def main(args: Array[String]): Unit = {
    var filename1 = "default.txt"
    if(!args.isEmpty) filename1 = args(0)


    val filename2 = if(!args.isEmpty) args(0) else "default.txt"

    /**
     * 一个是var定义，一个是val定义
     */
  }
}
