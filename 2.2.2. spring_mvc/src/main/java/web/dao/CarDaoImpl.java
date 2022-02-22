package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Mersedes", 2019));
        cars.add(new Car(2, "Pejo", 2020));
        cars.add(new Car(3, "Honda", 2015));
        cars.add(new Car(4, "Henday", 2017));
        cars.add(new Car(5, "Audi", 2021));
    }

    @Override
    public List<Car> getAllCar() {
        return cars;
    }

    @Override
    public List<Car> getByNum(int num) {

        ArrayList<Car> cars1 = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (num > 5) {

                return cars;
            } else {
                cars1.add(cars.get(i));
            }

        }
        return cars1;
    }
}
