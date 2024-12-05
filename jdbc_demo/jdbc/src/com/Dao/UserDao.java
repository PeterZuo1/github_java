package com.Dao;

import com.pojo.User;

import java.util.List;

/**
 * @author 22044133 左立志
 * @data 2024/11/7 12:25
 */
public interface UserDao {
    //增加
    public int insert(User user);
    //修改
    public int update(User user);
    // 删除
    public int delete(Integer id);
    //列表查询
    public List<User> selectUserAll();
    //id查询
    public User selectUserById(Integer id);
    //模糊查询
    public List<User> selectUserByLike(String username);
    //分页查询
    public List<User> selectUserByLimit(Integer current,Integer size);
}
