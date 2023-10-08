package com.cg.statickeyword;

public class StudentOne {
	
	int id;
	static String college = "BRET";

	static void display() {
		System.out.println(college);
	}

	public static void main(String[] args) {
		StudentOne.display();

	}

}
