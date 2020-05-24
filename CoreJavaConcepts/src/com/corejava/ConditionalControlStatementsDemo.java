package com.corejava;

/*
 * if else
 * switch
 * 
 */

public class ConditionalControlStatementsDemo {

	public static void main(String[] args) {
		
		int n = 7;
		
		/*if (n%2==0) {
			System.out.println("Hai");
		} else {
			System.out.println("Bye");
		}*/
		
		if (n==0) {
			System.out.println("Nothing to say");
		} else 
			if (n%2==0) {
			 System.out.println("Even");
		  } else {
			  System.out.println("Odd");
		}
/*
 * ternary Operator
 * ?: -> condition ? expression1:expression2		
 */
		int i = 5;
		int j = 0;
		j= i>6?10:9;
		System.out.println(j);
		
		/*
		 * 
		 * Switch
		 * supports for Int and string char
		 * 
		 */
		
	int	a=4;
	switch (a) {
	case 1: System.out.println("One");
	case 2: System.out.println("Two");
	case 3: System.out.println("Three");
	case 4: System.out.println("Four");
		
		break;

	default:
		break;
	}
	
		
	}

}
