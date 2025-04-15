package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Corolla", 2020),
            new Car("Honda", "Civic", 2021),
            new Car("BMW", "X5", 2022),
            new Car("Ford", "Focus", 2019),
            new Car("Audi", "A4", 2018)
    );

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
