package pattern.structural.facade;

/**
 * @author 陈超文
 * @create 2020-01-08 16:42
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointGift = new PointsGift("洗衣机");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.validate(pointGift);
    }
}
