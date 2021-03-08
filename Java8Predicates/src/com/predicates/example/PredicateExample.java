package com.predicates.example;

import java.util.List;
import java.util.function.Predicate;

import com.predicates.model.Employee;
import com.predicates.services.EmployeeService;

public class PredicateExample {

	public static void main(String[] args) {
		PredicateExample predicateExample = new PredicateExample();
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employeeList = employeeService.createEmployee();
		Predicate<Employee> managerPredicate = emp -> emp.getDesignation().equals("Manager");
		Predicate<Employee> locationPredicate = emp -> emp.getLocation().equals("Bangalore");
		Predicate<Employee> salaryPredicate = emp -> emp.getSalary() < 20000;
		/* Print the employee who are Manager */
		predicateExample.printEmployee(employeeList, managerPredicate);
		/* Print the employee whose location is Bangalore */
		predicateExample.printEmployee(employeeList, locationPredicate);
		/* Print the employee whose salary is less than 20000 */
		predicateExample.printEmployee(employeeList, salaryPredicate);
		/* Print the employee who are manager and location is Bangalore */
		predicateExample.printEmployee(employeeList, managerPredicate.and(locationPredicate));
		/* Print the employee who are manager or salary less than 20000 */
		predicateExample.printEmployee(employeeList, managerPredicate.or(salaryPredicate));
		/* Print the employee who are not managers */
		predicateExample.printEmployee(employeeList, managerPredicate.negate());
	}

	public void printEmployee(List<Employee> employees, Predicate<Employee> predicate) {
		for (Employee employee : employees) {
			if (predicate.test(employee)) {
				System.out.println(employee);
			}
		}
	}
}
