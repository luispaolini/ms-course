package com.devsuperior.hrworker.service;

import com.devsuperior.hrworker.model.Worker;

import java.util.List;
import java.util.Optional;

public interface WorkerService {

    public List<Worker> getAll();

    public Optional<Worker> findById(Long id);
}
