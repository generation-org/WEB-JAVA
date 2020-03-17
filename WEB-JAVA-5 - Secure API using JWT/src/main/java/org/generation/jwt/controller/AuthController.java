package org.generation.jwt.controller;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.generation.jwt.controller.dto.LoginDto;
import org.generation.jwt.controller.dto.Token;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.util.Calendar;
import java.util.Date;

@RestController
public class AuthController
{

    @PostMapping( "/auth" )
    public Token auth( @RequestBody LoginDto loginDto )
        throws ServletException
    {
        if ( loginDto.getUsername().equals( "user@mail.com" ) && loginDto.getPassword().equals( "password" ) )
        {
            return new Token( generateToken( loginDto.getUsername() ) );
        }
        throw new ServletException( "Invalid login. Please check your email and password." );
    }

    private String generateToken( String email )
    {

        Calendar calendar = Calendar.getInstance();
        calendar.add( Calendar.HOUR, 10 );
        String secret = "this-secret-is-not-very-secret-99";
        return Jwts.builder().setSubject( email ).claim( "role", "user" ).setIssuedAt( new Date() ).setExpiration(
            calendar.getTime() ).signWith( SignatureAlgorithm.HS256, secret ).compact();
    }


}
