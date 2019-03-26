import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before

    public void before() {
        bus = new Bus("Brigadoon", 8);
        person = new Person("Shug");
        busStop = new BusStop("Paisley");

    }

    @Test
    public void hasDestination() {
        assertEquals("Brigadoon", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(8, bus.getCapacity());
    }

    @Test
    public void startsWithNoPassengers() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUpAPassengerPositive(){
        bus.pickUpPassenger(person);
        assertEquals(1, bus.passengerCount());
    }
    @Test
    public void canPickUpAPassengerNegative(){
        bus.pickUpPassenger(person);
        bus.pickUpPassenger(person);
        bus.pickUpPassenger(person);
        bus.pickUpPassenger(person);
        bus.pickUpPassenger(person);
        bus.pickUpPassenger(person);
        bus.pickUpPassenger(person);
        bus.pickUpPassenger(person);
        bus.pickUpPassenger(person);
        assertEquals(8, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.pickUpPassenger(person);
        bus.dropOffPassenger();
        assertEquals(0,bus.passengerCount());
    }
    @Test
    public void canPickUpPassenger(){
      busStop.addPassenger(person);
      Person passenger = busStop.removePerson();
      bus.pickUpPassenger(passenger);
      assertEquals(0, busStop.countQueue());
      assertEquals(1,bus.passengerCount());
    }
}
