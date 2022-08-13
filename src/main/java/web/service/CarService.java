package web.service;

import web.model.Car;

import java.util.List;

public class CarService {

    public static List<Car> count(List<Car> list, int count) {
        if (count > 0 && count <= 5) {
            return list.subList(0, count);
        } else {
            return list;
        }
    }
}
