package singleton.lazy;

/**
 * @ClassName: LazyInnerClassSingleton
 * @Description: 静态内部类单例
 * @Author: skn-yyh
 * @Date: 2019/4/1 0:16
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        // 防止通过反射的方式篡改
        if (LazyHolder.LAZY_INNER_CLASS_SINGLETON != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    /**
     * LazyHolder 里面的逻辑只有等到内部类调用的时候才执行
     * JVM 底层执行逻辑，完美地避开了线程安全的问题
     * 缺点：可能会通过反射，将破坏此单例模式。
     *
     * @return
     */
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY_INNER_CLASS_SINGLETON;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }
}
