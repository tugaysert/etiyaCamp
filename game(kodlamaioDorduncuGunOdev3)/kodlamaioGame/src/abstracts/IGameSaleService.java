package abstracts;

import entity.Campaign;
import entity.Game;
import entity.Player;

public interface IGameSaleService {

    void sell(Game game, Player player, Campaign campaign);
}
