package com.test;

import com.Dao.UserDao;
import com.Impl.UserDaoImpl;
import com.pojo.User;

import java.util.List;

/**
 * @author 22044133 左立志
 * @data 2024/11/7 13:58
 */
public class Test {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        User user = new User();
//        user.setId(5);
//        user.setUsername("左li");
//        user.setPassword("123");
//        userDao.delete(5);
        List<User> list = userDao.selectUserAll();
//        System.out.println(list);
//        for(int i=0;i<list.size();i++)
//        {
//            System.out.println(list.get(i).getId());
//        }
//        User user1 = userDao.selectUserById(2);
//        System.out.println(user1);
//        List<User> user1 = userDao.selectUserByLike("小");
//        System.out.println(user1);
        List<User> list1 = userDao.selectUserByLimit(1, 4);
        System.out.println(list1);
    }
}
