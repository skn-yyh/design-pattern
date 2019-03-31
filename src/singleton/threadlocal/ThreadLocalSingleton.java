package singleton.threadlocal;

/**
 * @ClassName: ThreadLocalSingleton
 * @Description: ThreadLocal 单例（伪线程安全的单例；只能保证线程内安全）
 * @Author: skn-yyh
 * @Date: 2019/4/1 1:05
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_SINGLETON_THREAD_LOCAL = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL_SINGLETON_THREAD_LOCAL.get();
    }
}
