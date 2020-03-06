package pattern.creational.singleton;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 陈超文
 * @create 2019-12-30 23:06
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

//        LazySingleton.getLazySingleton();
////        new LazySingleton();

        System.out.println("main" + ThreadLocalSingleton.getInstance());
        System.out.println("main" + ThreadLocalSingleton.getInstance());
        System.out.println("main" + ThreadLocalSingleton.getInstance());
        System.out.println("main" + ThreadLocalSingleton.getInstance());
        System.out.println("main" + ThreadLocalSingleton.getInstance());
        /**
         * 多线程
         */
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

        /**
         * 序列化和反序列化
         */
        /*HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("asd_na")));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("asd_na"));
        HungrySingleton newInstance =(HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/

        /**
         * 反射攻击
         * 一般方法:(该方法适用于类加载期间就把实例创建好的单例类,比如饿汉式和静态内部类模式单例)
         * 通过在单例类的私有构造器中判断实例是否为空,用于是否有方法在调用构造,此方法可以通过反射对hungry对象进行设置为null破解(破解a)
         * 破解a解决办法:
         * hungrySingleton对象声明为final,不可进行修改
         */
       /* Class<?> ojc = Class.forName(HungrySingleton.class.getName());
        Constructor<?> method = ojc.getDeclaredConstructor();
        //破解a
//        Field hungrySingleton = ojc.getDeclaredField("hungrySingleton");
//        hungrySingleton.setAccessible(true);
//        hungrySingleton.set(ojc,null);
        //设置方法权限
        method.setAccessible(true);
        HungrySingleton instance = (HungrySingleton) method.newInstance();

        HungrySingleton newInstance = HungrySingleton.getInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/

        /**
         * 枚举类型单例,理论上最完美的单例
         */
        /*Class<?> ojc = Class.forName(EnumSingleton.class.getName());
        Constructor<?> method = ojc.getDeclaredConstructor();
        method.setAccessible(true);
        EnumSingleton instance = (EnumSingleton) method.newInstance();

        EnumSingleton newInstance = EnumSingleton.getInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/
//        EnumSingleton enumSingleton = EnumSingleton.valueOf("INSTANCE");
//        System.out.println(enumSingleton);
    }
}