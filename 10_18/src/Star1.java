import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 22044133 左立志
 * @data 2024/10/18 11:18
 */
public class Star1 {
    public static Star craet(Starlmple starlmple){
        Star star=(Star)Proxy.newProxyInstance(
                Star1.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("sing".equals(method.getName())){
                            System.out.println("代理做的事1");
                        }
                        else if("dance".equals(method.getName())){
                            System.out.println("代理做的事2");
                        }
                        return method.invoke(starlmple,args);
                    }
                }

        );
        return star;
    }
}
