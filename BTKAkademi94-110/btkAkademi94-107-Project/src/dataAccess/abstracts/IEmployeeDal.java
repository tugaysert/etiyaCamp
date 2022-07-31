package dataAccess.abstracts;

import entities.concretes.Customer;
import entities.concretes.Employee;

import java.util.List;

public interface IEmployeeDal {
    List<Employee> getAll();

    void add(Employee employee);

    boolean checkEmployeeExist(Employee employee);
}
