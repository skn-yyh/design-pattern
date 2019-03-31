package singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: MappingSingleton
 * @Description: 容器式单例
 * @Author: skn-yyh
 * @Date: 2019/4/1 0:54
 */
public class MappingSingleton {
    private static Map<String, Object> mapper = new ConcurrentHashMap<>();

    private MappingSingleton() {}

    public static Object getInstance(String className) {

        synchronized (mapper) {
            if (!mapper.containsKey(className)) {
                Object object = null;
                try {
                    object = Class.forName(className).newInstance();
                    mapper.put(className, object);
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

                return object;
            }
        }

        return mapper.get(className);
    }
}
