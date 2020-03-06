package pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈超文
 * @create 2020-01-07 21:27
 */
public class Mail implements Cloneable{
    private String name;
    private String emailAdress;
    private String content;
    private List<Object> list;

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Mail () {
        this.list = new ArrayList<>();
        System.out.println("Mail Class Construct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail mail = (Mail) super.clone();
        mail.list = new ArrayList<Object>(list);
        return mail;
    }
}
