package AbstractCar;

import java.util.Map;

public class ShowAllCarsImpl implements ShowAllCarsService {
    public void showAllCarsService(Map<Integer, BasicCar> carsForRent) {
        carsForRent.forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println(carsForRent);
    }

}
