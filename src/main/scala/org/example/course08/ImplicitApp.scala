package org.example.course08

import java.io.File

object ImplicitApp extends App {
  //定义隐式转换函数即可
  implicit def man2superman(man:Man):Superman = new Superman(man.name)


  implicit def file2RichFile(file:File):RichFile = new RichFile(file)

}

class Man(val name:String){
  def eat()={
    println(s"man [ $name ] eat....")
  }
}

class Superman(name:String){
  def fly()={
    println(s"superman[ $name ] fly....")
  }
}

class RichFile(val file:File){
  def read()={
    scala.io.Source.fromFile(file.getPath).mkString
  }
}