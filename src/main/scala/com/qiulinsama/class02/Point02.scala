package com.qiulinsama.class02

/**
 * Point02类有4个成员：变量x和y，方法move和toString。
 * 与许多其他语言不同，主构造方法在类的签名中(var x: Int, var y: Int)。
 * move方法带有2个参数，返回无任何意义的Unit类型值()。这一点与Java这类语言中的void相当。
 * 另外，toString方法不带任何参数但是返回一个String值。因为toString覆盖了AnyRef中的toString方法，所以用了override关键字标记。
 * 主构造方法中带有val和var的参数是公有的,而且当主构造方法中没有给实例变量全部赋默认值时，new的时候需要全部赋值，即
 * val point = new Point02(1,2)
 * 如果构造器中部分赋值，如 class Point02(var x: Int = 0, var y: Int)，则new的时候需要把未赋值的参数补上，即
 * val point = new Point02(y=2)
 */
class Point02(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}
