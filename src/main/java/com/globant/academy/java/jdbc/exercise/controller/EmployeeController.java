package com.globant.academy.java.jdbc.exercise.controller;

import com.globant.academy.java.jdbc.exercise.entities.Employee;
import com.globant.academy.java.jdbc.exercise.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return employee;
    };

    @GetMapping
    public List<Employee> getEmployees(){
        return (List<Employee>) employeeRepository.findAll();
    };
}
