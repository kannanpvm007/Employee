package com.kgisl.Employee.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.kgisl.Employee.model.Employee;  
import com.kgisl.Employee.service.EmployeeService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {
   
    @Mock
    EmployeeService employeeService;
    @InjectMocks
    EmployeeController employeeController;
    List<Employee> expected;
    Employee Employee1= new EmployeeBuilder().id(4).name("test class name1 ").build();
    Employee Employee2= new EmployeeBuilder().id(5).name("test class name 2").build();
    @Test
    public void getallemployeesTest(){
       expected=Arrays.asList(Employee1,Employee2);
       when(employeeService.getEmployee()).thenReturn(expected);
       List <Employee> actual=employeeController.getallemployees();
       assertEquals(expected, actual);


    }
    

    


    
}