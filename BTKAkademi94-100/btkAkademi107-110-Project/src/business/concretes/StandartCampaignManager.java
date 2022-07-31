package business.concretes;

import business.abstracts.CampaignService;
import entities.concretes.Course;

import java.util.List;

public class StandartCampaignManager implements CampaignService {

    @Override
    public void updatePriceByCampaign(List<Course> courses) {
        courses.forEach(course -> course.setPrice(getPrice()));
    }

    private float getPrice() {
        return 50;
    }
}
