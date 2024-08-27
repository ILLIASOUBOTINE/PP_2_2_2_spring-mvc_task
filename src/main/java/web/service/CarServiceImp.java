package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;


@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("color1","model1", 1),
           new Car("color2","model2", 2),
           new Car("color3","model3", 3),
           new Car("color4","model4", 4),
           new Car("color5","model5", 5));


    @Override
    public List<Car> getCars(Integer count) {

        if(count == null || count > cars.size()) {
            return cars;
        }

        return cars.subList(0, count);
    }
}
