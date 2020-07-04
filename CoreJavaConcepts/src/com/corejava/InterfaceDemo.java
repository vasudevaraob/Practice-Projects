package com.corejava;

interface Drawable {

	// abstract method
	void draw();

	// default method
	
	/*
	 * 
	 * 
	 * 
	 */
	default void msg() {
		System.out.println("default method");
	}

	// Static methods

	static void msg2() {
		System.out.println("Static Method");
	}
}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");

		Drawable.msg2();
	}
}

public class InterfaceDemo {

	public static void main(String args[]) {
		Drawable s = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Annonmus class");
			}
		};
		Drawable d = new Rectangle() {
			void drawa() {
				System.out.println("Am annnmus class");
			}
		};
		d.draw();
		d.msg();
	}
}
