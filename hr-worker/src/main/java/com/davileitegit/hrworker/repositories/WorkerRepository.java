package com.davileitegit.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davileitegit.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
