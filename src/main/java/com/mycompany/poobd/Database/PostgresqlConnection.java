package com.mycompany.poobd.Database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PostgresqlConnection {

    public Properties getProp()  {
        Properties props = new Properties();
        try (FileInputStream file = new FileInputStream(
                "./properties/dados.properties"))
        {
            props.load(file);
            return props;
        } catch (IOException ex) {
            System.out.println("Ocorreu um problema ao carregar variáveis de ambiente.");
            return null;
        }
    }

    public Connection getConnection() {
        Connection connection = null;
        Properties props = getProp();

        try {
            getProp();
            connection = DriverManager.getConnection(
                    props.getProperty("dados.url"),
                    props.getProperty("dados.user"),
                    props.getProperty("dados.password")
            );
        } catch (SQLException ex) {
            System.out.println("Erro ao connectar com o banco de dados.");
        }
        return connection;
    }
}
