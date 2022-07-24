package concrete;

import abstracts.IGameSaleService;
import abstracts.IPlayerCheckService;
import entity.Campaign;
import entity.Game;
import entity.Player;

public class GameSaleManager implements IGameSaleService {
    private final IPlayerCheckService playerCheckService;

    public GameSaleManager(IPlayerCheckService playerCheckService) {
        this.playerCheckService = playerCheckService;
    }

    @Override
    public void sell(Game game, Player player, Campaign campaign) {
        if (playerCheckService.checkIfRealPerson(player)) {
            double lastPrice = game.getPrice()-(game.getPrice()*campaign.getDiscount()/100);
            System.out.println("Player ismi: " +player.getName());
            System.out.println("Game ismi: " + game.getGameName());
            System.out.println("Kampanya ismi: " + campaign.getCampaignName());
            System.out.println("Indirim miktari: %"+ campaign.getDiscount());
            System.out.println("Son fiyat: "+ lastPrice);
        }
        else System.out.println("boyle bir player bulunamadi.");
    }
}
