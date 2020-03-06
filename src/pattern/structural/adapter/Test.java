package pattern.structural.adapter;

/**
 * @author 陈超文
 * @create 2020-01-09 10:58
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.output5V();
    }
}
