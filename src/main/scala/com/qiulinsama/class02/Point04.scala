package com.qiulinsama.class02

/**
 * Point04类中，数据存在私有变量_x和_y中。
 * def x和def y方法用于访问私有数据,即getter方法。
 * def x_=和def y_=是为了验证和给_x和_y赋值，即setter方法。
 * 注意下对于setter方法的特殊语法：这个方法在getter方法的后面加上_=，后面跟着参数。
 */
class Point04 {
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x = _x
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning
  }

  def y = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning
  }

  private def printWarning = println("WARNING: Out of bounds")
}
