package com.example.springboot.services;

import com.example.springboot.model.Customer;
import com.example.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerImp implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {

        return customerRepository.save(customer);
    }
}
