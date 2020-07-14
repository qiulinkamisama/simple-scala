package com.qiulinsama.class02

/**
 * 主构造方法中带有val和var的参数是公有的。然而由于val是不可变的，所以不能像下面这样去使用。
 * val point = new Point(1, 2)
 * point.x = 3  // <-- does not compile
 *
 * 不带val或var的参数是私有的，仅在类中可见。
 * val point = new Point(1, 2)
 * point.x  // <-- does not compile
 */
class Point05(val x: Int,  y: Int) {

}

object Point05{
  def main(args: Array[String]): Unit = {
    val point = new Point05(1, 2)
    //point.x = 3
    //point.y
  }
}
