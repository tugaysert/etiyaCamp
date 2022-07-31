package core.validators;

import entities.concretes.Person;

import java.util.Objects;

public class Validator implements ValidatorService {

    public void checkBounds(int value, String valueType, int min, int max) {
        if(value < min || value > max)
            throw new IllegalArgumentException(valueType+" is not within ["+min+" "+max+']');
    }

    public void checkString(String nameValue, String nameType, int min, int max) {
        Objects.requireNonNull(nameValue, () -> nameType+" is null");
        checkBounds(nameValue.length(), nameType, min, max);
    }

    public void validateFirstName(Person person){
        checkString(person.getFirstName(), "first name", 2, 20);
    }

    public void validateLastName(Person person){
        checkString(person.getLastName(), "last name", 2, 30);
    }

    public void validateNationalIdentity(Person person){
        checkString(person.getNationalIdentity(), "national identity", 11, 11);
    }

}
