package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    @Override
    public List getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", "Black", "а123нн", 2018));
        cars.add(new Car("Mercedes", "White", "н555он", 2020));
        cars.add(new Car("Ford", "Red", "р082ту", 1999));
        cars.add(new Car("Toyota", "Green", "о450са", 2019));
        return cars;
    }
}
