package pattern.structural.adapter.objectadapter;

/**
 * @author 陈超文
 * @create 2020-01-09 10:46
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
