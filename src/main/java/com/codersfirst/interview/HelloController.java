package com.codersfirst.interview;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.cors.CorsConfiguration.ALL;

@RestController
@RequestMapping("/hello")
@CrossOrigin(origins = ALL)
public class HelloController {

    @GetMapping
    public Hello hello() {
        return new Hello("Hello world!");
    }
}
