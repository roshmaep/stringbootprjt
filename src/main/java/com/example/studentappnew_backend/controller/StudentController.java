package com.example.studentappnew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to my website";
    }

    @GetMapping("/contact")
    public String Contactpage(){
        return "welcome to contact page";
    }
    @GetMapping("/gallery")
    public String Gallerypage(){
        return "welcome to gallery page";
    }
    @GetMapping("/home")
    public String Home(){
        return "welcome to home page";
    }
}
