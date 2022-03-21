package com.globant.academy.java.jdbc.exercise.repositories;

import com.globant.academy.java.jdbc.exercise.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
