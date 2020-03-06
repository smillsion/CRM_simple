package pattern.structural.facade;

/**
 * @author 陈超文
 * @create 2020-01-08 16:38
 */
public class GiftExchangeService {
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private QualifyService qualifyService = new QualifyService();
    private ShippingService shippingService = new ShippingService();

    public void validate(PointsGift pointGift) {
        if(qualifyService.isAvailable(pointGift)) {
            if(pointsPaymentService.pay(pointGift)) {
                String no = shippingService.isPort(pointGift);
                System.out.println(pointGift.getName()+"成功进入物流系统,物流订单号为"+no);
            }
        }
    }
}
