package com.stainlessray.assignment.bootstrap;

import com.stainlessray.assignment.domain.Employee;
import com.stainlessray.assignment.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final EmployeesRepository employeesRepository;

    @Autowired
    public BootstrapData(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee("Celita", "Cherry");
        employeesRepository.save(employee);
    }
}
