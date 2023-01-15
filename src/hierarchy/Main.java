package hierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double diesel = Double.parseDouble(scanner.nextLine());
        int hP = Integer.parseInt(scanner.nextLine());

        SportCar sportCar = new SportCar(diesel, hP);
        RaceMotorcycle raceMotorcycle = new RaceMotorcycle(diesel, hP);
        CrossMotorcycle crossMotorcycle = new CrossMotorcycle(diesel,hP);
        FamilyCar familyCar = new FamilyCar(diesel, hP);

        sportCar.drive(100);
        raceMotorcycle.drive(100);
        crossMotorcycle.drive(100);
        familyCar.drive(100);

        System.out.printf("%.2f%n", sportCar.getFuel());
        System.out.printf("%.2f%n", raceMotorcycle.getFuel());
        System.out.printf("%.2f%n", crossMotorcycle.getFuel());
        System.out.printf("%.2f", familyCar.getFuel());
    }
}
