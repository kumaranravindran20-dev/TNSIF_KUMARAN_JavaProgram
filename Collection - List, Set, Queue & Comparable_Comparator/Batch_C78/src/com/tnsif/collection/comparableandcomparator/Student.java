package com.tnsif.collection.comparableandcomparator;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;
	private float per;
	
	
	//getter setter method
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	// parameterized constructor
	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}
	
	//non parameterized constructor
	public Student() {
		super();
	}
	
	//toString()
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}
	
	//comparable interface
	public int compareTo(Student  s) {
		return (int) (s.per - this.per); //Desc
			
	}
	
	
	
	
	
}
