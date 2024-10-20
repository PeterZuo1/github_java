import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 22044133 左立志
 * @data 2024/10/18 8:51
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("porp.properties");
        properties.load(inputStream);
        String method=(String)properties.get("methods");
        String classes=(String)properties.get("classes");
        Class aClass = Class.forName(classes);
        Constructor declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance();
        Method declaredMethod = aClass.getDeclaredMethod(method);
        declaredMethod.invoke(o);
        //用反射添加对象，首先创建io流，在判断用fild获取类的属性，getname获取名字，get获取属性值，通过write写入文件
    }
}
