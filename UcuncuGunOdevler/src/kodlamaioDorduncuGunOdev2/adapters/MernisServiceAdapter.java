package kodlamaioDorduncuGunOdev2.adapters;

import kodlamaioDorduncuGunOdev2.MernisReference.NPKKPSPublicSoap;
import kodlamaioDorduncuGunOdev2.abstracts.ICustomerCheckService;
import kodlamaioDorduncuGunOdev2.entities.Customer;





import java.rmi.RemoteException;
import java.util.Locale;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        NPKKPSPublicSoap client = new NPKKPSPublicSoap();

        boolean result = false;
        try {

            result = client.TCKimlikNoDogrula(
                    Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(),
                    customer.getYearOfBirth()
            );
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
