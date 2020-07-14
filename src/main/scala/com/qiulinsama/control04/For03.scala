package com.qiulinsama.control04

import java.io.File

object For03 {
  def main(args: Array[String]): Unit = {
    val filesHere: Array[File] = new File("./src/main/scala/com/qiulinsama/control04").listFiles()

    /**
     * 遍历集合
     */
    for (file <- filesHere)
      println(file)
    println("------------------------------")

    /**
     * for表达式添加过滤器，选择名字中包含a的文件名
     */
    for (file <- filesHere if file.getName.contains('a'))
      println(file)
    println("------------------------------")

    /**
     * for表达式添加多个过滤器，选择名字中包含a的名字且是文件名不是目录名
     */
    for (
      file <- filesHere
      if file.getName.contains('a')
      if file.isFile
    )
      println(file)
    println("------------------------------")

    /**
     * to 和 until
     */
    for(i <- 1 to 5)//1,2,3,4,5
      println("Iteration " + i)

    for(i <- 1 until 5)//1,2,3,4
      println("Iteration " + i)

    println("------------------------------")

    /**
     * 嵌套循环,()和{}写法
     */

    def fileLines(file: File) =
      scala.io.Source.fromFile(file).getLines().toList

    def grep01(pattern: String) =
      for(
        file <- filesHere
        if file.getName.endsWith(".scala");
        line <- fileLines(file)
        if line.trim.matches(pattern)
      ) println(file + ": " + line.trim)

    def grep02(pattern: String) =
      for{
        file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(pattern)
      } println(file + ": " + trimmed)

    grep02(".*If.*")
    println("------------------------------")
    /**
     * yield file产出一个新的集合
     */
    def scalaFiles =
      for{
        file <- filesHere
        if file.getName.endsWith(".scala")
      }yield file

    val files: Array[File] = scalaFiles

    val forLineLengths =
      for{
        file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(".*If.*")
      } yield trimmed.length

    val lengths: Array[Int] = forLineLengths
  }


}
