public class Main {
    public static void main(String[] args) {

        Motorcycle moto1 = new Motorcycle("Honda", "867G77", 2022, 599, Color.RED);
        Motorcycle moto2 = new Motorcycle("Yamaha", "734DA7", 2023, 998, Color.BlUE);
        Motorcycle moto3 = new Motorcycle("Ducati", "800GIP", 2021, 1103, Color.YELLOW);


        System.out.println("Motorcycle 1: " + moto1.getMake() + " " + moto1.getVin() + ", Year: " + moto1.getYear() + ", Engine: " + moto1.getHorsepower() + "cc, Color: " + moto1.getColor());
        System.out.println("Motorcycle 2: " + moto2.getMake() + " " + moto2.getVin() + ", Year: " + moto2.getYear() + ", Engine: " + moto2.getHorsepower() + "cc, Color: " + moto2.getColor());
        System.out.println("Motorcycle 3: " + moto3.getMake() + " " + moto3.getVin() + ", Year: " + moto3.getYear() + ", Engine: " + moto3.getHorsepower() + "cc, Color: " + moto3.getColor());
    }
}
