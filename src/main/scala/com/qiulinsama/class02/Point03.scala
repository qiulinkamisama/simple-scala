package com.qiulinsama.class02

/**
 * 构造器可以通过提供一个默认值来拥有可选参数：
 * val origin = new Point03() // x and y are both set to 0
 * val point1 = new Point03(1)
 * println(point1.x)  // prints 1
 *
 * 在Point03类中，x和y拥有默认值0所以没有必传参数。然而，因为构造器是从左往右读取参数，所以如果仅仅要传个y的值，你需要带名传参。
 * val point2 = new Point(y=2)
 * println(point2.y)  // prints 2
 */
class Point03(var x: Int = 0, var y: Int = 0) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}
