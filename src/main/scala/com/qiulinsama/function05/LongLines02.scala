package com.qiulinsama.function05

import scala.io.{BufferedSource, Source}

/**
 * filename 和 width 被直接透穿给助手函数
 */
object LongLines02 {
  def processFile(filename: String, width: Int) = {
    def processFile(line: String) = {
      if(line.length > width)
        println(filename + ": " + line.trim)
    }

    val source: BufferedSource = Source.fromFile(filename)
    for(line <- source.getLines())
      processFile(line)
  }
}
