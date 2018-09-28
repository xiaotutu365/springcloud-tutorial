package com.trey.springcloud.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus/user")
public class UserController {
    @Autowired
    private Environment env;

    @GetMapping("/getConfigFromConfigCenter")
    public String getConfigFromConfigCenter() {
        String username = env.getProperty("jdbc.username", "undefined");
        return username;
    }
}