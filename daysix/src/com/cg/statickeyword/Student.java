package com.cg.statickeyword;

public class Student {
 
	private int id;
	private String name;
	private static String department = "CSE";
	private static String batchNo = "B70";
	private static String collegeName = "SKSVMACET";
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	static void display() {
		System.out.println( batchNo + " "+ department + " " + collegeName);
		
	}

	
	

}
