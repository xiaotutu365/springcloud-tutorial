package com.trey.springcloud.bus.configcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudBusConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudBusConfigCenterApplication.class, args);
    }
}