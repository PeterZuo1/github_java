package pojo;

/**
 * @author 22044133 左立志
 * @data 2024/9/20 11:51
 */
public class Course {
    private int id;
    private String cname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "课程{" +
                "id=" + id +
                ", 课程名='" + cname + '\'' +
                '}';
    }
}
