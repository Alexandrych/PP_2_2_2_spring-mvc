package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCars(int count) {
        if (count > 0 && count <= 5) {
            return carDao.getCars().subList(0, count);
        } else {
            return carDao.getCars();
        }
    }
}
