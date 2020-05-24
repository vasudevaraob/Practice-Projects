package com.corejava;

class Calc{
	
	int num1;
	int num2;
	int result;
	
	public void perform(){
		result = num1 + num2;	
		System.out.println("Sum of num1 and num2  "+result);
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc obj1= new Calc();
		
		obj1.num1=3;
		obj1.num2=5;
		
		obj1.perform();

	}

}
