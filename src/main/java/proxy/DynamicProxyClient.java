package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author eric
 */
public class DynamicProxyClient {

    public static void main(String[] args) {

        ISubject subject = new ConcreteSubject();

//        ISubject proxy = (ISubject)Proxy.newProxyInstance(subject.getClass().getClassLoader(),
//                subject.getClass().getInterfaces(),
//                new DynamicProxyHandler(subject));
        ISubject proxy = (ISubject)DynamicProxy.getProxy(subject);
        proxy.request();
    }
}
