package com.bongo.employeemanager2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bongo.employeemanager2.model.Task;
import com.bongo.employeemanager2.repo.TaskRepo;

@Service
public class TaskService {
	private final TaskRepo taskRepo;
	
	@Autowired
	public TaskService(TaskRepo taskRepo) {
		this.taskRepo = taskRepo;
	}
	
	public Task addTask(Task task) {
		return taskRepo.save(task);
	}
}
