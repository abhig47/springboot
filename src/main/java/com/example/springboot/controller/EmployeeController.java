package com.example.springboot.controller;

import com.example.springboot.constant.CONSTANT;
import com.example.springboot.model.Employee;
import com.example.springboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CONSTANT.EMPLOYEE)
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(CONSTANT.CREATEEPLOYEE)
    Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
}
