package singleton.hungry;

/**
 * @ClassName: HungrySingleton
 * @Description: 饿汉试单例
 * <p>缺点：浪费内存空间</p>
 * @Author: skn-yyh
 * @Date: 2019/3/31 23:50
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    public static Object getInstance() {
        return hungrySingleton;
    }
}
