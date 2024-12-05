package com.jdbc;

import java.sql.*;

/**
 * @author 22044133 左立志
 * @data 2024/11/7 9:06
 */
public class test {
    public static void main(String[] args) {
        /*
        1.导入jar包

        */

        String url="jdbc:mysql://localhost/test";
        String driver="com.mysql.cj.jdbc.Driver";
        String user="root";
        String password="123456";
        try {
            Class.forName(driver);
            //获得连接
            Connection conn = DriverManager.getConnection(url,user,password);
            //System.out.println(conn);
            //Statement statement = conn.createStatement();
//            String sql="insert into user_ (username,password) values ('小红','123')";
            //添加语句
//            int i = statement.executeUpdate(sql);
//            System.out.println(i);
//            String sql="select * from user_ where id=1";
            String sql="insert into user_ (username,password) values (?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            //返回结果集
//            ResultSet resultSet = statement.executeQuery(sql);//查询数据
//            while(resultSet.next()){
//                System.out.println("id "+resultSet.getInt("id")+"名字 "+resultSet.getString("username")+"密码 "+resultSet.getString("password"));
//            }
//            resultSet.close();//关闭
//            statement.close();
//            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
