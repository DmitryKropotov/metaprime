package com.project.controller;

import com.project.model.Employee;
import com.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class EmployeeControllerImpl implements EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public Employee save(Employee employee) {
        return employeeService.save(employee);
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeService.findById(id);
    }

    @Override
    public void deleteById(int id) {
        employeeService.findById(id);
    }
}
