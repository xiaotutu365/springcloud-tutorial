package com.trey.springcloud.bus.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/bus/config")
public class ConfigController {

    @Autowired
    private Environment env;

    @GetMapping("/getConfigFromConfigCenter")
    public String getConfigFromConfigCenter() {
        String username = env.getProperty("jdbc.username", "undefined");
        return username;
    }
}