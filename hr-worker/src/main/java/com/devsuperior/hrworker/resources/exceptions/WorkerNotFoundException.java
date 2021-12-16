package com.devsuperior.hrworker.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WorkerNotFoundException extends RuntimeException{
    public WorkerNotFoundException(Long workerId) {
        super("Worker " + workerId + " does not exist");
    }
}
