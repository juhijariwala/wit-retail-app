package com.wit.customer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/test")
    public ResponseEntity show() {
        return ResponseEntity.ok().body("Hello");
    }
}
