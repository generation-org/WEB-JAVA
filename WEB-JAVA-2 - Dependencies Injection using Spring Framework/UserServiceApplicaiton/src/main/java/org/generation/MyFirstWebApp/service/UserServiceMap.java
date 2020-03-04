package org.generation.MyFirstWebApp.service;

import org.generation.MyFirstWebApp.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceMap
    implements UserService
{
    final Map<Integer, User> userMap = new HashMap<>();

    @Override
    public List<User> getAll()
    {
        //TODO implement this method
        return null;
    }

    @Override
    public void add( User user )
    {
        //TODO implement this method
    }

    @Override
    public void remove( User user )
    {
        //TODO implement this method
    }

    @Override
    public int size()
    {
        //TODO implement this method
        return 0;
    }

    @Override
    public User getUser( int position )
    {
        //TODO implement this method
        return null;
    }
}
