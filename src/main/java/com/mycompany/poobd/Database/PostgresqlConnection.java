package com.mycompany.poobd.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PostgresqlConnection {

    public Connection getConnection(Properties properties) throws SQLException {
        Connection connection = DriverManager.getConnection(
            properties.getProperty("dados.url"),
            properties.getProperty("dados.user"),
            properties.getProperty("dados.password")
        );
        System.out.println("Connected to Database.");
        return connection;
    }
}