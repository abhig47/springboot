package com.example.springboot.services;

import com.example.springboot.model.Address;
import com.example.springboot.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    Employee createEmployee(Employee employee);
}
