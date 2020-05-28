package com.corejava;

/*
 * 
 * IS-A Relation Ship
 * HAS-A Relation Ship 
 * 
 */

class Calculator{
	
	public int add(int i,int j) {
		
		return i+j;
	}
	
}

class CalAdv extends Calculator{
	
	public int sub(int i, int j) {
		
		return i-j;
		
	}
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
		CalAdv obj = new CalAdv();
		
		System.out.println(obj.add(6, 5));
		System.out.println(obj.sub(9, 2));

	}

}
