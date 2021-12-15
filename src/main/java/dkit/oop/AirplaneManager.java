package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {

    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.

    // write add() method
    public void add(Airplane airplane) {
        this.airplaneList.add(airplane);
    }


    public void displayAllAirplanes() {
        for (Airplane a: this.airplaneList)
            System.out.println(a);
    }

    public void displayAllPassengerAirplanes() {
        for (Airplane a: this.airplaneList)
            if (a instanceof PassengerAirplane)
                System.out.println(a);
    }

    //  write method getAllCargoAirplanes()
    public List<CargoAirplane> getAllCargoAirplane() {
        List<CargoAirplane> cargoAirplanes = new ArrayList<>();

        for (Airplane a: this.airplaneList)
            if (a instanceof CargoAirplane)
                cargoAirplanes.add((CargoAirplane) a);

        return cargoAirplanes;
    }


    // write  addPassengerNameToAirplane( airplaneId, passengerName)
    public boolean addPassengerNameToAirplane(int airplaneId, String passengerName) {
        for (Airplane a: this.airplaneList) {
            if (a instanceof PassengerAirplane && a.getId() == airplaneId) {
                ((PassengerAirplane) a).addPassenger(passengerName);
                return true;
            }
        }
        return false;
    }


    // write containsAirplane( Airplane plane )
    public boolean containsAirplane(Airplane plane) {
        for (Airplane a: this.airplaneList) {
            if (a.equals(plane)) {
                return true;
            }
        }
        return false;
    }


    // write findAirplaneByPassengerName( passengerName )
    public Airplane findAirplaneByPassengerName(String passengerName) {
        for (Airplane a: this.airplaneList)
            if (a instanceof PassengerAirplane)
                if (((PassengerAirplane) a).getPassengerList().contains(passengerName))
                    return a;

        return null;
    }

    // write displayAllAirplanesInOrderOfType( argument )
    // not sure what arguments should be passed in
    public void displayAllAirplanesInOrderOfType() {

    }


} // end of AirplaneManager


