package proxy;

/**
 * @author eric
 */
public class StaticProxy implements ISubject {

    private ISubject subject;

    public StaticProxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("static proxy starts");
        subject.request();
        System.out.println("static proxy ends");
    }
}
