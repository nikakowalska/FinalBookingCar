package AbstractCar;

import java.util.Map;

public class ShowUsersServiceImpl implements ShowUsersService {
    public void showUsers(Map<Integer, User> listOfUsers) {
        listOfUsers.forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println(listOfUsers);
    }

}
