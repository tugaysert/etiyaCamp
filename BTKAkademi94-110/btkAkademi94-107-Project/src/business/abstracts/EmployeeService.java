package business.abstracts;

import entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee employee) throws Exception;
    List<Employee> getAll();
}
