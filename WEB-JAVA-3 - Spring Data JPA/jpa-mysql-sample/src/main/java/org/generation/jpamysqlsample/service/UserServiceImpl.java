package org.generation.jpamysqlsample.service;

import org.generation.jpamysqlsample.model.User;
import org.generation.jpamysqlsample.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImpl
    implements UserService
{

    private final UserRepository userRepository;

    public UserServiceImpl( UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser( String id )
    {
        Optional<User> user = userRepository.findById( id );
        return user.orElse( null );
    }

    @Override
    public User save( User user )
    {
        return userRepository.save( user );
    }

    @Override
    public void delete( String id )
    {
        userRepository.deleteById( id );
    }

}
