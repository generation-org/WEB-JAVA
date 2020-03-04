package org.generation.dependencies_injection.model;

import java.util.Date;

public class Student
{
    private final String idStudent;

    private final int idType;

    private final String name;

    private final String lastName;

    private final int nationality;

    private String address;

    private Date birthDate;

    public Student( String idStudent, int idType, String name, String lastName, int nationality )
    {
        this.idStudent = idStudent;
        this.idType = idType;
        this.name = name;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    public void setAddress( String address )
    {
        this.address = address;
    }

    public void setBirthDate( Date birthDate )
    {
        this.birthDate = birthDate;
    }

    public String getIdStudent()
    {
        return idStudent;
    }

    public int getIdType()
    {
        return idType;
    }

    public String getName()
    {
        return name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getNationality()
    {
        return nationality;
    }

    public String getAddress()
    {
        return address;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }
}
