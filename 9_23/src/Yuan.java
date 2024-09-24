/**
 * @author 22044133 左立志
 * @data 2024/9/23 14:08
 */
public class Yuan {
    private String sname;
    private int age;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Yuan(String sname,int age)
    {
        this.sname=sname;
        this.age=age;
    }
    public Yuan()
    {

    }

    @Override
    public String toString() {
        return "Yuan{" +
                "sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}
