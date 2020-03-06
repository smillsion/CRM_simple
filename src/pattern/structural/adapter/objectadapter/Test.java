package pattern.structural.adapter.objectadapter;


/**
 * @author 陈超文
 * @create 2020-01-09 10:38
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
