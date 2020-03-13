package com.project.service;

import com.project.model.Employee;
import java.util.Optional;

public interface EmployeeService {

    Employee save(Employee employer);

    Optional<Employee> findById(int id);

    void deleteById(int id);
}
