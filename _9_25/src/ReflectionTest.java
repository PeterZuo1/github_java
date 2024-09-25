import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
/*        //1
        Class clazz1 = Class.forName("Student");
        //2
        Class clazz2=Student.class;
        //3
        Student student = new Student();
        System.out.println(student.getClass());
        System.out.println(clazz2);*/
        Class clazz1 = Class.forName("Student");
        Constructor cn1 = clazz1.getConstructor(String.class,int.class);
        Student zuo = (Student) cn1.newInstance("zuo", 12);
        System.out.println(zuo);

    }
}
