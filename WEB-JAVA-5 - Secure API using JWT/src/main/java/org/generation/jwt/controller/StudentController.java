package org.generation.jwt.controller;


import org.generation.jwt.model.Student;
import org.generation.jwt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{

    private final StudentService studentService;

    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;
    }

    @CrossOrigin( "*" )
    @GetMapping( "/api/students" )
    public List<Student> all()
    {
        return studentService.all();
    }

    @PostMapping( "/api/students" )
    public Student save( @RequestBody Student student ){
        return studentService.save(student);
    }

    @DeleteMapping( "/api/students/{studentId}" )
    public void delete( @PathVariable String studentId ){
        studentService.delete(studentId);
    }
}
