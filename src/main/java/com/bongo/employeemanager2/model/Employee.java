package com.bongo.employeemanager2.model;

//helps transforms java class into different types of streams;
import java.io.Serializable;

import javax.persistence.Column;
//Entity: Makes sure that this class is mapped to any database we use
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
	@Id //gives a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // tells Java how to generate the Id value.
	@Column(nullable = false, updatable = false)//makes it so that the ID cannot be changed or updated
	private Long id;
	private String name;
	private String email;
	private String jobTitle;
	private String phone;
	private String imageUrl;
	@Column(nullable = false, updatable = false)
	private String employeeCode;
	
	//no args constructor
	public Employee() {
		super();
	}
	
	// constructor minus the ID field as java will generate that for us on construction
	public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
		super();
		this.name = name;
		this.email = email;
		this.jobTitle = jobTitle;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
	}
	
	//Getters and Setters
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobTitle=" + jobTitle + ", phone="
				+ phone + ", imageUrl=" + imageUrl + ", employeeCode=" + employeeCode + "]";
	}
	
	
	
	
	
	
	
}

