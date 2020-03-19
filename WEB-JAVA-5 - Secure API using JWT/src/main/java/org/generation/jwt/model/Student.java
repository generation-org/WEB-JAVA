package org.generation.jwt.model;

public class Student {
    final String id;

    final String name;

    final String email;

    public Student( String id, String name, String email )
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    @Override
    public String toString()
    {
        return "Course{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + '}';
    }
}
