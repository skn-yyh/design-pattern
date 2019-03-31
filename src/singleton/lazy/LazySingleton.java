package singleton.lazy;

/**
 * @ClassName: LazySingleton
 * @Description: 懒汉式单例
 * @Author: skn-yyh
 * @Date: 2019/3/31 23:54
 */
public class LazySingleton {
    private static LazySingleton LAZY_SINGLETON = null;

    private LazySingleton() {}

    public synchronized static LazySingleton getInstance() {
        if (LAZY_SINGLETON == null) {
            LAZY_SINGLETON = new LazySingleton();
        }
        return LAZY_SINGLETON;
    }
}
