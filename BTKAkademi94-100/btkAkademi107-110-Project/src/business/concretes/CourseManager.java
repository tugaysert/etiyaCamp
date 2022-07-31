package business.concretes;

import business.abstracts.CampaignService;
import business.abstracts.CourseService;
import dataAccess.abstracts.ICourseDal;
import entities.concretes.Course;

import java.util.List;

public class CourseManager implements CourseService {

    private final ICourseDal courseDal;
    private final CampaignService campaignService;

    public CourseManager(ICourseDal courseDal, CampaignService campaignService) {
        this.courseDal = courseDal;
        this.campaignService = campaignService;
    }

    @Override
    public List<Course> getAll() {
        List<Course> courses = courseDal.getAll();
        campaignService.updatePriceByCampaign(courses);
        return courseDal.getAll();
    }
}
