package pattern.creational.singleton;

/**
 * @author 陈超文
 * @create 2020-01-04 23:14
 */
public enum  EnumSingleton {
    INSTANCE {
        protected void printTest() {
            System.out.println("赫尔");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return  INSTANCE;
    }
}
