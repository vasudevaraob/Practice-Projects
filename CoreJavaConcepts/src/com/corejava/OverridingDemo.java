package com.corejava;

class A1 {
	public void show() {

		System.out.println("in A1");
	}
}

class B1 extends A1 {

	public void show() {
		
		//super.show(); to call parent class method		
		System.out.println("in B1");
	}

}

class C extends A1{
	public void show(){
		
		System.out.println("in C");
	}
	
}

public class OverridingDemo {
	// compile time polymorphism
	
	public static void main(String[] args) {

		//B1 obj= new B1();
		A1 obj= new B1();  // Run time polymorphism
		obj.show();
		
		obj = new C();
		
		obj.show(); // Dynamic method dispatch

	}

}
