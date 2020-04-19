package proxy;

/**
 * @author eric
 */
public class ConcreteSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("this is a concrete subject");
    }
}
