package com.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import com.interfaces.models.Student;

public class StudentSorting {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(10, "Kate"));
		studentList.add(new Student(1, "John"));
		studentList.add(new Student(17, "Steve"));
		studentList.add(new Student(5, "Stephen"));
		//Collections.sort(studentList, (s1 , s2) -> (s1. > s2) ? -1 : (s1 < s2) ? 1 : 0);
		System.out.println("After Custom Sorting(Reverse) = " + studentList);

	}
}
