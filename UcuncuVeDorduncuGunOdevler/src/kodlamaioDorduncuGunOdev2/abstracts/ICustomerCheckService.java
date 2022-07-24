package kodlamaioDorduncuGunOdev2.abstracts;

import kodlamaioDorduncuGunOdev2.entities.Customer;

public interface ICustomerCheckService {

    public boolean checkIfRealPerson(Customer customer);
}
