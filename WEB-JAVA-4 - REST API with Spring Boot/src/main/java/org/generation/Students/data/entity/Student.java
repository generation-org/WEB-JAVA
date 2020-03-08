package org.generation.Students.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity( name = "Students" )
public class Student
{

    @Id
    @GeneratedValue
    @Column( name = "idStudents" )
    private int id;

    private String name;

    private String email;

    private String address;

    @Column( name = "birth_date" )
    private Date birthDate;


    public Student()
    {
    }

    public Student( String name, String email, Date birthDate )
    {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString()
    {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\''
            + ", address='" + address + '\'' + ", birthDate=" + birthDate + '}';
    }
}
