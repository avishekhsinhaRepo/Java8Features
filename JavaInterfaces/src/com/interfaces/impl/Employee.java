package com.interfaces.impl;

import com.interfaces.Greeting;

public class Employee implements Greeting {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Greeting.message();
		employee.greet();
	}

	@Override
	public void greet() {
		System.out.println("This is from employee clas");
	}

}
