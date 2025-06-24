package telran.garage.cars.dao;

import telran.garage.cars.model.Car;

import java.util.function.Predicate;

public class ColorPredicate implements Predicate<Car> {
    String color;

    public ColorPredicate(String color) {
        this.color = color;
    }

    @Override
    public boolean test(Car car) {
        return car.getColor().equals(color);
    }
}
