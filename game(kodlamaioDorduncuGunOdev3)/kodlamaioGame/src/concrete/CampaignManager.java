package concrete;

import abstracts.ICampaignService;
import entity.Campaign;

public class CampaignManager implements ICampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyasi eklendi.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyasi guncellendi.");

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyasi silindi.");

    }
}
