package telran.garage.cars.dao;

import telran.garage.cars.model.Car;

import java.util.function.Predicate;

public class CompanyPredicate implements Predicate<Car> {
    String company;

    public CompanyPredicate (String company){
        this.company = company;
    }

    @Override
    public boolean test(Car car) {
        return car.getCompany().equals(company);
    }
}
