package com.plursight.spring_web_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebAppApplication.class, args);
    }

}
