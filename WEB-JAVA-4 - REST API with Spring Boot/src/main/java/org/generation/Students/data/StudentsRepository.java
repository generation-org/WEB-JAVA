package org.generation.Students.data;

import org.generation.Students.data.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository
    extends CrudRepository<Student, Integer>
{

    Student findById( int id );

}
