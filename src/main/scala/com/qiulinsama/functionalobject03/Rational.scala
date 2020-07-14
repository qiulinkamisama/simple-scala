package com.qiulinsama.functionalobject03

class Rational(n: Int,d: Int) {//主构造方法
  /**
   * Scala编译器会将你在类定义体重给出的非字段或方法定义的代码编译进类的主构造方法。
   */
  println("Created " + n + "/" + d)

  /**
   * 前置条件，分母不能为0.require方法定义在Predef这个独立对象中，所有的scala原文件都会自顶引入Predef的成员。
   */
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer: Int = n / g
  val denom: Int = d / g

  /**
   * 每个辅助构造方法都必须首先调用同一个类的另一个构造方法，要么是主构造方法，要么是另一个辅助构造方法
   */
  def this(n: Int) = this(n, 1)//辅助构造器

  /**
   * 重写toString方法
   */
  override def toString: String = n + "/" + d

  def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b,a % b)

  def + (that: Rational): Rational =
    new Rational(
      numer * that.numer + that.numer * denom,
      denom * that.denom
    )

  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)

  def * (that: Rational): Rational =
    new Rational(numer * that.numer,denom * that.denom)

  def * (i: Int): Rational =
    new Rational(numer * i, denom)

  def lessThan(that: Rational): Boolean =
    this.numer * that.numer < that.numer * this.denom

  def max(that: Rational): Rational =
    if(this.lessThan(that)) that else this
}
object Rational{
  def main(args: Array[String]): Unit = {
    val rational: Rational = new Rational(1, 1) + new Rational(2, 1)
    println(rational)
    val x = new Rational(2, 3)
    implicit def intToRational(x: Int) = new Rational(x)//隐式转换，将Int转成Rational
    2 * x

  }
}
