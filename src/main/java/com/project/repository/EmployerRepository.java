package com.project.repository;

import com.project.model.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EmployerRepository implements CrudRepository<Employer, Integer> {

    @Override
    public Employer save(Employer employer) {
        return null;
    }

    @Override
    public <S extends Employer> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    public Optional<Employer> findById(Integer integer) {
        return Optional.empty();
    }

    public boolean existsById(Integer integer) {
        return false;
    }

    public Iterable<Employer> findAll() {
        return null;
    }

    public Iterable<Employer> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void deleteById(Integer integer) {

    }

    public void delete(Employer employer) {

    }

    public void deleteAll(Iterable<? extends Employer> iterable) {

    }

    public void deleteAll() {

    }
}
