import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 22044133 左立志
 * @data 2024/9/23 14:07
 */
public class Hashmap {
    public static void main(String[] args) {
        Yuan yuan=new Yuan("xioaming",12);
        Yuan yuan1=new Yuan("zhangsan",11);
        Map<Yuan,String> map=new HashMap<>();
        map.put(yuan,"哈尔滨");
        map.put(yuan1,"北京");
        Set<Yuan> yuans = map.keySet();
        Iterator<Yuan> iterator = yuans.iterator();
        while (iterator.hasNext())
        {
            Yuan Key=iterator.next();
            String value=map.get(Key);
            System.out.println(Key+value);
        }
    }
}
