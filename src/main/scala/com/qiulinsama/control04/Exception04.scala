package com.qiulinsama.control04

import java.io.{FileNotFoundException, FileReader, IOException}

class Exception04(n: Int){
  val half =
    if(n % 2 == 0)
      n/2
    else
      throw new RuntimeException("n must be even")

  var file: FileReader = _
  try{
    file = new FileReader("test.xml")
  } catch {
    case ex: FileNotFoundException => println("file not found")
    case ex: IOException => println("io exception")
  } finally {
    file.close()
  }
}
object Exception04 extends App{
  private val exception0 = new Exception04(2);
}
