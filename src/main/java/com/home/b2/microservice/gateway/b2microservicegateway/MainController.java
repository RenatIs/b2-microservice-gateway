package com.home.b2.microservice.gateway.b2microservicegateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class MainController {

    @GetMapping("/api")
    public String hello() {
        return "Hello from Gateway. Current time: " + Instant.now();
    }
}
