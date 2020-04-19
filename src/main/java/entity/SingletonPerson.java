package entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

/**
 * @author eric
 */
@Getter
@Setter
@Repository
public class SingletonPerson {

    private String name;

    private int age;
}
