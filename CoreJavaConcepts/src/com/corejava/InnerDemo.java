package com.corejava;

/*
 * Inner Classes
 * 		Member class - with out static key wor
 * 	    Static class -
 *      Anonymous class
 */

class Outer{
	
	static int a;
	
	static public void show(){
		
	}
	
	/*
	 * member class
	 * 
	 */
	
	static class Inner{  //Outer$Inner
		
		public void display(){
			
			System.out.println("In Display");
		}
		
	}
	
}

public class InnerDemo {
	
	//variables
	//methods
	
	public static void main(String[] args) {
		
		Outer obj = new Outer();
		
		obj.show();
		
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}	
	
}
