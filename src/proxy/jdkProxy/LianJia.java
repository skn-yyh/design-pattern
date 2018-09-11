package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LianJia implements InvocationHandler {

    private IPerson target;

    public Object getInstance(IPerson target) throws Exception {
        this.target = target;

        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("链家：我要根据你的需求开始给你找房子");
        System.out.println("寻找中...");
        method.invoke(this.target, args);

        System.out.println("如果合适的话，我们现在就签合同");

        return null;
    }
}
