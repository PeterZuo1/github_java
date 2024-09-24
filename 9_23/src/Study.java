import java.util.Map;
import java.util.TreeMap;

/**
 * @author 22044133 左立志
 * @data 2024/9/23 15:53
 */
public class Study {
    public static void main(String[] args) {
        String a="abcsdqqwe_sfadsad__dsad,,da,das,";
        Map<Character,Integer> treeMap=new TreeMap<>();
        for(int i=0;i<a.length();i++)
        {
            char ss=a.charAt(i);
            if(Character.isLetter(ss))
            {
                char bb=Character.toLowerCase(ss);
                if(treeMap.containsKey(bb))
                {
                    treeMap.put(bb,treeMap.get(ss)+1);
                }
                else
                {
                    treeMap.put(bb,1);
                }
            }
        }
        for(char key:treeMap.keySet())
        {
            System.out.println(key+" "+treeMap.get(key));
        }
    }
}
