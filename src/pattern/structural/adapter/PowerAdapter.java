package pattern.structural.adapter;

/**
 * @author 陈超文
 * @create 2020-01-09 10:56
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();
    @Override
    public int output5V() {
        int input = ac220.inputAC220V();

        //变压器
        int output = input/44;

        System.out.println("输出 "+output+"V");
        return output;
    }
}
