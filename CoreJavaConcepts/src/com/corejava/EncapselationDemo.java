
//Encapsulation = binding the data with methods

package com.corejava;

class Student1{
	
	private int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		
		this.roll = roll;
		
		System.out.println("Getting the value :  " +roll);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}


public class EncapselationDemo {

	public static void main(String[] args) {
		
		Student1 s = new Student1();
		
		s.setRoll(2);
		s.setName("hai");
		
		

	}

}
