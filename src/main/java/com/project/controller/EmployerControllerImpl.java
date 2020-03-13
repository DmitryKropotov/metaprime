package com.project.controller;

import com.project.model.Employer;
import com.project.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class EmployerControllerImpl implements EmployerController {

    @Autowired
    private EmployerService employerService;

    @Override
    public Employer save(Employer employer) {
        return employerService.save(employer);
    }

    @Override
    public Optional<Employer> findById(int id) {
        return employerService.findById(id);
    }

    @Override
    public void deleteById(int id) {
         employerService.deleteById(id);
    }
}
