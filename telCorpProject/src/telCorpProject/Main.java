package telCorpProject;

import java.time.LocalDate;

import telCorpProject.entities.Customer;
import telCorpProject.entities.IndividualCustomer;
import telCorpProject.entities.Invoice;
import telCorpProject.entities.Service;
import telCorpProject.entities.Subscription;

public class Main {
	
	public static void main(String[] args) {
		Customer customer = new IndividualCustomer(1, "111111", "11111111", "Melihcan", "Çakıl");
		Service service = new Service(1, "ADSL");
		Subscription subscription = new Subscription(1,customer,LocalDate.of(2022, 7, 20),service);
		Invoice invoice = new Invoice(1, subscription, LocalDate.of(2022, 7, 20), LocalDate.of(2022, 7, 30));
		
		customer.getSubscriptions().add(subscription);
		service.getSubscriptions().add(subscription);
		subscription.getInvoices().add(invoice);
		
	}
	

}
