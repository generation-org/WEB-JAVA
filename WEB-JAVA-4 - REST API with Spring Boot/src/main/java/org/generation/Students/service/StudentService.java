package org.generation.Students.service;

import org.generation.Students.data.entity.Student;

public interface StudentService
{

    Iterable<Student> all();

    Student get( int studentId );

    void save( Student student );

    void delete( int studentId );
}
