package com.plursight.spring_web_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(Map<String, Object> model) {
        model.put("message", "Spring web application with jsp");
        return "greeting"; // file name should match in main/webapp/WEB-INF/jsp/greeting.jsp
    }
}