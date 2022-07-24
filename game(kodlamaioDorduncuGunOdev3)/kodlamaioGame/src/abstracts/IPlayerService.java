package abstracts;

import entity.Player;

import java.util.List;
import java.util.Optional;

public interface IPlayerService {
    void add(Player player);
    void update(Player player);
    void delete(Player player);
    Optional<Player> getPlayer(int id);
    List<Player> getPlayers();

}
