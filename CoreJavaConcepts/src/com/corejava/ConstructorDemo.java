package com.corejava;

class Cal {

	int num1;
	int num2;
	int result;

	public Cal() {

		num1 = 5;
		num2 = 10;
	}

	public Cal(int n) {
		
		num1 = n;
		num2 = n;

	}

}

public class ConstructorDemo {

	public static void main(String[] args) {

		Cal obj1 = new Cal();
		Cal obj2 = new Cal(7);
		
		System.out.println("Parameter Constrector ---->"  +obj2.num1);
		System.out.println("Zero Parameter Constrector ---->"  +obj1.num1);

	}

}
