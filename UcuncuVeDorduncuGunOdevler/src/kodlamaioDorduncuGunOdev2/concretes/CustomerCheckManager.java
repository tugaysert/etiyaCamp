package kodlamaioDorduncuGunOdev2.concretes;

import kodlamaioDorduncuGunOdev2.abstracts.ICustomerCheckService;
import kodlamaioDorduncuGunOdev2.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {


        return true;
    }
}
