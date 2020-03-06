package pattern.structural.facade;

/**
 * @author 陈超文
 * @create 2020-01-08 16:36
 */
public class ShippingService {
    public String isPort(PointsGift pointGift) {
        System.out.println(pointGift.getName()+"成功发货");
        String shippingNo = "666";
        return shippingNo;
    }
}
