package com.devesuperior.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
