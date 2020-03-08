package org.generation.Students;

import org.generation.Students.data.entity.Student;
import org.generation.Students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;

@SpringBootApplication
public class StudentsApplication
{

    static StudentService studentService;

    public StudentsApplication( @Autowired StudentService studentService )
    {
        StudentsApplication.studentService = studentService;
    }

    public static void main( String[] args )
    {
        SpringApplication.run( StudentsApplication.class, args );
        loadSampleData();
    }

    private static void loadSampleData()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set( Calendar.YEAR, 1986 );
        studentService.save( new Student( "Carlos", "carlos@generation.org", calendar.getTime() ) );
        studentService.save( new Student( "Santiago", "santiago@generation.org", calendar.getTime() ) );
        studentService.save( new Student( "Debbie", "debbie@generation.org", calendar.getTime() ) );
        studentService.save( new Student( "Camilo", "camilo@generation.org", calendar.getTime() ) );
        studentService.save( new Student( "Cleon", "cleon@generation.org", calendar.getTime() ) );
        studentService.save( new Student( "Maria", "maria@generation.org", calendar.getTime() ) );
        studentService.save( new Student( "Peter", "peter@generation.org", calendar.getTime() ) );
        Iterable<Student> students = studentService.all();
        for ( Student student : students )
        {
            System.out.println( student );
        }

    }

}
