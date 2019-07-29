package com.kgisl.Employee.controller;

import java.util.List;

import com.kgisl.Employee.model.Employee;
import com.kgisl.Employee.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeController
 */
@RestController
@RequestMapping("/employeesa")
public class EmployeeController {
    @Autowired
    EmployeeService Employeeservice;
    @GetMapping("/")
    public List<Employee>getallemployees(){
        return Employeeservice.getEmployee();

    }

    
}