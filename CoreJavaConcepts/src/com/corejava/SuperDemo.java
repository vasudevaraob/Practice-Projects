package com.corejava;

class A{
	
	public A() {
		
		System.out.println("in A ");
	}
	
	public A(int i) {
		 
		System.out.println("in A int");
		
	}
	
}

class B extends A{
	
	
	/*
	 * by default super() will be available and it will call the super class default constrector 
	 * 
	 */
	public B(){
		
		super();   // that ill available by default
		
		System.out.println("in B ");
	}
	
	public B(int i) {
		
		super(i); //by default that will call default constructor  but for to call parameter e need to use this 
		 
		System.out.println("in B int");
		
	}
}


public class SuperDemo {

	public static void main(String[] args) {
		/*
		 * by default execute thhe both constrector
		 * 
		 */
		B obj = new B();
		B obj1 = new B(5);
		
		
	}

}
