package AbstractCar;

import java.util.Map;

public interface AddUserService{
    Map<Integer,User> addUser(final int i2);
    void addUser(Map<Integer,User>listOfUsers);
}
