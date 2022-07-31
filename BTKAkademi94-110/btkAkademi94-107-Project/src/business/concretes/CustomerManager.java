package business.concretes;

import business.abstracts.CustomerService;
import business.abstracts.PersonService;
import core.validators.ValidatorService;
import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

import java.util.List;

public class CustomerManager implements CustomerService {

    private final ICustomerDal  customerDal;
    private final ValidatorService validatorService;
    private final PersonService personService;

    public CustomerManager(ICustomerDal customerDal, ValidatorService validatorService, PersonService personService) {
        this.customerDal = customerDal;
        this.validatorService = validatorService;
        this.personService = personService;
    }

    @Override
    public void add(Customer customer) throws Exception {
        validatorService.validateFirstName(customer);
        validatorService.validateLastName(customer);
        validatorService.validateNationalIdentity(customer);
        personService.checkPerson(customer);
        customerDal.checkCustomerExist(customer);
        customerDal.add(customer);
    }

    @Override
    public void addByOtherBusiness(Customer customer) {

    }

    @Override
    public List<Customer> getAll() {
        return customerDal.getAll();
    }
}
