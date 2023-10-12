package AbstractCar;

import java.util.Map;

public interface AddAllCarsService {
    Map<Integer, BasicCar> addAllCarsService(final int i);

    void addAllCarsService(Map<Integer, BasicCar> carsForRent);
}