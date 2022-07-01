package com.example.springboot.controller;

import com.example.springboot.constant.CONSTANT;
import com.example.springboot.model.Customer;
import com.example.springboot.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(CONSTANT.CUSTOMMER)
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping(CONSTANT.CREATECUSTOMER)
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

}
