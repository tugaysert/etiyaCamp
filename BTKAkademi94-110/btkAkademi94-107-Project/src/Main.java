import business.abstracts.CustomerService;
import business.abstracts.EmployeeService;
import business.concretes.CustomerManager;
import business.concretes.EmployeeManager;
import core.adapters.MernisServiceAdapter;
import core.validators.Validator;
import core.validators.ValidatorService;
import dataAccess.concretes.EntityFramework.EfCustomerDal;
import dataAccess.concretes.EntityFramework.EfEmployeeDal;
import entities.concretes.Customer;
import entities.concretes.Employee;
import entities.concretes.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        ValidatorService validatorService = new Validator();
        EmployeeService employeeService = new EmployeeManager(new EfEmployeeDal(), validatorService, new MernisServiceAdapter());
        Employee employee = new Employee(1,"M", "Sert", 1997, "17", 5000f );
        employeeService.add(employee);
        employeeService.getAll().stream().map(Person::getName).forEach(System.out::println);

        CustomerService customerService = new CustomerManager(new EfCustomerDal(), validatorService, new MernisServiceAdapter());
        Customer customer = new Customer(1, "Mustafa Tugay", "S", 1997, "1", 1);
        customerService.add(customer);
        customerService.getAll().stream().map(Customer::getName).forEach(System.out::println);

    }
}
