/**
 * @author 22044133 左立志
 * @data 2024/10/18 11:09
 */
public class Starlmple implements Star {
    private String name;
    @Override
    public void sing(String name) {
        System.out.println(this.name+"在唱歌叫"+name);
    }

    @Override
    public void dance() {
        System.out.println("跳舞");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Starlmple{" +
                "name='" + name + '\'' +
                '}';
    }

    public Starlmple(String name) {
        this.name = name;
    }
}
