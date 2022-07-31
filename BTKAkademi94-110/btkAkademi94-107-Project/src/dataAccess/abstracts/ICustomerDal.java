package dataAccess.abstracts;

import entities.concretes.Customer;

import java.util.List;

public interface ICustomerDal {
    void add(Customer customer);
    boolean checkCustomerExist(Customer customer);

    List<Customer> getAll();
}
