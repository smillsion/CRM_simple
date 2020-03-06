package pattern.creational.prototype;

/**
 * @author 陈超文
 * @create 2020-01-07 21:35
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Mail mail = new Mail();
//        mail.setContent("初始化模板");
//        for (int i = 0; i < 10; i++) {
//            mail.setName("姓名"+i);
//            mail.setEmailAdress("姓名"+i+"@iiii.com");
//            mail.setContent("恭喜您中奖了");
//            MailUtil.sendMail(mail);
//        }
//        MailUtil.saveOriginMailRecord(mail);

        Mail mail = new Mail();
        Mail cloneMail = (Mail) mail.clone();
        System.out.println(mail);
        System.out.println(cloneMail);
    }
}
