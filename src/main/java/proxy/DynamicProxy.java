package proxy;

import java.lang.reflect.Proxy;

/**
 * @author eric
 */
public class DynamicProxy {

    public static Object getProxy(Object object) {

        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new DynamicProxyHandler(object));
    }
}
