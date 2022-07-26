import entities.*;
import repository.concretes.CustomerRepository;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        CommercialOperationsCustomer customer1 = new CommercialOperationsCustomer(
                1,
                100,
                new Channel(1, "Twitter"),
                "Mustafa",
                "Sert",
                "1215151",
                LocalDateTime.now());
        Address address = new Address(1, "bireyselAdres1", customer1);
        customer1.getAddresses().add(address);
        BalanceSheet balanceSheet = new BalanceSheet(1, 10000, LocalDateTime.now(), customer1);
        customer1.getBalanceSheets().add(balanceSheet);

        CorporateCustomer corporateCustomer = new CorporateCustomer(
                2,
                200,
                new Channel(2, "Facebook"),
                "Etiya",
                "151541451");
        Address address2 = new Address(2, "kurumsalAdres1", corporateCustomer);
        corporateCustomer.getAddresses().add(address2);
        BalanceSheet balanceSheet2 = new BalanceSheet(1, 10000, LocalDateTime.now(), corporateCustomer);
        corporateCustomer.getBalanceSheets().add(balanceSheet2);

        Customer customer3 = new IndividualCustomer(
                3,
                300,
                new Channel(3, "LinkedIn"),
                "Tugay",
                "Sert",
                "1565156");
        Address address3 = new Address(3, "bireyselAdres2", customer3);
        customer3.getAddresses().add(address3);


        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.add(customer1);
        customerRepository.add(corporateCustomer);
        customerRepository.add(customer3);
        System.out.println(customerRepository.getAll());


    }
}
