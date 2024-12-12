public class Engine {
    private double displacement;
    private String type;
    private int horsepower;

    public Engine(double displacement, String type, int horsepower) {
        this.displacement = displacement;
        this.type = type;
        this.horsepower = horsepower;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }


    public String toString() {
        return displacement + "cc " + type + ", " + horsepower + " HP";
    }
}

