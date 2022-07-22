package kodlamaioDorduncuGunOdev2.abstracts;

import kodlamaioDorduncuGunOdev2.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

    @Override
    public void save(Customer customer) {
        System.out.println("customer veritabanina yazildi "+ customer.getFirstName());
    }
}
