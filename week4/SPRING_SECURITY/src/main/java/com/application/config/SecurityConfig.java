package com.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.core.userdetails.User;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("$2a$10$iYNBkw5WL0yb2A6aZsCnn.gxXTJonNzLQL83o.0vSPLasiD8FQOMu")
                .roles("USER")
                .build();

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("$2a$10$8Y50bu6ZbBO2K6LGbZSpauyGitYeRyTFkyT4FOthUuCnAul6RPrk.")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    @Configuration
    public static class ApiSecurityConfig extends WebSecurityConfiguration {

        protected void configure(HttpSecurity http) throws Exception {
            http
                .authorizeRequests()
                    .requestMatchers("/api/public/**").permitAll()
                    .requestMatchers("/api/private/**").authenticated()
                .and()
                    .httpBasic();
        }
    }
}
