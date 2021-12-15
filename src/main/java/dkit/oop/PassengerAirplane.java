package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane extends Airplane  {

    // fields(Q2)
    private int MAX_NUM_PASSENGERS;
    private ArrayList<String> passengerList;

    PassengerAirplane(String type, int maxNumPassengers) {
        super(type);
        this.MAX_NUM_PASSENGERS = maxNumPassengers;
        this.passengerList = new ArrayList<>();
    }

    public void addPassenger(String name) {
        if (this.passengerList.size() <= this.MAX_NUM_PASSENGERS)
            this.passengerList.add(name);
    }

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                "id=" + super.getId() +
                ", type='" + super.getType() +
                ", MAX_NUM_PASSENGERS=" + MAX_NUM_PASSENGERS +
                ", passengerList=" + passengerList +
                '}';
    }
} // end of PassengerAirplane
