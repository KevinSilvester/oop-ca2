package dkit.oop;

public abstract class Airplane {

    private int id;
    private String type;     // e.g. "Airbus 380"
    private static int nextId = 100;  // to generate/supply unique id values
    
    Airplane(String type) {
        this.id = Airplane.nextId++;    // generate unique id
        this.type = type;
    }

    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "id='" + id + '\'' +
                ", type='" + type + '\'' ;
    }

} // end of Airplane
