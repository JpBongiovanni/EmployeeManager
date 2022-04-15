package com.bongo.employeemanager2.model;

//helps transforms java class into different types of streams;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//Entity: Makes sure that this class is mapped to any database we use
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Task {
	@Id //gives a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // tells Java how to generate the Id value.
	@Column(nullable = false, updatable = false)//makes it so that the ID cannot be changed or updated
	private Long id;
	private String name;
	@OneToMany(targetEntity = Employee.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_fk", referencedColumnName = "id")
	private List<Employee> employees;
	
	
	public Task() {
		super();
	}


	public Task(String name, List<Employee> employees) {
		super();
		this.name = name;
		this.employees = employees;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}
	
	
	
	
	
	
	
	
	
}

