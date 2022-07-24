package concrete;

import abstracts.IPlayerCheckService;
import abstracts.IPlayerService;
import entity.Player;
import repository.PlayerDatabase;

import java.util.List;
import java.util.Optional;

public class PlayerManager implements IPlayerService {
    private final IPlayerCheckService playerCheckService;
    private final PlayerDatabase playerDatabase;

    public PlayerManager(IPlayerCheckService playerCheckService, PlayerDatabase playerDatabase) {
        this.playerCheckService = playerCheckService;
        this.playerDatabase = playerDatabase;
    }

    @Override
    public void add(Player player) {
        if (playerCheckService.checkIfRealPerson(player))
            playerDatabase.add(player);
        else System.out.println("boyle bir kisi bulunamadi");
    }

    @Override
    public void update(Player player) {
        if (playerCheckService.checkIfRealPerson(player))
            playerDatabase.updatePlayer(player);
        else System.out.println("guncellenmek icin boyle bir kisi bulunamadi");
    }

    @Override
    public void delete(Player player) {
        playerDatabase.deleteById(player.getId());
    }

    @Override
    public Optional<Player> getPlayer(int id) {
        return playerDatabase.getPlayerById(id);
    }

    @Override
    public List<Player> getPlayers() {
        return playerDatabase.getAll();
    }
}
