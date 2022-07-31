package entities.concretes;

public class Employee extends Person{

    private float salary;

    public Employee(int id, String firstName, String lastName, int yearOfBirth, String nationalIdentity, float salary) {
        super(id, firstName, lastName, yearOfBirth, nationalIdentity);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
