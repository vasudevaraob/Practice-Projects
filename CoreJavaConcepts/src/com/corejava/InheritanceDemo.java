package com.corejava;

/*
 * 
 * IS-A Relation Ship
 * HAS-A Relation Ship 
 * 
 */

class Calculator {

	public int add(int i, int j) {

		return i + j;
	}

}

class CalAdv extends Calculator {

	public int sub(int i, int j) {

		return i - j;

	}

}


public class InheritanceDemo {

	public static void main(String[] args) {

		CalAdv obj = new CalAdv();

		System.out.println(obj.add(6, 5));
		System.out.println(obj.sub(9, 2));

	}
	

}

class Operation {
	int square(int n) {
		return n * n;
	}
}

class Circle {
	Operation op;// aggregation
	double pi = 3.14;

	double area(int radius) {
		op = new Operation();
		int rsquare = op.square(radius);// code reusability (i.e. delegates the method call).
		return pi * rsquare;
	}

	public static void main(String args[]) {
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println(result);
	}
}
