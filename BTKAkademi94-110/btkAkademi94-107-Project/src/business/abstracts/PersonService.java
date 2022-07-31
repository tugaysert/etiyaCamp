package business.abstracts;

import entities.concretes.Person;

public interface PersonService {
    /**
     *
     * @param person : dogrulanacak kisi
     * @return boolean
     */
    boolean checkPerson(Person person) throws Exception;
}
