package com.example.springboot.services;

import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}