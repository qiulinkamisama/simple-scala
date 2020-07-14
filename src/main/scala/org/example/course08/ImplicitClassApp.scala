package org.example.course08

object ImplicitClassApp extends App {

  implicit class Calculator(x:Int){//意味所有的Int类型都有add方法
    def add(a:Int) = a+x
  }

  println(1.add(3))
}


