package com.Dao.impl;

import com.Dao.loginDao;
import com.pojo.User;
import com.util.Druidutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 22044133 左立志
 * @data 2024/11/28 12:18
 */
public class loginDaoImpl implements loginDao {
    @Override
    public boolean login(User user) {
        try {
            Connection connection = Druidutil.getConnection();
            String sql="select username,password from user where username=? and password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
