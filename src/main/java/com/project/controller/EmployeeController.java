package com.project.controller;

import com.project.model.Employee;

import java.util.Optional;

public interface EmployeeController {

    Employee save(Employee employee);

    Optional<Employee> findById(int id);

    void deleteById(int id);
}
