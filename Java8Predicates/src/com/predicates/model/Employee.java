package com.predicates.model;

public class Employee {
	private String name;
	private String location;
	private double salary;
	private String designation;

	public Employee(String name, String location, double salary, String designation) {
		super();
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	
	

}
