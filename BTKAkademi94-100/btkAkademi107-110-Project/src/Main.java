import business.abstracts.CourseService;
import business.concretes.CourseManager;
import business.concretes.PercentCampaignManager;
import dataAccess.abstracts.ICourseDal;
import dataAccess.concretes.CourseDal;
import entities.concretes.Course;

public class Main {

    public static void main(String[] args) {

        Course course = new Course(1, "Java", 100f);
        Course course2 = new Course(2, "Phyton", 110f);
        Course course3 = new Course(3, "C#", 105f);
        ICourseDal courseDal = new CourseDal();
        courseDal.getAll().add(course);
        courseDal.getAll().add(course2);
        courseDal.getAll().add(course3);
        CourseService courseService = new CourseManager(courseDal, new PercentCampaignManager());
        courseService.getAll().forEach(c -> System.out.println(c.getName() + " egitim ucreti: "+ c.getPrice()));

    }
}
