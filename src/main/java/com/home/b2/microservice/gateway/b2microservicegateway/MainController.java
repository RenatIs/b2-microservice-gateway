package com.home.b2.microservice.gateway.b2microservicegateway;

import io.restassured.RestAssured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Gateway. Current time: " + Instant.now();
    }

    @GetMapping("/booking")
    public String getBookingService() {
        return RestAssured.given()
                .baseUri("net-service-booking-service")
                .log().all()
                .get("/health").asString();
    }

    @GetMapping("/booking-bs")
    public String getBookingServiceWithBS() {
        return RestAssured.given()
                .baseUri("net-service-booking-service/bs")
                .log().all()
                .get("/health").asString();
    }
}
