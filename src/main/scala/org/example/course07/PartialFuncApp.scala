package org.example.course07

/**
 * 偏函数：被包在花括号内没有match的一组case语句
 */
object PartialFuncApp extends App {
  //A 输入参数类型，B输出参数类型
  def sayChinese:PartialFunction[String,String]={
    case "CTO(name,floor)" => "CTO"
    case "Employee(name,floor)" => "Employee"
    case _ => "other"
  }

  println(sayChinese("Employee(name,floor)"))
}
