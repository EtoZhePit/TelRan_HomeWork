package telran.garage.cars.dao;

import telran.garage.cars.model.Car;

import java.util.function.Predicate;

public class EnginePredicate implements Predicate<Car> {
    double min;
    double max;

    public EnginePredicate(double min, double max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean test(Car car) {
        return car.getEngine() >= min && car.getEngine() <max;
    }
}
