package org.generation.jwt.service;

import org.generation.jwt.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class CourseServiceImpl
    implements CourseService
{

    private final Map<String, Course> courseList = new HashMap<>();

    public CourseServiceImpl()
    {
        courseList.put( "INTRO-CS-1", new Course( "INTRO-CS-1", "Introduction to Computer Science",
                                                  "-Explain the basics about how the internet works\n"
                                                      + "-Explain the difference between a client and a server\n"
                                                      + "-Explain the TCP/IP protocol on a basic level\n"
                                                      + "-Explain the HTTP protocol\n"
                                                      + "-Explain and use the HTTP methods GET / POST / PUT / DELETE\n"
                                                      + "-Use HTTP methods GET and POST with an HTTP Client (Postman)\n"
                                                      + "-Use developer tools\n"
                                                      + "-Describe the difference between a Web Site and a Web Application\n"
                                                      + "-Give examples of Web Applications and Web Sites" ) );
        courseList.put( "INTRO-CS-2", new Course( "INTRO-CS-2", "Introduction to Algorithms",
                                                  "-Explain what an algorithm is \n"
                                                      + "-Explain the structure of an algorithm\n"
                                                      + "-Explain what code comments are and how to write them in JavaScript\n"
                                                      + "-Describe what reserved words in JavaScript are and give examples\n"
                                                      + "-Use primitive types to create variables and algorithms\n"
                                                      + "-Declare and use variables of different types\n"
                                                      + "-Write simple and correct programs using JavaScript\n"
                                                      + "-Use the Javascript prompt function to capture a user input" ) );
        courseList.put( "INTRO-CS-3", new Course( "INTRO-CS-3", "Algorithm Design and Problem Solving - Introduction",
                                                  "-Declare and use conditionals\n"
                                                      + "-Define functions using JavaScript\n"
                                                      + "-Write algorithms that solve matemathical problems\n"
                                                      + "-Manipulate Strings with JavaScript\n"
                                                      + "-Write algorithms that solve problems using String Functions\n"
                                                      + "-Use the Web debugger for JavaScript code on the Browser\n"
                                                      + "-Write algorithms that solve problems taking user inputs" ) );
        courseList.put( "INTRO-CS-4", new Course( "INTRO-CS-4", "Algorithm Design and Problem Solving - Advanced",
                                                  "-Define and use arrays for numeric values\n"
                                                      + "-Define and use arrays for String values\n"
                                                      + "-Write algorithms that solve mathematical problems using arrays\n"
                                                      + "-Read, understand and fix code writen by someone else\n"
                                                      + "-Write algorithms that solve problems using logical expresions \n"
                                                      + "-Explain and do code refactoring to improve code\n"
                                                      + "-Iterate arrays and modify its data\n"
                                                      + "-Write algorithms that solve basic sorting algorithms using arrays" ) );
    }

    @Override
    public List<Course> all()
    {
        return new ArrayList<>( courseList.values() );
    }

    @Override
    public void save( Course course )
    {
        courseList.put( course.getId(), course );
    }

    @Override
    public void delete( String courseId )
    {
        courseList.remove( courseId );
    }
}
