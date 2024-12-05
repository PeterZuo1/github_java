package com.util;

import com.pojo.User;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 22044133 左立志
 * @data 2024/11/8 9:38
 */
public class Curd {
    public static Connection conn=Dbutil.getConn();
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static List selectAll(Class c) throws SQLException, IllegalAccessException, InstantiationException {
        List<Object> list = new ArrayList<>();
        String sql="select * from "+c.getSimpleName();
        Field[] declaredFields = c.getDeclaredFields();
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            Object o = c.newInstance();
            for(int i=0;i<declaredFields.length;i++)
            {
                declaredFields[i].setAccessible(true);
                declaredFields[i].set(o,rs.getObject(declaredFields[i].getName()));
            }
            list.add(o);
        }
        return list;
    }
    public static boolean update(Object obj){
        boolean flag=false;
        Class c = obj.getClass();
        StringBuilder stringBuilder = new StringBuilder("update "+c.getSimpleName()+" set ");
        Field[] fields = c.getDeclaredFields();
        for(int i=1;i<fields.length;i++){
            if(i!=fields.length-1)
            {
                stringBuilder.append(fields[i].getName()).append("=?,");
            }
            else{
                stringBuilder.append(fields[i].getName()).append("=? where ");
            }
        }
        stringBuilder.append(fields[0].getName()).append("=?");
        String sql=stringBuilder.toString();
        try {
            ps= conn.prepareStatement(sql);
            for(int i=1;i<fields.length;i++){
                fields[i].setAccessible(true);
                ps.setObject(i,fields[i].get(obj));
            }
            fields[0].setAccessible(true);
            ps.setObject(fields.length,fields[0].get(obj));
            int i = ps.executeUpdate();
            if(i==1)
            {
                flag=true;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }


    public static void main(String[] args){
        User user = new User(7,"1","222");
        //Class aClass = user.getClass();
        update(user);
    }
}
