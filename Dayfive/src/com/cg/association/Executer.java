package com.cg.association;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	  
	 Address a1 = new Address(1,"XYZ","Banglore","Karnataka",560057);
	 Person p1 = new Person("Pushpa", a1);
	 
		
		
	//Person p1 = new Person("Pushpa", new Address(1,"XYZ","Banglore","Karnataka",560057));
	
	p1.display();
	
	}

	
	
}
