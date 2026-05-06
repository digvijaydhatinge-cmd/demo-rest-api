package com.example.Demos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello dd! Spring Boot is working 🚀";
    }

    @GetMapping("/api")
    public String api() {
        return "This is simple REST API";
    }
}
