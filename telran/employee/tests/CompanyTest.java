package telran.employee.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.employee.dao.Company;
import telran.employee.dao.CompanyImpl;
import telran.employee.model.Employee;
import telran.employee.model.Manager;
import telran.employee.model.SalesManager;
import telran.employee.model.WageEmployee;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Company company;
    Employee[] firm;

    @BeforeEach
    void setUp() { // setup для каждого теста
        company = new CompanyImpl(5);
        firm = new Employee[5];
        firm[0] = new Manager(1000, "John", "Smith", 180, 20_000, 20);
        firm[1] = new WageEmployee(2000, "Mary", "Smith", 180, 50);
        firm[2] = new SalesManager(3000,"Peter", "Jackson",180, 100_000,0.05);
        firm[3] = new SalesManager(4000,"Tigran", "Petrosian", 90, 500_000, 0.1);
        for (int i = 0; i < firm.length ; i++) {
            company.addEmployee(firm[i]);
        }
    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(firm[3]));
        Employee employee = new SalesManager(5000,"Andy", "Jackson", 90, 40_000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5,company.size());
        employee = new SalesManager(6000,"Andy", "Jackson", 90, 40_000, 0.1);
        assertFalse(company.addEmployee(employee));
    }

    @Test
    void removeEmployee() {
        assertNotNull(company.removeEmployee(4000));
        assertNull(company.removeEmployee(4000));
        assertEquals(3, company.size());
    }

    @Test
    void findEmployee() {
        assertEquals(firm[1], company.findEmployee(2000));
        assertNotEquals(firm[1], company.findEmployee(3000));
    }

    @Test
    void totalSalary() {
        assertEquals(89_080, company.totalSalary());
        assertNotEquals(50_000, company.totalSalary());

    }

    @Test
    void averageSalary() {
        assertEquals(22_270, company.averageSalary());
        assertNotEquals(5000, company.averageSalary());
    }

    @Test
    void size() {
        assertEquals(4, company.size());
    }

    @Test
    void printEmployees() { // Андрей, этот метод я сделал с ГПТ, т.к. я не нашел выхода,
        // ибо наш метод по ТЗ - войд и ничего не возвращается. Мб, я сейчас не соображаю, но могли бы мы разобрать это на уроке?
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        company.printEmployees();

        System.setOut(originalOut);

        String expected = String.join(System.lineSeparator(),
                "Employee{id=1000, firstName='John', lastName='Smith', hours=180.0}",
                "Employee{id=2000, firstName='Mary', lastName='Smith', hours=180.0}",
                "Employee{id=3000, firstName='Peter', lastName='Jackson', hours=180.0}",
                "Employee{id=4000, firstName='Tigran', lastName='Petrosian', hours=90.0}"
        ) + System.lineSeparator();

        assertEquals(expected, outContent.toString());
    }

    @Test
    void totalSales() {
        assertEquals(600_000, company.totalSales());
        assertNotEquals(200_000, company.totalSales());
    }
}