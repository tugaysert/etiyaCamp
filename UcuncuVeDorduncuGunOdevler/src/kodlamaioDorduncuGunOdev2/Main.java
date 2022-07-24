package kodlamaioDorduncuGunOdev2;

import kodlamaioDorduncuGunOdev2.abstracts.BaseCustomerManager;
import kodlamaioDorduncuGunOdev2.adapters.MernisServiceAdapter;
import kodlamaioDorduncuGunOdev2.concretes.CustomerCheckManager;
import kodlamaioDorduncuGunOdev2.concretes.NeroCustomerManager;
import kodlamaioDorduncuGunOdev2.concretes.StarbucksCustomerManager;
import kodlamaioDorduncuGunOdev2.entities.Customer;

import java.time.LocalDateTime;

public class Main {


    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(
                1,
                "Mustafa Tuga",
                "Sert",
                1997,
                "44564567"));
    }

}
