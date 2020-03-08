package org.generation.Students.service;

import org.generation.Students.data.StudentsRepository;
import org.generation.Students.data.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceMySQL
    implements StudentService
{

    private final StudentsRepository studentsRepository;

    public StudentServiceMySQL( @Autowired StudentsRepository studentsRepository )
    {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public Iterable<Student> all()
    {
        return studentsRepository.findAll();
    }

    @Override
    public Student get( int studentId )
    {
        return studentsRepository.findById( studentId );
    }

    @Override
    public void save( Student student )
    {
        studentsRepository.save( student );
    }

    @Override
    public void delete( int studentId )
    {
        studentsRepository.deleteById( studentId );
    }
}
