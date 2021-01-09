package com.orco.springdemo.controllers;

import com.orco.springdemo.model.ShippingAddress;
import com.orco.springdemo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping("/")
    public User getUser() {
        return User.builder()
                .firstName("Doga").lastName("Tuna").email("doga.tunt@test.com").build();
    }

    @GetMapping("/sa")
    public ShippingAddress getShippingAddress() {
        ShippingAddress sa = new ShippingAddress();
        sa.setPostalCode("34000");
        return sa;
    }
}
