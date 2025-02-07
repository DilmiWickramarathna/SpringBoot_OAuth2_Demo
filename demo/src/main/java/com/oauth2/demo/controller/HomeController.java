package com.oauth2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "Hello, Welcome to Home!";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Hello, You are Secured!";
    }
}
