package pattern.creational.singleton;

/**
 * @author 陈超文
 * @create 2020-01-04 21:17
 */
public class StaticInnerClassSingleton {
    private static class innerClass {
//        public static final StaticInnerClassSingleton StationInnerClassSingleton = new StaticInnerClassSingleton();
        private static StaticInnerClassSingleton StationInnerClassSingleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
        if(innerClass.StationInnerClassSingleton != null) {
            throw new RuntimeException("单例不能通过反射进行实例化");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return new innerClass().StationInnerClassSingleton;
    }
}
