package org.example.course07

/**
 * 匿名函数：函数是可以命名的，也可以不命名
 * (参数名：参数类型...) => 函数体
 */
object FunctionApp extends App {

  def sayHello(name:String)={
    println("Hi:"+name)

  }

  sayHello("lalala")

  def add = (x:Int,y:Int)=> {x+y}
  println(add(2, 3))

  val m2 = (x:Int) => (x,1)
  println(m2(10))

  //将原来接收的两个参数的一个函数转换成2个
  def sum(a:Int,b:Int) = a + b
  println(sum(2,3))

  def sum2(a:Int)(b:Int) = a+b
  println(sum2(1)(4))
}
