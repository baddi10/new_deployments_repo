package com.example.newjars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@SpringBootApplication
@Controller
public class New {
    public static void main(String[] args) {

        //SpringApplication.run(NewjarsApplication.class, args);
    }

    @GetMapping("/")
    public String indexs() {
        return "indexs"; // maps to src/main/resources/templates/index.html
    }

}
