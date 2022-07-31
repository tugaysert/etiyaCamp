package dataAccess.concretes.EntityFramework;

import dataAccess.abstracts.IEmployeeDal;
import entities.concretes.Customer;
import entities.concretes.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EfEmployeeDal implements IEmployeeDal {

    private final List<Employee> employees = new ArrayList<>();


    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean checkEmployeeExist(Employee employee) {
        return employees.stream().anyMatch(e -> Objects.equals(e, employee));
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }


}
