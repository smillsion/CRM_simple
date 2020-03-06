package pattern.creational.singleton;

/**
 * @author 陈超文
 * @create 2019-12-30 23:01
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null;
    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return  lazySingleton;
    }
}
