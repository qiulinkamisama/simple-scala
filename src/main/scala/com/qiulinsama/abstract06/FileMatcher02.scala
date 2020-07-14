package com.qiulinsama.abstract06

import java.io.File

object FileMatcher02 {
  private def filesHere = (new File(".")).listFiles

  /**
   * 注意，这里的matcher类型是函数类型，意思是接收两个字符串并返回boolean的函数，而不是接收一个元组
   */
  def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for(file <- filesHere; if matcher(file.getName, query))
      yield file
  }

  /**
   * _.endsWith(_) 含义和下面代码是一样的：
   * (fileName: String, query: String) => fileName.endWith(query)
   */
  def filesEnding(query: String) =
    filesMatching(query, _.endsWith(_))
  def filesContaining(query: String) =
    filesMatching(query, _.contains(_))
  def filesRegex(query: String) =
    filesMatching(query, _.matches(_))
}
