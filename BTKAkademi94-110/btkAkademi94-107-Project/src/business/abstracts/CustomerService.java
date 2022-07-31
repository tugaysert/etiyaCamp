package business.abstracts;

import entities.concretes.Customer;
import entities.concretes.Employee;

import java.util.List;

public interface CustomerService {
    void add(Customer customer) throws Exception;
    void addByOtherBusiness(Customer customer);
    List<Customer> getAll();

}
