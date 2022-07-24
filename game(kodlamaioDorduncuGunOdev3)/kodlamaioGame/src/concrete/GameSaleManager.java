package concrete;

import abstracts.IGameSaleService;
import entity.Campaign;
import entity.Game;
import entity.Player;

public class GameSaleManager implements IGameSaleService {
    @Override
    public void sell(Game game, Player player, Campaign campaign) {
        double lastPrice = game.getPrice()-(game.getPrice()*campaign.getDiscount()/100);
        game.setPrice(lastPrice);
    }
}
