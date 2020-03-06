package pattern.structural.decorator.v1;

/**
 * @author 陈超文
 * @create 2020-01-08 20:29
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc() + ",再加一根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
