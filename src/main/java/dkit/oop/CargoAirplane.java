package dkit.oop;

public class CargoAirplane extends Airplane {

    // fields (ref. Q1)
    double MAX_LOAD_KILOS;
    double currentLoad;

    // constructor
    CargoAirplane(String type, double maxLoad) {
        super(type);
        this.MAX_LOAD_KILOS = maxLoad;
    }

    // toString()
    @Override
    public String toString() {
        return "CargoAirplane{" +
                "id=" + super.getId() +
                ", type='" + super.getType() +
                ", MAX_LOAD_KILOS=" + MAX_LOAD_KILOS +
                ", currentLoad=" + currentLoad +
                '}';
    }
} // END of CargoAirplane class.

