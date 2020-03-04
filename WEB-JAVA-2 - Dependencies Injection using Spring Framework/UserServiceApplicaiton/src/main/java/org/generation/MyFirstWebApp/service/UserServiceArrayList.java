package org.generation.MyFirstWebApp.service;

import org.generation.MyFirstWebApp.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceArrayList
    implements UserService
{

    private final List<User> userList = new ArrayList<>();

    public UserServiceArrayList()
    {

    }

    @Override
    public List<User> getAll()
    {
        return userList;
    }

    @Override
    public void add( User user )
    {
        userList.add( user );
    }

    @Override
    public void remove( User user )
    {
        userList.remove( user );
    }

    @Override
    public int size()
    {
        return userList.size();
    }

    @Override
    public User getUser( int position )
    {
        return userList.get( position );
    }
}
