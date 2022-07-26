package entities;

public class IndividualCustomer extends Customer {
    private String firstName;
    private String lastName;
    private String nationalityNumber;
    private CommercialOperationsCustomer commercialOperations;


    public IndividualCustomer(int id, int customerNumber, Channel channel, String firstName, String lastName, String nationalityNumber) {
        super(id, customerNumber, channel);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityNumber = nationalityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityNumber() {
        return nationalityNumber;
    }

    public void setNationalityNumber(String nationalityNumber) {
        this.nationalityNumber = nationalityNumber;
    }
}
