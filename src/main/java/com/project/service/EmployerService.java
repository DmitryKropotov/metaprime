package com.project.service;

import com.project.model.Employer;

import java.util.Optional;

public interface EmployerService {

    Employer save(Employer employer);

    Optional<Employer> findById(int id);

    void deleteById(int id);
}
