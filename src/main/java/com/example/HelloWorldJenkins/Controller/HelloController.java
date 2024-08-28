package com.example.HelloWorldJenkins.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    static  int i =0;
    @GetMapping("/hello")
    public static String hello(){

        return "hello world from jenkins";
    }
}
