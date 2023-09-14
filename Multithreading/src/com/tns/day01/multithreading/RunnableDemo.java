package com.tns.day01.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new UsingRunnable(30,20,"Hello");
		Thread t1= new Thread(new UsingRunnable(30,20,"Hello from thread"));
		t1.start();
		
			
		

	}

}
