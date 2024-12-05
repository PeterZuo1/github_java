package com.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author 22044133 左立志
 * @data 2024/11/28 14:11
 */
public class Druidutil {
    private static DataSource dataSource;
    private static Properties getProperties() throws IOException {
        InputStream inputStream=Druidutil.class.getClassLoader().getResourceAsStream("database.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }
    static {
        try{
            dataSource  = DruidDataSourceFactory.createDataSource(getProperties());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
