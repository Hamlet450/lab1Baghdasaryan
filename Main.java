public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(599, "Inline-4", 120);
        Engine engine2 = new Engine(998, "V-Twin", 200);
        Engine engine3 = new Engine(1103, "V4", 215);

        Owner owner1 = new Owner("John Doe", "12345ABC", "555-1234");
        Owner owner2 = new Owner("Jane Smith", "67890XYZ", "555-5678");
        Owner owner3 = new Owner("Mike Johnson", "11223DEF", "555-9012");

        Registration reg1 = new Registration("ABC123", "CA", "12/2024");
        Registration reg2 = new Registration("XYZ789", "NY", "06/2025");
        Registration reg3 = new Registration("LMN456", "TX", "08/2026");

        Motorcycle moto1 = new Motorcycle("Honda", "867G77", 2022, Color.RED, engine1, owner1, reg1);
        Motorcycle moto2 = new Motorcycle("Yamaha", "734DA7", 2023, Color.BLUE, engine2, owner2, reg2);
        Motorcycle moto3 = new Motorcycle("Ducati", "800GIP", 2021, Color.YELLOW, engine3, owner3, reg3);

        System.out.println("Motorcycle 1:\n" + moto1);
        System.out.println("Motorcycle 2:\n" + moto2);
        System.out.println("Motorcycle 3:\n" + moto3);
    }
}
