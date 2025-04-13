package web.service;

import com.example.demo.model.Car;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList = Arrays.asList(
            new Car("Toyota", "Corolla", 2020),
            new Car("Honda", "Civic", 2021),
            new Car("Ford", "Focus", 2019),
            new Car("BMW", "X5", 2022),
            new Car("Audi", "A4", 2018)
    );

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
