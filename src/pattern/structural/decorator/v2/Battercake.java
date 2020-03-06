package pattern.structural.decorator.v2;

/**
 * @author 陈超文
 * @create 2020-01-08 20:36
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 8;
    }
}
