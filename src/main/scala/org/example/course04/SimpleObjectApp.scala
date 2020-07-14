package org.example.course04


object SimpleObjectApp {
  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Messi"
    println(person.name + ".." + person.age)

    println("invoke eat method: " + person.eat)
    println(person.returnGender)
  }

}

class People{
  var name:String = _
  val age:Int = 10
  private [this] var gender = "male"
  private var gender2 = "female"

  def returnGender: String ={
    gender = "female"
    gender2
  }
  def printInfo: Unit ={
    println("gender:" + gender)
  }
  def eat():String = {
    name + " eat...."
  }

  def watchFootball(teamName:String): Unit ={
    println(name + " is watching match of " + teamName)
  }
}
