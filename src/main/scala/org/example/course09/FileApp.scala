package org.example.course09

import scala.io.Source

object FileApp {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("/Users/qiulinsama/yql.sh")(scala.io.Codec.UTF8)
    def readChar()={
      for(ele <- file){
        println(ele)
      }
    }
    readChar()
    def readLine()={
      for (line <- file.getLines()){
        println(line)
      }
    }
    readLine()

    def readNet()={
      val file = Source.fromURL("http://www.baidu.com")
      for(line <- file.getLines()){
        println(line)
      }
    }
    readNet()


  }



}
