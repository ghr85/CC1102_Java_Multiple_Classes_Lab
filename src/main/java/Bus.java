import com.sun.javafx.collections.ArrayListenerHelper;

import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination(){
        return this.destination;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public boolean checkCapacity(){
     int count = this.passengerCount();
     if (count < this.capacity){
         return true;
     } else {
         return false;
     }
    }

    public void pickUpPassenger(Person person){
        if(this.checkCapacity()) {
            this.passengers.add(person);
        }
    }
    public void dropOffPassenger(){
        this.passengers.remove(0);
    }



}
