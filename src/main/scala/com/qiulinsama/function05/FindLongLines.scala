package com.qiulinsama.function05

object FindLongLines {
  def main(args: Array[String]): Unit = {
    val width: Int = args(0).toInt
    for(arg <- args.drop(1))
      LongLines02.processFile(arg, width)
  }

}
