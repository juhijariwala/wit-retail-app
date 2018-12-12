package com.wit.customer.controller;

import com.wit.customer.model.Customer;
import com.wit.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("{id}")
    public ResponseEntity doGet(@PathVariable long id) {
        return ResponseEntity.ok().body(service.get(id));
    }

    @PostMapping("create")
    public ResponseEntity doCreate(@ModelAttribute Customer customer) {
        return ResponseEntity.ok().body(service.create(customer));
    }

    @PutMapping("{id}")
    public ResponseEntity doUpdate(@ModelAttribute Customer customer) {
        return ResponseEntity.ok().body(service.update(customer));
    }

    @DeleteMapping("{id}")
    public ResponseEntity doDelete(@PathVariable long id) {
        return ResponseEntity.ok().body(service.delete(id));
    }

}