package com.application.controller;


import com.application.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final AppConfig appConfig;

    @Autowired
    public HelloController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return appConfig.getGreetingMessage();
    }
}
