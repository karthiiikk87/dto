package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	private double salary;
	private String department;
	
	public EmployeeEntity(){}
	
	public EmployeeEntity(Long id,String name,String email,double salary,String department) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
		this.department=department;
	}
	
	public void setId(Long id) {
	
	this.id=id;
	}
	
	public Long getId(Long id) {
		return id;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

}
