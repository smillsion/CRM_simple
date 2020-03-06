package pattern.structural.decorator.v1;

/**
 * @author 陈超文
 * @create 2020-01-08 20:27
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
