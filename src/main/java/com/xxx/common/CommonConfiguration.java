package com.xxx.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {

    @Bean
    public JwtAuthentication jwtAuthentication() {
        return new JwtAuthentication();
    }
}
