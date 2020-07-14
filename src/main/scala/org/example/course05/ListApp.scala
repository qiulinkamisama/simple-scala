package org.example.course05

object ListApp extends App {

  val a = List(1,2,3,4,5)
  println(a.head)
  println(a.tail)

  val l2 = 1 :: Nil
  println(l2)

  val l3 = 2::l2
  println(l3)

  val l4 = 1::2::3::Nil
  println(l4)

  val l5 = scala.collection.mutable.ListBuffer[Int]()
  l5 += 2
  l5 += (3,4,5)
  l5 ++= List(6,7,8,9)

  l5 -= 2
  l5 -= 10
  l5.toList
  println(l5.tail.head)
  println(l5)

  def sum(nums:Int*):Int={
    if(nums.length == 0){
      0
    }else{
      nums.head + sum(nums.tail:_*)
    }
  }
  println(sum(1,2,3,4,5))
}
