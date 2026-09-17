package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello World";
    }


    @GetMapping("/name")
    public String Name(){
        return "<h1>Prem</h1>";
    }
}
