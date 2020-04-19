package entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author eric
 */
@Getter
@Setter
@Repository
@Scope("prototype")
public class ProtoTypePerson {

    private String name;

    private int age;
}
