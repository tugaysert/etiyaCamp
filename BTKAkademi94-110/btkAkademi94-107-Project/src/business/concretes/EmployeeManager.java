package business.concretes;

import business.abstracts.EmployeeService;
import business.abstracts.PersonService;
import core.validators.ValidatorService;
import dataAccess.abstracts.IEmployeeDal;
import entities.concretes.Employee;

import java.util.List;

public class EmployeeManager implements EmployeeService {
    private final IEmployeeDal employeeDal;
    private final ValidatorService validatorService;
    private final PersonService personService;

    public EmployeeManager(IEmployeeDal employeeDal, ValidatorService validatorService, PersonService personService) {
        this.employeeDal = employeeDal;
        this.validatorService = validatorService;
        this.personService = personService;
    }

    @Override
    public void add(Employee employee) throws Exception {
        validatorService.validateFirstName(employee);
        validatorService.validateLastName(employee);
        validatorService.validateNationalIdentity(employee);
        personService.checkPerson(employee);
        employeeDal.checkEmployeeExist(employee);
        employeeDal.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDal.getAll();
    }
}
