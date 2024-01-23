package com.application.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${app.greeting.message}")
    private String greetingMessage;

    public String getGreetingMessage() {
        return greetingMessage;
    }
}