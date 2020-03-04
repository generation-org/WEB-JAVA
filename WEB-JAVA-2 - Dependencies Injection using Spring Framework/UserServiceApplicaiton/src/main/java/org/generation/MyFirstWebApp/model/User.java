package org.generation.MyFirstWebApp.model;

public class User
{
    private final int id;

    private final String name;

    private final String lastName;

    public User( int id, String name, String lastName )
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getLastName()
    {
        return lastName;
    }
}
