package com.example.springhelloindiaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHelloIndiaAppApplication {
    /** UC 1: Create a Spring App to display "Hello from India"*/
    public static void main(String[] args) {
        System.out.println("Hello from India!");
        SpringApplication.run(SpringHelloIndiaAppApplication.class, args);
    }
}
