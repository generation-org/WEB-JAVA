package org.generation.jwt.service;

import org.generation.jwt.model.Course;

import java.util.List;

public interface CourseService
{

    List<Course> all();

    Course save( Course course );

    void delete( String courseId );
}
