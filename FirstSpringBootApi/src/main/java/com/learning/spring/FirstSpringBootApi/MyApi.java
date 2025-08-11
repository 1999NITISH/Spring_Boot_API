package com.learning.spring.FirstSpringBootApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class MyApi {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Nitish";
    }
//    @GetMapping("/Bye")
//    public String Bye(){
//        return "Bye Everyone";
//    }
}
