package com.example.bigbraintrivia.data

import java.sql.Connection
import java.sql.DriverManager

private const val driverName = "com.mysql.cj.jdbc.Driver"
private const val jdbcMySQLPath = "jdbc:mysql://localhost/big-brain-trivia"
private const val databaseUser = "admin"
private const val databaseSecret = "admin"


object MySQLConnector {
    var connection: Connection

    init {
        //Log.i("teste", )
        println("[data] Stabilising connection with MySQL...")
        Class.forName(driverName).getDeclaredConstructor().newInstance()
        connection = DriverManager.getConnection(jdbcMySQLPath, databaseUser, databaseSecret)
    }
}