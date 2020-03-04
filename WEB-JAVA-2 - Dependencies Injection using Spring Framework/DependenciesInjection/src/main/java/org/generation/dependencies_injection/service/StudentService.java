package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;

import java.util.List;

public interface StudentService
{
    void add( Student student );

    void delete( Student student );

    List<Student> all();

    Student findById( String id );

}
