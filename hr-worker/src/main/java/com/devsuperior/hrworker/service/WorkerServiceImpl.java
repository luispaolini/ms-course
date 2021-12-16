package com.devsuperior.hrworker.service;

import com.devsuperior.hrworker.model.Worker;
import com.devsuperior.hrworker.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerRepository repository;


    @Override
    public List<Worker> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Worker> findById(Long id) {
        return repository.findById(id);
    }
}
