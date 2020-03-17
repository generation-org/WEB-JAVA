package org.generation.jwt.controller.dto;

public class LoginDto
{

    private final String username;

    private final String password;

    public LoginDto( String username, String password )
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }
}
