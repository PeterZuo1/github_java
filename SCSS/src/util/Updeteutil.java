package util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Updeteutil {
    public static Connection conn=Dbutil.getConn();
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static boolean update(Object obj) {
        boolean flag = false;
        Class c = obj.getClass();
        StringBuilder stringBuilder = new StringBuilder("update " + c.getSimpleName() + " set ");
        Field[] fields = c.getDeclaredFields();
        for (int i = 1; i < fields.length; i++) {
            if (i != fields.length - 1) {
                stringBuilder.append(fields[i].getName()).append("=?,");
            } else {
                stringBuilder.append(fields[i].getName()).append("=? where ");
            }
        }
        stringBuilder.append(fields[0].getName()).append("=?");
        String sql = stringBuilder.toString();
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 1; i < fields.length; i++) {
                fields[i].setAccessible(true);
                ps.setObject(i, fields[i].get(obj));
            }
            fields[0].setAccessible(true);
            ps.setObject(fields.length, fields[0].get(obj));
            int i = ps.executeUpdate();
            if (i == 1) {
                flag = true;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
