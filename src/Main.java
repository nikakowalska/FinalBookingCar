import AbstractCar.*;

import java.util.*;

public class Main {
    private static String suv;

    public static void main(String[] args) {
        // basicCarList2();
        Zmiana z1 = new Zmiana("Ala");
        Zmiana z2 = new Zmiana("Ola");
        Zmiana z3 = new Zmiana("Jaś");
        Zmiana z4 = new Zmiana("Kuba");
Test test = new Test("M");

        Map<Integer, BasicCar> carsForRent = new HashMap<>();

        Set<Zmiana> hashCode = new HashSet<>();
        hashCode.add(z1);
        hashCode.add(z2);
        hashCode.add(z3);
        hashCode.add(z4);
        hashCode.forEach(s-> System.out.println(s.getName()));
    }

    private static void basicCarList() {
        BasicCar car1 = new Suv("Porsche", 6789, 12345, "red"); // to jest mala baza danych
        Suv car2 = new Suv("Lamborghini", 5643, 4321, "gold");

        System.out.println(car2.getColour());
        System.out.println(car2.getVin());
        ArrayList<BasicCar> listOfCars = new ArrayList<BasicCar>();
        listOfCars.add(car1);
        listOfCars.add(car2);
        for (BasicCar l : listOfCars) {
            System.out.println(l.getModel() + " " + l.getColour() + " " + l.getVin() + " " + l.getMiles());
        }
    }

    private static void basicCarList2() {
//klasa main potrzebuje ekipy budowlanej ktora konstruuje za pomoca innych klas czy interfejsow, to co jest po new jest budowana rzecza, a polewej jak chce to rozpoznawac jako czlowiek, czyli nadany przeze mnie typ ktory zajmuje okreslone miejsce
        ShowAllCarsService pokazujeAuta = new ShowAllCarsImpl();
        ShowUsersService pokazujeUserow = new ShowUsersServiceImpl();
        AddAndShowAllCars dodajeAutoDoListy = new AddAndShowAllCars();//tworzy liste aut
        //doczytac mapa ktora laczy klucze
        Map<Integer, BasicCar> carsForRent = dodajeAutoDoListy.addAllCarsService(1);//decyduje ile aut wpisac
        AddUserService dodajeUsera = new AddUserServiceImpl();
        Map<Integer, User> listOfUsers = dodajeUsera.addUser(1);
        //  HashMap<Integer, BasicCar> carsForRent = dodajeAutoDoListy.getCarsForRent();// = przypisuje prawa do lewej
        pokazujeAuta.showAllCarsService(carsForRent);
        pokazujeUserow.showUsers(listOfUsers);
        //Map<User,BasicCar> userpluscar =

        /*
        Map<Integer, BasicCar> map = new HashMap<>();
        dodajeAutoDoListy.addAllCars(map);
        showAllCars.showAllCars(map);
                 */

    }
}


   


