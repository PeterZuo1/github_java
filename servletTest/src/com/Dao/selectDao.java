package com.Dao;

import com.pojo.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 22044133 左立志
 * @data 2024/11/28 15:03
 */
public interface selectDao {
    List<User> selectAll() throws SQLException;
}
