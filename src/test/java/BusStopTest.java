import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusStopTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        busStop = new BusStop("Paisley");
        person = new Person("Millicent III");
        bus = new Bus("Ballamory",6);
    }

    @Test
    public void hasName(){
        assertEquals("Paisley",busStop.getName());
    }

    @Test
    public void startsWithEmptyQueue(){
        assertEquals(0,busStop.countQueue());
    }
    @Test
    public void canAddPassenger(){
        busStop.addPassenger(person);
        assertEquals(1,busStop.countQueue());
    }

    @Test
    public void canRemovePassenger(){
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.removePerson();
        assertEquals(1, busStop.countQueue());
    }


}
