package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;
import web.dao.CarDao;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> allCars = carDao.getAllCars();
        if (count == null || count >= allCars.size()) {
            return allCars;
        }
        return allCars.subList(0, count);
    }
}
