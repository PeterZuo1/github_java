package util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deleteutil {
    public static Connection conn;
    public static PreparedStatement ps;
    public static boolean Delete(Object obj){
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        StringBuilder s1 = new StringBuilder("delete from "+ c.getSimpleName() +" where "+fields[0].getName()+"=?");
        conn = Dbutil.getConn();
        String sql=s1.toString();
        try {
            ps = conn.prepareStatement(sql);
            fields[0].setAccessible(true);
            ps.setObject(1,fields[0].get(obj));
            int i = ps.executeUpdate();
            if(i==1)
                return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        for(int i=0;i<fields.length;i++){
//            s1.append(fields[i].getName());
//            s2.append(fields[i].)
//        }

        return false;
    }
}
