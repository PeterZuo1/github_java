package Impl;

import Dao.CsDao;
import util.Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CsDaoImpl implements CsDao {
    @Override
    public boolean choose(String s, String c) {
        Connection conn = Dbutil.getConn();
        String sql="insert into score (sno,cno) values (?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s);
            ps.setString(2,c);
            int i = ps.executeUpdate();
            if(i==1)
                return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public void selectSno(String sno) {
        Connection conn = Dbutil.getConn();
        String sql="select student.sno,student.sname,student.SSEX,course.CNO,course.CNAME from student JOIN score on student.sno=score.SNO JOIN course on score.cno=course.cno where student.sno=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,sno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                System.out.print("学号：");
                System.out.print(rs.getString("sno"));
                System.out.print(" 姓名：");
                System.out.print(rs.getString("sname"));
                System.out.print(" 年龄：");
                System.out.print(rs.getString("ssex"));
                System.out.print(" 课程号：");
                System.out.print(rs.getString("cno"));
                System.out.print(" 课程名：");
                System.out.print(rs.getString("cname"));
                System.out.println();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
