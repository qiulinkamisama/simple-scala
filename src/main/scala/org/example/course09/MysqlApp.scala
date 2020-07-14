package org.example.course09

import java.sql.DriverManager

object MysqlApp {
  def main(args: Array[String]): Unit = {
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://10.80.248.23:3306/eladmin"
    val username = "hive"
    val password = "hive"

    classOf[com.mysql.jdbc.Driver]
    val connection = DriverManager.getConnection(url,username,password)
    val statement = connection.createStatement();
    val resultSet = statement.executeQuery("select * from user")

    while(resultSet.next()){
      val username = resultSet.getString("username")
      val email = resultSet.getString("email")
      println(s"$username,$email")
    }
  }
}
