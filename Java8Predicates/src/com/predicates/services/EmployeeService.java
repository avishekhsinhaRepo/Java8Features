package com.predicates.services;

import java.util.ArrayList;
import java.util.List;

import com.predicates.model.Employee;

public class EmployeeService {

	public List<Employee> createEmployee() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("John", "Denver", 30000, "IT"));
		employeeList.add(new Employee("Heidi", "Delhi", 20000, "Support"));
		employeeList.add(new Employee("Rob", "Tokyo", 10000, "Account"));
		employeeList.add(new Employee("Steve", "New York", 40000, "Sales"));
		employeeList.add(new Employee("Albert", "New Jersey", 50000, "Manager"));
		employeeList.add(new Employee("Robert", "Bangalore", 50000, "Manager"));
		employeeList.add(new Employee("Joseph", "Bangalore", 50000, "Manager"));
		return employeeList;
	}
}
