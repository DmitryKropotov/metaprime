package com.project.service;

import com.project.model.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployerServiceImpl implements EmployerService {

    @Autowired
    private CrudRepository<Employer, Integer> employerRepository;

    @Override
    public Employer save(Employer employer) {
          return employerRepository.save(employer);
    }

    @Override
    public Optional<Employer> findById(int id) {
        return employerRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
         employerRepository.deleteById(id);
    }


}
