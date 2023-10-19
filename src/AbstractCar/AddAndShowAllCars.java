package AbstractCar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddAndShowAllCars implements AddAllCarsService, ShowAllCarsService {

    private static String SUV = "suv";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";

    @Override
    public Map<Integer, BasicCar> addAllCarsService(final int maksiloscAut) {
        Map<Integer, BasicCar> carsForRent = new HashMap<>();
        for (int i = 0; i < maksiloscAut; i++) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Wpisz " + maksiloscAut + " modele aut");
            System.out.println(ANSI_GREEN);
            System.out.println("podaj typ auta");
            String carType = keyboard.nextLine();
            System.out.println("podaj model auta");
            String modele = keyboard.nextLine();
            System.out.println(("podaj vin"));
            int vin = keyboard.nextInt();
            System.out.println("podaj miles");
            int miles = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("podaj kolor");
            String colour = keyboard.nextLine();
            System.out.println(ANSI_RESET);

            if (carType.equals(SUV)) {
                BasicCar car = new Suv(modele, vin, miles, colour);
                carsForRent.put(car.getVin(), car);
            } else {
                System.out.println("podaj max speed");
                int maxSpeed = keyboard.nextInt();
                keyboard.nextLine();
                BasicCar car = new Hatchback(modele, vin, miles, colour, maxSpeed);
                carsForRent.put(car.getVin(), car);
            }
        }
        return carsForRent;
    }

    @Override
    public void addAllCarsService(Map<Integer, BasicCar> carsForRent2) {

        for (int i = 0; i < 1; i++) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Wpisz 3 modele aut");
            System.out.println("podaj typ auta");
            String suv = "suv";
            if (keyboard.hasNext(contentEquals(suv))) {
                keyboard.nextLine();
                System.out.println("podaj model auta");
                String modele = keyboard.nextLine();
                System.out.println(("podaj vin"));
                int vin = keyboard.nextInt();
                System.out.println("podaj miles");
                int miles = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("podaj kolor");
                String colour = keyboard.nextLine();
                BasicCar car = new Suv(modele, vin, miles, colour);
                carsForRent2.put(car.getVin(), car);
            } else {
                keyboard.nextLine();
                System.out.println("podaj model auta");
                String modele = keyboard.nextLine();
                System.out.println(("podaj vin"));
                int vin = keyboard.nextInt();
                System.out.println("podaj miles");
                int miles = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("podaj kolor");
                String colour = keyboard.nextLine();
                System.out.println("podaj max speed");
                int maxSpeed = keyboard.nextInt();
                keyboard.nextLine();
                BasicCar car = new Hatchback(modele, vin, miles, colour, maxSpeed);
                carsForRent2.put(car.getVin(), car);
            }
        }
    }

    private String contentEquals(final String suv) {
        return "suv";
    }

    @Override
    public void showAllCarsService(final Map<Integer, BasicCar> carsForRent) {

    }
}


