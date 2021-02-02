package com.stainlessray.assignment.controllers;

import com.stainlessray.assignment.domain.Employee;
import com.stainlessray.assignment.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {
    private final EmployeesRepository employeesRepository;

    @Autowired
    public EmployeesController(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @RequestMapping("/employees")
    public Employee getEmployees() {

            return employeesRepository.findById(1l).get();


    }
}
