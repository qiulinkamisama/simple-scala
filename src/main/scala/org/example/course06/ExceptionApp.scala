package org.example.course06

object ExceptionApp extends App {
  try{
    val i = 10/0
    println(i)
  }catch {
    case e:ArithmeticException => println("除数不能为0....")
    case e:Exception => println(e.getMessage)
  }finally {
    println("lalala")
  }

}
