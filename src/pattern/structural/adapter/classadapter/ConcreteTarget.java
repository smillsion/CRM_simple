package pattern.structural.adapter.classadapter;

/**
 * @author 陈超文
 * @create 2020-01-09 10:44
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget的请求方法");
    }
}
