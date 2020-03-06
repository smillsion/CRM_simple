package pattern.structural.facade;

/**
 * @author 陈超文
 * @create 2020-01-08 16:34
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointGift) {
        System.out.println("对用户扣除"+pointGift.getName()+"的积分成功,进入物流系统");
        return true;
    }
}
