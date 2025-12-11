package com.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String getResponse(){
        System.out.println("some changes to go");
        return "Hey there";
    }


    @GetMapping("/hello")
    public String getSecondResponse(){
        return "Hello";
    }


}
