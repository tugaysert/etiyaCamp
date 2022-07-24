package adapter;

import MernisReference.KDTKPSPublicSoap;
import abstracts.IPlayerCheckService;
import entity.Player;

public class MernisServiceAdapter implements IPlayerCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        KDTKPSPublicSoap client = new KDTKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula(
                    Long.parseLong(player.getNationalityId()),
                    player.getFirstName().toUpperCase(),
                    player.getLastName().toUpperCase(),
                    player.getBirthOfDate().getYear()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }
}
