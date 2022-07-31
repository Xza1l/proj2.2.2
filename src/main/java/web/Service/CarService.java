package web.Service;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarService {
    private List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
        this.cars.add(new Car("BMW", 1, 7));
        this.cars.add(new Car("Lada", 2, 9));
        this.cars.add(new Car("Oka", 3, 1));
        this.cars.add(new Car("Paz", 4, 5));
        this.cars.add(new Car("Volga", 5, 7));
    }

    public List<Car> sizeof(int size) {
        List<Car> resList = new ArrayList<>();

        for (int i = 0; (i < size) && (i < 5); i++) {
            resList.add(cars.get(i));
        }
        return resList;
    }
}