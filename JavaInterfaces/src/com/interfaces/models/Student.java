package com.interfaces.models;

public class Student {
	private int studentId;
	private String studentName;			

	@Override
	public boolean equals(Object object) {
		Student student  = (Student)object;
		return this.studentId == student.getStudentId() && 
				this.studentName.equals(student.getStudentName());
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}
