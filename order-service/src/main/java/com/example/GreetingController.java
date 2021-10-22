package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${greeting.message:Hello}")
    private String message;

    @Value("${greeting.secret:Unknown}")
    private String secret;

    @Autowired
    private Config config;

    @GetMapping("/message")
    public String hello() {
        return config.getMessage();
    }

    @GetMapping("/secret")
    public String getSecret() {
        return secret;
    }
}
