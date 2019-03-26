import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    @Before

    public void before(){
        bus = new Bus("Brigadoon",8);
        person = new Person("Shug");
    }
    @Test
    public void hasDestination(){
    assertEquals("Brigadoon", bus.getDestination());
    }
//    @Test
//    public void hasCapacity{
//
//    }
//    @Test
//    public void hasPassengers(){
//
//    }
}
