package entities.concretes;

import entities.abstracts.IEntity;

import java.util.Objects;

public class Person implements IEntity {
    private int id;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String nationalIdentity;

    public Person(int id, String firstName, String lastName, int yearOfBirth, String nationalIdentity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.nationalIdentity = nationalIdentity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public String getName() {
        return getFirstName() + " " + getLastName();

    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Person other = (Person) obj;
        /*if ((this.getName() == null) ? (other.getName() != null) : !this.getName().equals(other.getName())) {
            return false;
        }*/

        return Objects.equals(this.getNationalIdentity(), other.getNationalIdentity());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.getName() != null ? this.getName().hashCode() : 0);
        hash = 53 * hash + this.getYearOfBirth();
        return hash;
    }
}
