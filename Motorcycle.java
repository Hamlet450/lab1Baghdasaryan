public class Motorcycle {
    private String make;
    private String vin;
    private int year;
    private Color color;
    private Engine engine;
    private Owner owner;
    private Registration registration;

    public Motorcycle(String make, String vin, int year, Color color, Engine engine, Owner owner, Registration registration) {
        this.make = make;
        this.vin = vin;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.owner = owner;
        this.registration = registration;
    }

    public String getMake() {
        return make;
    }

    public String getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Owner getOwner() {
        return owner;
    }

    public Registration getRegistration() {
        return registration;
    }


    public String toString() {
        return make + " " + vin + ", Year: " + year + ", Engine: " + engine + ", Color: " + color + "\nOwner: " + owner + "\nRegistration: " + registration;
    }
}

