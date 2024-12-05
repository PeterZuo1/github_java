package com;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author 22044133 左立志
 * @data 2024/11/7 10:05
 */
public class Dbutil {
    private static Connection connection = null;
    private static Properties getProperties() throws IOException {
        InputStream resourceAsStream = Dbutil.class.getClassLoader().getResourceAsStream("database.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        return properties;
    }
    static {
        try {
            final String URL=Dbutil.getProperties().getProperty("url");
            final String DRIVER=Dbutil.getProperties().getProperty("driverClassName");
            final String USERNAME=Dbutil.getProperties().getProperty("username");
            final String PASSWORD=Dbutil.getProperties().getProperty("password");
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConn(){
        return connection;
    }

    public static void main(String[] args) {
        System.out.println(getConn());
    }
}
