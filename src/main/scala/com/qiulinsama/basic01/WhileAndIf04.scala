package com.qiulinsama.basic01

object WhileAndIf04 {
  def main(args: Array[String]): Unit = {
    val msg = Array("Scala","is","Fun")

    var i = 0
    while (i < msg.length){
      println(msg(i))
      i += 1//scala不支持i++或者++i
    }


    i = 0
    while(i < msg.length){
      if(i != 0)
        print(" ")
      print(msg(i))
      i += 1
    }
  }

}
