package abstracts;

import entity.Campaign;
import entity.Player;

public interface ICampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);

}
