import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of car: 1 - Sedan, 2 - SUV");
        int carType = scanner.nextInt();

        CarFactory carFactory;
        if (carType == 1) {
            carFactory = new SedanCarFactory();
        } else {
            carFactory = new SUVCarFactory();
        }

        System.out.println("Choose the engine type: 1 - V6, 2 - V8");
        int engineType = scanner.nextInt();
        Engine engine = (engineType == 1) ? carFactory.createEngine() : new V8Engine();

        System.out.println("Choose the type of wheels: 1 - Standard, 2 - Off-Road");
        int wheelsType = scanner.nextInt();
        Wheels wheels = (wheelsType == 1) ? carFactory.createWheels() : new OffRoadWheels();

        System.out.println("Choose the type of interior: 1 - Leather, 2 - Cloth");
        int interiorType = scanner.nextInt();
        Interior interior = (interiorType == 1) ? carFactory.createInterior() : new ClothInterior();

        System.out.println("Selected car configuration:");
        engine.describe();
        wheels.describe();
        interior.describe();

        scanner.close();
    }
}