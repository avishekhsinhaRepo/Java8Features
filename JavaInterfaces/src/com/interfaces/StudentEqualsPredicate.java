package com.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.interfaces.models.Student;

public class StudentEqualsPredicate {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "John"));
		studentList.add(new Student(2, "Hopkin"));
		studentList.add(new Student(3, "John"));
		Predicate<Student> predicate = Predicate.isEqual(new Student(1, "John"));
		for(Student student : studentList) {
			if(predicate.test(student))
				System.out.println(student);
		}

	}

}
