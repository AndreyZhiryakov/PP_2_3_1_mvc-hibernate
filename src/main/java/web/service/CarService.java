package web.service;


import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> carsList(int count);
    public List<Car> carsTotalList();

}
