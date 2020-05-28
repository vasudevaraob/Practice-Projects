package com.corejava;

class Student{
	
	String name;
	int rono;
	
	static String clgName="SVCET";
	
	static {
		
	}
	
	public void getDetails(){
		System.out.println(name);
		System.out.println(rono);
		System.out.println(clgName);
		
	}
	
}

public class AppTest {

	
	public static void main(String[] args) {
		
		int n=10;
		
		if (n==2) {
			
			System.out.println("with in if");
		} else
			if (n==10) {
				System.out.println("2nd if in if");
			}
			
		System.out.println("out side in if");
		
	}

}
