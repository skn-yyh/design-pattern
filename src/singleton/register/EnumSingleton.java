package singleton.register;

/**
 * @ClassName: EnumSingleton
 * @Description: 枚举类单例
 * 可以防止序列化 和 反射的方式破坏单例
 * @Author: skn-yyh
 * @Date: 2019/4/1 0:26
 */
public enum EnumSingleton {
    INSTANCE;

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
