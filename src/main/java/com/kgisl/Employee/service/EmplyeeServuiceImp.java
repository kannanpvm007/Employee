package com.kgisl.Employee.service;

import java.util.List;

import com.kgisl.Employee.model.Employee;
import com.kgisl.Employee.repository.EmplyeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * EmplyeeServuiceImp
 */
@Service
public class EmplyeeServuiceImp implements EmployeeService {

    @Autowired
    private EmplyeeRepository emplyeeRepository;

    @Override
	public List<Employee> getEmployee() {

        
        
        System.out.println(emplyeeRepository.findAll());
        return emplyeeRepository.findAll();
	}
    

}