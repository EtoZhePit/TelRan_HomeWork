package telran.employee.dao;

import telran.employee.model.Employee;
import telran.employee.model.SalesManager;

public class CompanyImpl implements Company {
    Employee[] employees;
    int size;

    public CompanyImpl(int capacity){
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // TODO workHere! Add worker and check if it possible.
        //  If ID already exist you can't add new employee and after addating, increase capacity.
        //  For addEmployee you need FindEmployee. Test then implimitation. TDD!!


    if (employee == null||employees.length == size|| findEmployee(employee.getId()) != null) {
        return false;
    }
    employees[size] = employee;
    size++;
    return true;
    }

    @Override
    public Employee removeEmployee(int id) {

        if (findEmployee(id) == null) {
            return null;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
            Employee fired = employees[i];
            employees[i] = employees[size-1];
            employees[size-1] = null;
            size--;
            return fired;
            }
        }
        return null;

    }

    @Override
    public Employee findEmployee(int id) {

        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public double totalSalary() {
        double sum = 0;

        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] != null) {
                sum += employees[i].calcSalary();
            }
        }
        return sum;
    }

    @Override
    public double averageSalary() {
        double avSum = 0;
        double sum = 0;

        for (int i = 0; i <employees.length ; i++) {
            if (employees[i] != null) {
                sum += employees[i].calcSalary();
            }
            avSum = sum / size;
        }
        return avSum;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public double totalSales() {
        double sumSale = 0;

        for (int i = 0; i <employees.length ; i++) {
            if (employees[i] != null && employees[i] instanceof SalesManager) {
                sumSale += ((SalesManager) employees[i]).getSalesValue();
            }
        }
        return sumSale;
    }
}
