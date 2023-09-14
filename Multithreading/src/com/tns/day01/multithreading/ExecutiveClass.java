package com.tns.day01.multithreading;

public class ExecutiveClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChildThread t1 = new ChildThread(5,"first Thread");
        ChildThread t2 = new ChildThread(10,"secondn Thread");
        
        t1.start();
       // t1.start();
        t2.start();
	
	}

}
