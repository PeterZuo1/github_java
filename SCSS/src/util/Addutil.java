package util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class Addutil {
    public static Connection conn;
    public static PreparedStatement ps;
    public static boolean addSelect(Object obj){
        conn = Dbutil.getConn();
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        StringBuilder s1 = new StringBuilder("insert into " + c.getSimpleName() + " (");
        StringBuilder s2 = new StringBuilder(" values(");
        for(int i=0;i< fields.length;i++){
            if(i!=fields.length-1){
                s1.append(fields[i].getName()+",");
                s2.append("?,");
            }
            else {
                s1.append(fields[i].getName()+")");
                s2.append("?)");
            }
        }
        String sql=s1.append(s2).toString();
        try {
            ps = conn.prepareStatement(sql);
            for(int i=0;i< fields.length;i++){
                fields[i].setAccessible(true);
                ps.setObject(i+1,fields[i].get(obj));
            }
            int i = ps.executeUpdate();
            if(i==1){
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
