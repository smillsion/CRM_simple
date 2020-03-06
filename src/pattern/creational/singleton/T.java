package pattern.creational.singleton;

/**
 * @author 陈超文
 * @create 2019-12-30 23:13
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);


//        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+" "+staticInnerClassSingleton);

//        ContainerSingleton.putInstance("pen",new Object());
//        Object pen = ContainerSingleton.getInstance("pen");

        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance);

    }
}
