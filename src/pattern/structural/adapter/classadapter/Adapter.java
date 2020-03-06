package pattern.structural.adapter.classadapter;

/**
 * @author 陈超文
 * @create 2020-01-09 10:37
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
