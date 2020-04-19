import entity.ProtoTypePerson;
import entity.SingletonPerson;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void testAnnotation() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ProtoTypePerson person = applicationContext.getBean("protoTypePerson", ProtoTypePerson.class);
        System.out.println(person);
    }

    @Test
    public void testAnnotationScopeSingleton() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // default scope is singleton
        SingletonPerson person1 = applicationContext.getBean("singletonPerson", SingletonPerson.class);
        SingletonPerson person2 = applicationContext.getBean("singletonPerson", SingletonPerson.class);

        Assert.assertSame(person1, person2);
    }

    @Test
    public void testAnnotationScopeProtoType() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // add annotation @Scope("prototype")
        ProtoTypePerson person1 = applicationContext.getBean("protoTypePerson", ProtoTypePerson.class);
        ProtoTypePerson person2 = applicationContext.getBean("protoTypePerson", ProtoTypePerson.class);

        Assert.assertNotSame(person1, person2);
    }
}
