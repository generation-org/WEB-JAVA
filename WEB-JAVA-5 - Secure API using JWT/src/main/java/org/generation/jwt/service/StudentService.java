package org.generation.jwt.service;

import org.generation.jwt.model.Student;

import java.util.List;

public interface StudentService
{

    List<Student> all();

    Student save(Student student);

    void delete(String studentId);

}