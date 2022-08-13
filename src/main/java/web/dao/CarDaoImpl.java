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
        cars.add(new Car("Lada", 2010, "������"));
        cars.add(new Car("���", 1980, "����"));
        cars.add(new Car("Citroen", 2004, "�������"));
        cars.add(new Car("Ford", 2019, "���"));
        cars.add(new Car("Honda", 1989, "������"));
        return cars;
    }
}
