package pattern.structural.facade;

/**
 * @author 陈超文
 * @create 2020-01-08 16:33
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointGift) {
        System.out.println(pointGift.getName()+"资格校验通过,库存通过");
        return true;
    }
}
