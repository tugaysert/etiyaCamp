package core.validators;

import entities.concretes.Person;

public interface ValidatorService {
    void checkBounds(int value, String valueType, int min, int max);
    void checkString(String nameValue, String nameType, int min, int max);
    void validateFirstName(Person person);
    void validateLastName(Person person);
    void validateNationalIdentity(Person person);

}
