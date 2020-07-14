package org.example.course09

import java.io.FileInputStream

import scala.xml.XML

object XMLApp {
  def main(args: Array[String]): Unit = {
    readXMLAttr()
  }

  def loadXML() = {
    //    val xml = XML.load(this.getClass.getClassLoader.getResource("test.xml"))
    //    println(xml)
    val xml = XML.load(new FileInputStream("/Users/qiulinsama/IdeaProjects/scala-train/pom.xml"))
    println(xml)
  }

  def readXMLAttr()={
    val xml = XML.load(new FileInputStream("/Users/qiulinsama/IdeaProjects/scala-train/pom.xml"))
    // 获取父标签中<dependencies><dependency>内的内容
    val dependencyField = xml \"dependencies"\"dependency"
    //println(dependencyField)

    //获取全部artifactId标签内容
    val artifactIdField = xml \\ "artifactId"
    //println(artifactIdField)

    //xmlns 是dependency的属性
    //val artifactIdAttrField = (xml \ "dependencies" \ "dependency").map(_\"@xmlns")
    //val artifactIdAttrField = (xml \ "dependencies" \ "dependency" \\ "@xmlns")
//    for(field <- artifactIdAttrField){
//      println(field)
//    }

    //name="Logon" message
    //val filters = (xml \\ "message").filter(_.attribute("name").exists(_.text.equals("Logon")))
    //val filters = (xml \\ "message").filter(x => ((x\@"name").text).equals("Logon"))


  }
}
