package dataAccess.concretes;

import dataAccess.abstracts.ICourseDal;
import entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseDal implements ICourseDal {

    private final List<Course> courses = new ArrayList<>();

    @Override
    public List<Course> getAll() {
        return courses;
    }

}
