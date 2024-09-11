public class Motorcycle {
    private String make;
    private String vin;
    private int year;
    private double horsepower;
    private Color color;


    public Motorcycle(String make, String vin, int year, double horsepower, Color color) {
        this.make = make;
        this.vin = vin;
        this.year = year;
        this.horsepower = horsepower;
        this.color = color;
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

    public double getHorsepower() {
        return horsepower;
    }

    public Color getColor() {
        return color;
    }


    public void setMake(String make) {
        this.make = make;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

