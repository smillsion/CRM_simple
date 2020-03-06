package pattern.creational.singleton;


import java.util.HashMap;
import java.util.Map;

/**
 * @author 陈超文
 * @create 2020-01-07 20:40
 */
public class ContainerSingleton {
    private static Map<String , Object> map = new HashMap<String ,Object>();
    private ContainerSingleton() {

    }
    public static void putInstance(String key,Object value) {
        if(!key.trim().isEmpty() && key != null && value != null) {
            if(!map.containsKey(key)) {
                map.put(key,value);
            }
        }
    }

    public static Object getInstance(String key) {
        return map.get(key);
    }
}
