package com.cg.hierachical;

public class HierarchicalInheritanceDemo {
	

		public static void main(String[] args) {

			Person p=new Person(); //tight coupling
			System.out.println("Person class details...");
			System.out.println(p);
			
			
			//dynamic binding//runtime polymorphism//loose coupling
			Person p1;  //object reference
			p1=new Person("Pushpa D C","DVG",21);
			if(p1 instanceof Person)
			{System.out.println(p1);}
			
			p1=new Employee("Shoheb","South Mumbai",22,100,"TNS","Developer",50000);
			if(p1 instanceof Employee)
			System.out.println(p1);
			
			p1=new Student("Anu","Banglore",21,007,"IT","XYZ");
			if(p1 instanceof Student)
			System.out.println(p1);
			
			


		}

	}
