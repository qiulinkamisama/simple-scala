package org.example.course08

object ImplicitArgApp extends App {

  implicit val test = "test"
  def testParam(implicit name:String)={
    println(name + "~~~~~~~~~~~~~")
  }

  //testParam("zs")
//  implicit val name = "implicit_name"
//  testParam
//  testParam("zs")
//
//  implicit val s1 = "s1"
//  implicit val s2 = "s2"
//  testParam
}
