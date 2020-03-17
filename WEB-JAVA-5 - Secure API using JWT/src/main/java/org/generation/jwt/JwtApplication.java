package org.generation.jwt;

import org.generation.jwt.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JwtApplication
{

    public static void main( String[] args )
    {
        SpringApplication.run( JwtApplication.class, args );
    }

    @Bean
    public FilterRegistrationBean<JwtFilter> jwtFilter()
    {
        FilterRegistrationBean<JwtFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter( new JwtFilter() );
        registrationBean.addUrlPatterns( "/api/*" );
        return registrationBean;
    }

}
