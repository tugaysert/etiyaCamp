package repository.concretes;

import entities.Customer;
import repository.abstracts.DataRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements DataRepository<Customer> {
   private final List<Customer> customers = new ArrayList<>();

   public List<Customer> getAll(){
       return customers;
   }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }
}
