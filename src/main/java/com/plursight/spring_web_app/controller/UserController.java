package com.plursight.spring_web_app.controller;

import com.plursight.spring_web_app.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
// RestController VS Controller
// RestController return out by default a JSON body
// Controller return out string which is the name of jsp file

    @GetMapping("hello")
    public User getUser() {
        User user = new User();
        user.setId(1234);
        user.setName("Musab");
        return user;
    }
}
