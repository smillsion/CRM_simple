package pattern.structural.decorator.v2;

/**
 * @author 陈超文
 * @create 2020-01-08 21:02
 */
public class Test {
    public static void main(String[] args) {
        ABattercake battercake = new Battercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getDesc() +"的销售价格:"+ battercake.getPrice());
    }
}
