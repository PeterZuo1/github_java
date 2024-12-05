package pojo;

/**
 * @author 22044133 左立志
 * @data 2024/11/8 14:34
 */
public class Score {
    private String sno;
    private String cno;
    private String degree;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Score(String sno, String cno, String degree) {
        this.sno = sno;
        this.cno = cno;
        this.degree = degree;
    }

    public Score() {
    }

    @Override
    public String toString() {
        return "Score{" +
                "sno='" + sno + '\'' +
                ", cno='" + cno + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }
}
