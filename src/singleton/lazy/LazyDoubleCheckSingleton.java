package singleton.lazy;

/**
 * @ClassName: LazyDoubleCheckSingleton
 * @Description: 双重检测锁单例
 * @Author: skn-yyh
 * @Date: 2019/4/1 0:08
 */
public class LazyDoubleCheckSingleton {
    // 加 volatile 目的是为了防止指令重排序的问题
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }

        return lazyDoubleCheckSingleton;
    }
}
