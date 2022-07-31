package dataAccess.concretes.EntityFramework;

import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EfCustomerDal implements ICustomerDal {

    private final List<Customer> customers = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public boolean checkCustomerExist(Customer customer) {
        return customers.stream().anyMatch(c-> Objects.equals(c, customer));
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }
}
