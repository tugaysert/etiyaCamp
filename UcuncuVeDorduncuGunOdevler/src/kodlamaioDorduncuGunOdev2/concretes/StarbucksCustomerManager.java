package kodlamaioDorduncuGunOdev2.concretes;

import kodlamaioDorduncuGunOdev2.abstracts.BaseCustomerManager;
import kodlamaioDorduncuGunOdev2.abstracts.ICustomerCheckService;
import kodlamaioDorduncuGunOdev2.abstracts.ICustomerService;
import kodlamaioDorduncuGunOdev2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {


        if (customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        }
        else System.out.println("Person dogrulamasi yapilamadi");
    }


}
