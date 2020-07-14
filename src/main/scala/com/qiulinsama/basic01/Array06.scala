package com.qiulinsama.basic01

object Array06 {

  def main(args: Array[String]): Unit = {
    /**
     * 数组中的内容可以被重新赋值，因此是可变的
     */
    val greetStrings = new Array[String](3)
    greetStrings(0) = "hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!"

    /**
     * 实际上当你使用一个圆括号将一个或多个值包起来，并将这些值应用（apply）到某个对象时，会转换为这个对象的一个名为apply的方法调用，
     * 所以greetStrings(i)会被转换为greetStrings.apply(i)
     */
    for(i <- 0 to 2) {
      println(greetStrings(i))
      println(greetStrings.apply(i))
    }

    /**
     * 当通过圆括号应用了一个或多个参数（apply方法是获取the element at given index.），对获取到的值进行赋值时，
     * 会转换为这个对象的一个名为update的方法调用，Update the element at given index.
     * 所以 greetStrings(0) = "Hello" 会被转化为 greetStrings.update(0,"Hello")
     */
    greetStrings(0) = "Hello"
    greetStrings.update(0,"Goodbye")

    println(greetStrings(0))

    /**
     * val numNames: Array[String] = Array("zero", "one", "two") 实际上调用的是Array的伴生对象的apply方法
     * 可以想象为调用Array类的apply静态方法，即 Array.apply("zero", "one", "two")
     */
    val numNames: Array[String] = Array("zero", "one", "two")
    val numNames2: Array[String] = Array.apply("three", "four", "five")
    for(i <- 0 to numNames.length-1){
      println(numNames(i))
    }
    for(num <- numNames2)
      println(num)
  }
}
