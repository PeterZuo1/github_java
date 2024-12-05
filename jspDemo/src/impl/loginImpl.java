package impl;

import Dao.loginDao;
import com.Dbutil;
import pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 22044133 左立志
 * @data 2024/11/21 14:25
 */
public class loginImpl implements loginDao {
    private static Connection conn = Dbutil.getConn();
    @Override
    public boolean Login(User user) {

        String sql="select username,password from user where username=?and password=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("1");
        user.setPassword("222");
        loginDao loginDao = new loginImpl();
        if(loginDao.Login(user))
            System.out.println("123");
    }
}
