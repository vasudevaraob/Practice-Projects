package com.corejava;

class Emp {

	int eid;
	int salary;
	static String ceo = "Ram"; // that will create class loading time
	
	static {
		
		System.out.println("In static block");
		
	}

	public Emp() {
		
		eid=10;
		salary=1500;  // it will create object creation time
		
		System.out.println("In constructor block");
		
	}

	public void show() {
		System.out.println(eid + ":" + salary + ":" + ceo + ":");
	}

}

public class StaticDemo {

	public static void main(String[] args) {

		Emp navin = new Emp();
		navin.eid = 1;
		navin.salary = 400;

		Emp vasu = new Emp();

		vasu.eid = 2;
		vasu.salary = 500;

		navin.show();
		vasu.show();

	}

}
