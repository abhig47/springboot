package com.example.springboot.services;

import com.example.springboot.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    Customer createCustomer(Customer customer);

}
