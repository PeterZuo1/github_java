package util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Selectutil {
    public static Connection conn=Dbutil.getConn();
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static List select(Object obj) {
        Class c = obj.getClass();
        List<Object> list = new ArrayList<>();
        Field[] declaredFields = c.getDeclaredFields();
        String sql="select * from "+c.getSimpleName()+" where "+ declaredFields[0].getName()+"=?";
        try {
            ps = conn.prepareStatement(sql);
            declaredFields[0].setAccessible(true);
            ps.setObject(1,declaredFields[0].get(obj));
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
