package org.generation.jwt.controller;


import org.generation.jwt.model.Course;
import org.generation.jwt.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController
{

    private final CourseService courseService;

    public CourseController( @Autowired CourseService courseService )
    {
        this.courseService = courseService;
    }

    @CrossOrigin( "*" )
    @GetMapping( "/api/courses" )
    public List<Course> all()
    {
        return courseService.all();
    }
}
