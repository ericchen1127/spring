package proxy;

/**
 * @author eric
 */
public class StaticProxyClient {

    public static void main(String[] args) {

        StaticProxy proxy = new StaticProxy(new ConcreteSubject());
        proxy.request();
    }
}
