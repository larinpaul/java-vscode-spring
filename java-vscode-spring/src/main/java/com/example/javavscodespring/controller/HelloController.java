// package com.example.javavscodespring.controller; // I thought this was supposed to be correct, but VsCode complained...
package main.java.com.example.javavscodespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

}
