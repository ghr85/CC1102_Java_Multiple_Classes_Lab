import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {
    private Person person;

    @Before
    public void before(){
        person = new Person("Doug");
    }

    @Test
    public void hasName(){
        assertEquals("Doug", person.getName());
    }
}
