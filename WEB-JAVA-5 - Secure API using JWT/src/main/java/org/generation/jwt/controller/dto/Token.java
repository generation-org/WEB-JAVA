package org.generation.jwt.controller.dto;

public class Token
{

    private final String accessToken;

    public Token( String accessToken )
    {
        this.accessToken = accessToken;
    }

    public String getAccessToken()
    {
        return accessToken;
    }
}
