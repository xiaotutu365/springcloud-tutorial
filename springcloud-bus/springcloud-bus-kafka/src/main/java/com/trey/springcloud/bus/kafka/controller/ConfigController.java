package com.trey.springcloud.bus.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus/config")
public class ConfigController {

    @Autowired
    private Environment env;

    @GetMapping("/getConfigFromConfigCenter")
    public String getConfigFromConfigCenter() {
        env.getProperty("jdbc.username")
        return "";
    }
}