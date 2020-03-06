package pattern.structural.decorator.v1;

/**
 * @author 陈超文
 * @create 2020-01-08 20:30
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() +"的销售价格:"+ battercake.getPrice());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() +"的销售价格:"+ battercakeWithEgg.getPrice());

        BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() +"的销售价格:"+ battercakeWithEggSausage.getPrice());
    }
}
