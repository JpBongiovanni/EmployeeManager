package com.bongo.employeemanager2.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bongo.employeemanager2.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	void deleteEmployeeById(Long id);

	Optional <Employee> findEmployeeById(Long id);
	
}
