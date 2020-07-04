package com.corejava.excep;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int i = 100 / 0;
			System.out.println("-----" + i);
		} catch (ArithmeticException e) {
			// TODO: handle exception

			System.out.println(e);
		}
	}

}

/*
 * throw key word is use to throw custom exceptions
 * 
 */

class TestThrow1 {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		validate(13);
		System.out.println("rest of the code...");
	}
}