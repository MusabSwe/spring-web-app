package com.plursight.spring_web_app.controller;

import com.plursight.spring_web_app.model.Registration;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
//    @modelAttribute used with form for get and post
    public String getRegistration(@ModelAttribute("registration") Registration registration) {

        return "registration"; // file name in jsp folder
    }

    @PostMapping("/registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("There were errors");
            return "registration";
        }
        System.out.println("Registration: " + registration.getName());
        return "redirect:registration";
    }
}
