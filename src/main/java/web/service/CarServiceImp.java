package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImp implements CarService {
    private static int cars_count;
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"Model1",1));
        cars.add(new Car(2,"Model2",2));
        cars.add(new Car(3,"Model3",3));
        cars.add(new Car(4,"Model4",4));
        cars.add(new Car(5,"Model5",5));
    }
    @Override
    public List<Car> carsList(int count) {
        return count <= 5 ? cars.subList(0, count):cars;
    }

    @Override
    public List<Car> carsTotalList() {
        return cars;
    }
}
