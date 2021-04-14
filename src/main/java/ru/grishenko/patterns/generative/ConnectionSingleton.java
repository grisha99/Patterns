package ru.grishenko.patterns.generative;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {

    private Connection connection;

    private static volatile ConnectionSingleton connectionSingleton;

    private ConnectionSingleton(){
        String jdbcURL = "jdbc:sqlite::resource:serverDB.sqlite";
        try {
            connection = DriverManager.getConnection(jdbcURL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static ConnectionSingleton getInstance() {
        ConnectionSingleton localConnection = connectionSingleton;
        if (localConnection == null) {
            synchronized (ConnectionSingleton.class) {
                localConnection = connectionSingleton;
                if (localConnection == null) {
                    connectionSingleton = localConnection = new ConnectionSingleton();
                }
            }
        }
        return connectionSingleton;
    }
}
