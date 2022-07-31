package business.abstracts;

import entities.concretes.Course;

import java.util.List;

public interface CampaignService {
    void updatePriceByCampaign(List<Course> courses);
}
