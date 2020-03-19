package org.generation.jwt.service;

import org.generation.jwt.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    private final Map<String, Student> studentList = new HashMap<>();

    public StudentServiceImpl()
    {
        studentList.put( "JD01", new Student( "JD01", "John Doe",
                "john.doe@university.com" ) );
        studentList.put( "TM02", new Student( "TM02", "Ted Mosby",
                "ted.mosby@mail.com") );
    }

    @Override
    public List<Student> all()
    {
        return new ArrayList<>( studentList.values() );
    }

    @Override
    public Student save( Student student )
    {
        return studentList.put( student.getId(), student );
    }

    public void delete(String studentId) {
        studentList.remove(studentId);
    }

}
