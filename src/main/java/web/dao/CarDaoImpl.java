package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 2010, "Россия"));
        cars.add(new Car("ЗИЛ", 1980, "СССР"));
        cars.add(new Car("Citroen", 2004, "Франция"));
        cars.add(new Car("Ford", 2019, "США"));
        cars.add(new Car("Honda", 1989, "Япония"));
        return cars;
    }
}
