package org.example.course06

import scala.util.Random

object MatchApp extends App {
  val names = Array("a","b","c")
  val name = names(Random.nextInt(names.length))

  name match {
    case "a" => println("A")
    case "b" => println("B")
    case _ => println("lalala")
  }

  def judgeGrade(name:String,grade:String)={
    grade match{
      case "A" => println("Excellent...")
      case "B" => println("Good...")
      case "C" => println("Just so so...")
      case _ if(name == "lisi")=> println(name + "lakua...")
      case _ => println("lakua")
    }
  }

  judgeGrade("zs","D")
  judgeGrade("lisi","A")

  def greeting(array:Array[String])={
    array match {
      case Array("zhangsan") => println("Hi:zs")
      case Array(x,y) => println("hi:" + x + "," + y)
      case Array("zs",_*) => println("hi:zs and other friends...")
      case _ => println("hi:everybody")
    }
  }

  greeting(Array("zs","ls"))

  def greetList(list:List[String]): Unit ={
    list match{
      case "zs"::Nil => println("hi:zs")
      case x::y::Nil => println("hi:" + x + "," + "y")
      case "zs":: tail => println("hi:zs and other friends...")
      case _ => println("hi:everybody...")
    }
  }
  greetList(List("zs","ls","ww"))

  def matchType(obj:Any)={
    obj match {
      case x:Int => println("Int")
      case s:String => println("String")
      case m:Map[_,_] => m.foreach(println)
      case _ => println("other type")
    }
  }
  matchType(1)
  matchType(Map(1->2))

  class Person
  case class CTO(name:String,floor:String) extends Person
  case class Employee(name:String,floor:String) extends Person
  case class Other(name:String) extends Person

  def caseClassMath(person: Person): Unit ={
    person match {
      case CTO(name,floor) => println("CTO")
      case Employee(name,floor) => println("Employee")
      case _ => println("other")
    }
  }

  caseClassMath(CTO("yql","22"))

  val grades = Map("yql"->"A","zs"->"C")

  def getGrade(name:String)={
    val grade = grades.get(name)
    grade match {
      case Some(grade) => println("your grade is "+grade)
      case None => println("sorry...")
    }
  }

  getGrade("yql")
  getGrade("ls")
}
