package com.corejava;

/*
 * for loop
 * wile loop
 * do while loop
 * for each loop
 * 
 */
public class IterationStatementsDemo {

	public static void main(String[] args) {

		int i = 1;
		/*
		 * when don't know number of iteration/ if user says exit
		 * 
		 */

		while (i < 10) {
			System.out.println("Wile Loop");
			i++;
		}

		/*
		 * for loop what ever done in while keeping in single line when know starting
		 * point and ending point
		 * 
		 */

		for (int k = 0; k < 7; k++) {

			System.out.println("this is for loop");

		}

		/*
		 * do while when i want to execute statement 1 go for o while
		 * 
		 */
		int j = 3;
		do {
			System.out.println("Do while");
			j++;
		} while (j <= 5);
		

		/*
		 * 
		 * Nested loops for logical patterns
		 * 
		 */

		for (int j3 = 0; j3 < 4; j3++) {

			for (int j2 = 0; j2 < 4; j2++) {

				System.out.print("* ");
			}
			System.out.println(" ");

		}

	}

}
