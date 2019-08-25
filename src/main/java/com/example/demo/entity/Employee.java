package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String salary;
    
    @Version
    private Long version;
    
    
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSalary() {
		return salary;
	}
	public Long getVersion() {
		return version;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "ID> " + id + "---Name> " + name + "---Salary> " + salary + "---Version> " + version;
	}
}
