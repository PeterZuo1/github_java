package com.Dao.impl;

import com.Dao.selectDao;
import com.pojo.User;
import com.util.Druidutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 22044133 左立志
 * @data 2024/11/28 15:04
 */
public class selectDaoImpl implements selectDao {
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    @Override
    public List<User> selectAll() throws SQLException {
        List<User> list = new ArrayList<>();
        connection=Druidutil.getConnection();
        String sql="select * from user";
        preparedStatement = connection.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next())
        {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            list.add(user);
        }
        return list;
    }
}
