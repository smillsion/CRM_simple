package pattern.creational.singleton;

/**
 * @author 陈超文
 * @create 2020-01-04 22:34
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton doubleCheckSingleton = null;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if(doubleCheckSingleton == null) {
            synchronized (LazySingleton.class) {
                if(doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
