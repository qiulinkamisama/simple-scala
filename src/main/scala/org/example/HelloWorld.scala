package org.example

object HelloWorld {
  def main(args: Array[String]): Unit = {
//    println(max(1,2))
//    sayHello
//    sayHello("zs")
//    println(speed(distance = 10, time = 1))
//    println(speed(time = 10, distance = 100))

    for(i <- 1.to(10) if i % 2 == 0)
      println(i)
    //println(sum2(1, 2, 3, 4, 5))

    val courses = Array("Hadoop","Spark SQL","Spark Streaming","Storm","Scala")
//    for(course <- courses){
//      println(course)
//    }
    courses.foreach(course => println(course))
    var (num,sum) = (100,0)
    while (num > 0){
      sum += num
      num = num -1
    }
    println(sum)
  }

  def max(x:Int,y:Int):Int = if(x > y) x else y

  def sayHello: Unit ={
    println("hello")
  }
  def sayHello(name:String): Unit ={
    println("hello"+name)
  }
  def speed(distance:Float,time:Float):Float = {
    distance/time
  }

//  def sum(a:Int,b:Int):Int = {
//    a + b
//  }

  def sum2(numbers:Int*)={
    var result = 0
    for (number <- numbers)
      result += number
    result
  }
}
