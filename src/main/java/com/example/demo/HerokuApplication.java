package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HerokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(HerokuApplication.class, args);
    }

}

@RestController
class Heroku{

    @GetMapping("/")
    public String gethome(){
        return "hello world";
    }
}
