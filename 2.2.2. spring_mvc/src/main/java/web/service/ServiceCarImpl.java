package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
@Component
public class ServiceCarImpl implements ServiceCar {
    CarDao dao = new CarDaoImpl();
    @Override
    public List<Car> getAllCar() {
        return dao.getAllCar();
    }

    @Override
    public List<Car> getByNum(int num) {
        return dao.getByNum(num);
    }
}
