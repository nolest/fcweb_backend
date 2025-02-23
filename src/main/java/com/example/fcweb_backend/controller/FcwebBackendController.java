package com.example.fcweb_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FcwebBackendController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from fcweb_backend!";
    }
}