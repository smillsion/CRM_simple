package pattern.structural.decorator.v2;

/**
 * @author 陈超文
 * @create 2020-01-08 20:37
 */
public class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    protected int getPrice() {
        return aBattercake.getPrice();
    }
}
