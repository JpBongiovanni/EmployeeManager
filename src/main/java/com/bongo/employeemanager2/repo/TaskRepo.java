package com.bongo.employeemanager2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bongo.employeemanager2.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long>{
	
}
