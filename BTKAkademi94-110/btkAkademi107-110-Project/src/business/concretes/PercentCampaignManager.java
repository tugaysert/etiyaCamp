package business.concretes;

import business.abstracts.CampaignService;
import entities.concretes.Course;

import java.util.List;

public class PercentCampaignManager implements CampaignService {

    @Override
    public void updatePriceByCampaign(List<Course> courses) {
        courses.forEach(course -> course.setPrice(course.getPrice()-course.getPrice()*percentage()));
    }

    private float percentage() {
        return 0.25f;
    }
}
