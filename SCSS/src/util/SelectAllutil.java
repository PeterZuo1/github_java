package util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectAllutil {
    public static Connection conn=Dbutil.getConn();
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static List selectAll(Class c) {
        List<Object> list = new ArrayList<>();
        String sql="select * from "+c.getSimpleName();
        Field[] declaredFields = c.getDeclaredFields();
        try {
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
