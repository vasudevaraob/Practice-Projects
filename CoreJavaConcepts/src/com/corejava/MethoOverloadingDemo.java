package com.corejava;

class Casio {
	
	int num1;
	int num2;
	String operation;
	
	/**
	 * Constructor Overloading
	 */
	public Casio() {
		num1=0;
		num2=0;
		operation ="Nothing";

	}

	public Casio(int a) {
		num1=0;
		num2=10;
		operation ="Nothing";

	}
	
	public Casio(int a, int b) {
		num1=1;
		num2=3;
		operation ="Nothing";

	}
	
	/**
	 * Method Overloading
	 * 
	 */

	public void add(int i, int j) {
		System.out.println("2 parms  " + (i + j));
	}

	public void add(int i, int j, int k) {
		System.out.println("3 parms  " + (i + j + k));
	}

	public void add(int i, int j, int k, int l) {
		System.out.println("4 parms  " + (i + j + k + l));
	}

}

public class MethoOverloadingDemo {

	public static void main(String[] args) {

		Casio obj1 = new Casio();

		obj1.add(7, 9);
		obj1.add(8, 90, 55);
		obj1.add(2, 3, 6, 5);
	}

}
