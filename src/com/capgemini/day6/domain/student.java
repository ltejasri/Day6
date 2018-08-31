package com.capgemini.day6.domain;

public class student implements Comparable<student>{

	private String studentName;
	private int studentRollNumber;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String studentName, int studentRollNumber) {
		super();
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	@Override
	public int compareTo(student student) {
				int result = this.studentName.compareTo(student.studentName);
				if(result == 0)
					return Integer.compare(this.getStudentRollNumber(),student.getStudentRollNumber());
				return result;

	}
	@Override
	public String toString() {
		return studentName;
	}
	
}