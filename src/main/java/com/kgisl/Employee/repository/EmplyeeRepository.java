package com.kgisl.Employee.repository;

import com.kgisl.Employee.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmplyeeRepository
 */
public interface EmplyeeRepository extends JpaRepository<Employee,Integer> {

    
}