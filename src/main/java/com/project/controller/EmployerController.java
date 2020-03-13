package com.project.controller;

import com.project.model.Employer;

import java.util.Optional;

public interface EmployerController {

    Employer save(Employer employer);

    Optional<Employer> findById(int id);

    void deleteById(int id);
}
