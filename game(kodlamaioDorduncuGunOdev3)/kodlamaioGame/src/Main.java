import abstracts.IPlayerService;
import adapter.MernisServiceAdapter;
import concrete.GameSaleManager;
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
                "172"
        );


      /*  Player updatedPlayer = new Player(
                1,
                "Mustafa Tugay",
                "Sert",
                LocalDate.of(1997,11,13),
                "172"
        );*/

        MernisServiceAdapter mernisServiceAdapter = new MernisServiceAdapter();
        IPlayerService playerService = new PlayerManager(mernisServiceAdapter, PlayerDatabase.getInstance());
        playerService.add(player);
        //playerService.update(updatedPlayer);

        System.out.println(playerService.getPlayer(1));
        System.out.println(playerService.getPlayers());

        GameSaleManager gameSaleManager = new GameSaleManager(mernisServiceAdapter);
        gameSaleManager.sell(game, player, campaign);

    }
}
