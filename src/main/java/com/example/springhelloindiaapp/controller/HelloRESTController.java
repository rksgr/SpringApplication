package com.example.springhelloindiaapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
@RestController
public class HelloRESTController {

    @RequestMapping(value={"","/","/home"})
    public String sayHello(){
        return "Hello to Indians!";
    }
}
