package com.stainlessray.assignment.repositories;

import com.stainlessray.assignment.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employee, Long> {

}
