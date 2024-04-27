package com.qaguru.training;


public class Student {

	// Instance variables within the class and outside of any method, constructor  or block
	String name;
	String studentId;
	Integer grade;
	
	// Default constructor without arguments
	public Student() {
		
	}
	// constructor with arguments 
	
	public Student(String nm, String studId, Integer grd) {
		this.name = nm;
		this.studentId = studId;
		this.grade = grd;
		
	}
	//object instance method
	public void displayStudentInfo() {
		System.out.println("Name:"+ this.name +" " + "StudentId:" + " "+ this.studentId +  "Grade:" + " "+ this.grade);
		
	}
	
	// Main method
	
	public static void main(String[] args) {
		
	// creating class instance (object) using the new keyword using default constructor
	Student obj1 = new Student(); 
	obj1.name= "Sam";
	obj1.studentId= "A1234";
	obj1.grade = 9;
	
	obj1.displayStudentInfo();

	Student obj2 = new Student();
	obj2.name= "Abby";
	obj2.studentId= "A2345";
	obj2.grade = 8;
	obj2.displayStudentInfo();
	
	//creating class instance (object) using the new keyword  using argument constructor
	Student obj3 = new Student("Shreeya","B1234",12);
	obj3.displayStudentInfo();
	
	Student obj4 = new Student("Shaurya","C1234",9);
	obj4.displayStudentInfo();
	
	
	System.out.println(obj1.name+ " " + obj1.studentId+ " " + obj1.grade);
	System.out.println(obj2.name+ " " + obj2.studentId+ " " + obj2.grade);
	}

}
