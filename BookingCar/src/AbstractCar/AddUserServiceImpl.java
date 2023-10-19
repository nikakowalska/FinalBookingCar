package AbstractCar;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddUserServiceImpl implements AddUserService {
    @Override
    public Map<Integer, User> addUser(final int id) {
        Map<Integer, User> listOfUsers = new HashMap<>();
        for (int i = 0; i < id; i++) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Dzień dobry. Podaj swoje dane.");
            System.out.println("Imie:");
            String firstName = keyboard.nextLine();
            System.out.println(("Nazwisko:"));
            String lastName = keyboard.nextLine();
            System.out.println("Adres email:");
            String email = keyboard.nextLine();
            System.out.println("Numer telefonu:");
            int telNumber = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Data urodzenia:");
            LocalDate dateOfBirth = LocalDate.parse(keyboard.nextLine());
            User newUser = new User(id, firstName, lastName, email, telNumber, dateOfBirth);
            listOfUsers.put(newUser.getId(), newUser);
        }
        return listOfUsers;
    }

    @Override
    public void addUser(final Map<Integer, User> listOfUsers) {

    }
}




