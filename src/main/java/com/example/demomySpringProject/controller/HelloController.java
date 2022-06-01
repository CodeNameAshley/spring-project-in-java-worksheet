package com.example.demomySpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    String hello = "Hello World!";
    String intro = "My name is Ashley, and this is my first Spring Web App!";
    @GetMapping("/helloworld")
    public String helloWorld() {
        return hello + " " + intro;
    }
}
