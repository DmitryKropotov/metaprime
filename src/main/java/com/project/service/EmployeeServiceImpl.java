package com.project.service;

import com.project.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    CrudRepository<Employee, Integer> employeeRepository;

    @Override
    public Employee save(Employee employer) {
        return employeeRepository.save(employer);
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
