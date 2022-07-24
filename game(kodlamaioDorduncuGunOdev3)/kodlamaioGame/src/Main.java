import abstracts.IPlayerService;
import adapter.MernisServiceAdapter;
import concrete.PlayerManager;
import entity.Campaign;
import entity.Game;
import entity.Player;
import repository.PlayerDatabase;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(1, "firstGame", 10);
        Campaign campaign = new Campaign(1, "yuzde on indirim", 10);
        Player player = new Player(
                1,
                "Mustafa Tugay",
                "Sert",
                LocalDate.of(1997,8,13),
                "159"
        );

        Player updatedPlayer = new Player(
                1,
                "Mustafa ",
                "Sert",
                LocalDate.of(1997,8,13),
                "172548"
        );

        IPlayerService playerService = new PlayerManager(new MernisServiceAdapter(), PlayerDatabase.getInstance());
        playerService.add(player);
        playerService.update(updatedPlayer);

        System.out.println(playerService.getPlayer(1));
        System.out.println(playerService.getPlayers());

    }
}
