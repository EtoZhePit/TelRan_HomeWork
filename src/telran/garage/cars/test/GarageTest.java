package telran.garage.cars.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.garage.cars.dao.Garage;
import telran.garage.cars.dao.GarageImpl;
import telran.garage.cars.model.Car;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {

    Garage garage;
    Car[] factory;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        factory = new Car[5];
        factory[0] = new Car("20000", "A4", "Audi", 2.0, "Black");
        factory[1] = new Car("20001", "Corolla", "Toyota", 1.5, "White");
        factory[2] = new Car("20002", "Civic", "Honda", 1.5, "Red");
        factory[3] = new Car("20003", "Qashqai", "Nissan", 1.5, "Yellow");
        for (int i = 0; i < factory.length; i++) {
            garage.addCar(factory[i]);
        }
    }


    @Test
    void addCar() { {
        assertFalse(garage.addCar(factory[2]));
        Car car = new Car("20004", "Jetta", "VW", 1.5, "Blue");
        assertTrue(garage.addCar(car));
        car = new Car("20005", "Beetle", "VW", 1.5, "Pink");
        assertFalse(garage.addCar(car));
        }
    }

    @Test
    void removeCar() {
      assertNotNull(garage.removeCar("20000"));
      assertNull(garage.removeCar("20000"));
    }

    @Test
    void findCarByRegNumber() {
        assertEquals(factory[3], garage.findCarByRegNumber("20003"));
        assertNotEquals(factory[2], garage.findCarByRegNumber("20000"));
    }

    @Test
    void findCarsByModel() {
        Car car = new Car("20004", "Qashqai", "Nissan", 1.5, "Blue");
        garage.addCar(car);
        Car[] actual = garage.findCarsByModel("Qashqai");
        Car[] expected = {factory[3], car};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompany() {
        Car car  = new Car("20004", "Qashqai", "Nissan", 1.5, "Blue");
        garage.addCar(car);
        Car [] actual = garage.findCarsByCompany("Nissan");
        Car [] expected = {factory[3], car};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByEngine() {
        Car[] actual = garage.findCarsByEngine(1.5, 1.9);
        Car[] expected = {factory[1],factory[2],factory[3]};
        assertArrayEquals(expected,actual);

    }

    @Test
    void findCarsByColor() {
        Car car = new Car ("20004", "Qashqai", "Nissan", 1.5, "Yellow");
        garage.addCar(car);
        Car[] actual = garage.findCarsByColor("Yellow");
        Car[] expected = {factory[3], car};
        assertArrayEquals(expected,actual);
    }

    @Test
    void size() {
        assertEquals(4, garage.size());
    }
}