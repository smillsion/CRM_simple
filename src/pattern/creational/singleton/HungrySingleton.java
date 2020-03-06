package pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author 陈超文
 * @create 2020-01-04 21:25
 */
public class HungrySingleton implements Serializable {
    private static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if(hungrySingleton != null) {
            throw new RuntimeException("单例不能通过反射进行实例化");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
}
