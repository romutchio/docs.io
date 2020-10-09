package com._742pm.docs.controllers;

import com._742pm.docs.models.User;
import com._742pm.docs.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<User> findUsers() {

        return userService.findAll();
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        userService.create(user);
    }

}
