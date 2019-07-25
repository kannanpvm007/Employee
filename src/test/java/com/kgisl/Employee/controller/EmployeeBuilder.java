package com.kgisl.Employee.controller;

import com.kgisl.Employee.model.Employee;

/**
 * EmployeeBuilder
 */
public class EmployeeBuilder {
    Employee employee = new Employee();
    public EmployeeBuilder id(Integer id){
        
        employee.setId(id);
        return this;

    }
    public EmployeeBuilder name(String name){
        employee.setName(name);
        return this;
    }
     public Employee Build(){
         return this.employee;
     }
    public Employee build(){
        return null;
    }
}