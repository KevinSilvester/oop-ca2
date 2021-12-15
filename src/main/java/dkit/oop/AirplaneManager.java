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


    public void displayAllAirplanes() {
        // add code
    }

    public void displayAllPassengerAirplanes() {
        // add code
    }

    //  write method getAllCargoAirplanes()


    // write  addPassengerNameToAirplane( airplaneId, passengerName)


    // write containsAirplane( Airplane plane )


    // write findAirplaneByPassengerName( passengerName )

    // write displayAllAirplanesInOrderOfType( argument )


} // end of AirplaneManager


