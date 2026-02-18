package com.luv2code.springboot.myfirstspringapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultRestController {

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World!";
    }

    @GetMapping("/hi")
    public String HiWorld(){
        return "Hi World!";
    }

    @GetMapping("/workout")
    public String Workout() {
        return "Do Workout!";
    }

}
