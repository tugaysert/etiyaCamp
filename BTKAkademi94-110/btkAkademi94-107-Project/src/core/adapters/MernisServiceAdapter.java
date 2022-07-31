package core.adapters;

import MernisReference.URVKPSPublicSoap;
import business.abstracts.PersonService;
import entities.concretes.Person;

public class MernisServiceAdapter implements PersonService {
    @Override
    public boolean checkPerson(Person person) throws Exception {
        URVKPSPublicSoap client = new URVKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(
                    Long.parseLong(person.getNationalIdentity()),
                    person.getFirstName().toUpperCase(),
                    person.getLastName().toUpperCase(),
                    person.getYearOfBirth()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
