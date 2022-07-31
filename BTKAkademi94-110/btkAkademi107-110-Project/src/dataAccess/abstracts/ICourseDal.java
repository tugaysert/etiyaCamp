package dataAccess.abstracts;

import entities.concretes.Course;

import java.util.List;

public interface ICourseDal {

    List<Course> getAll();

}
