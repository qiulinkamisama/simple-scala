package com.qiulinsama.basic01

import scala.io.Source

/**
 * 从文件读出文本行，打印 `行数 | line`，其中行数需要右对齐|
 */
object CountChars {

  def main(args: Array[String]): Unit = {
    val file: String = CountChars.getClass.getClassLoader.getResource("test.xml").getPath
    args(0) = file
    if(args.length > 0){
      val lines: List[String] = Source.fromFile(args(0)).getLines().toList
      /**
       * reduceLeft方法将传入的函数应用到lines的头两个元素，然后继续将这个传入的函数应用到前一步得到的值和lines的下一个元素，直到遍历完整个列表
       */
      val longestLine: String = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)

      val maxWidth: Int = widthOfLength(longestLine)

      for(line <- lines){
        val numSpace: Int = maxWidth - widthOfLength(line)
        val padding: String = " " * numSpace
        println(padding + line.length + " | " + line)
      }
    }
    else
      Console.err.println("Please enter filename")
  }

  def widthOfLength(s: String) = s.length.toString.length
}
