package telran.garage.cars.dao;

import telran.garage.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage{
    Car[] cars;
    int size;

    public GarageImpl (int capacity){
        cars = new Car[capacity];
    }


    @Override
    public boolean addCar(Car car) {
        // Если в массиве есть место и не занят рег, то добавляем, а сайз увеличиваем
            if (car == null || cars.length == size || findCarByRegNumber(car.getRegNumber()) != null ) {
            return false;
    }
    cars[size] = car;
    size ++;
    return true;
    }

    @Override
    public Car removeCar(String regNumber) { // проходим по массиву.
        // если массив рег намбер не налл, то продолжаем
        // если есть совпадение, то добавляем файрд, туда отправляем исключение, а так же на место последнего
        // и сайз--

        if (findCarByRegNumber(regNumber) == null)
        return null;

        for (int i = 0; i <size ; i++) {
            if (cars[i].getRegNumber().equals(regNumber)){
                Car fired = cars[i];
                cars[i] = cars[size-1];
                cars[size-1] = null;
                size--;
                return fired;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) { // Мы проходим по массиву.
        // Если в массиве находится намбер - то возвращаем его.

        for (int i = 0; i < size ; i++) {
            if (cars[i] != null && cars[i].getRegNumber().equals(regNumber)) {
                return cars[i];
            }

        }

        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) { // проходим по массиву.
        // Если находим совмпадение по модели, то возвращаем в массив
        Predicate <Car> predicate = new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getModel().equals(model);
            }
        };
        return findCarsByPredicate(predicate);
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate(new CompanyPredicate(company));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate(new EnginePredicate(min, max));
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate(new ColorPredicate(color));
    }
    @Override
    public int size() {
        return size;
    }

    private Car[] findCarsByPredicate (Predicate <Car> predicate) { // проходим по массиву сайз 
        // если идет совпадение по предикату - то каунт++ 
        // А потом идем по массиву каунт
    int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])){
                count++;
            }
        }
    Car [] newGarage = new Car[count];
        for (int i = 0, j = 0; i < size ; i++) {
            if (predicate.test(cars[i])) {
            newGarage[j++] =cars[i];
            }
        }
        return newGarage;
    }
}
