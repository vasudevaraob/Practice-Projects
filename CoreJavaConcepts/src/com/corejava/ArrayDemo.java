package com.corejava;

public class ArrayDemo {

	public static void main(String[] args) {

		int [] a = {10,20,30,40,50,60,70,80,90};
		
		int [][] b = {{1,2,3},
				      {4,5,6},
				      {7,8,9}};
		
		int [][] c = {{1,2,3,4},
					  {4,5,6},
					  {7,8,9,1,2,3}};
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
		/*
		 * 
		 * Single Dimensional Array
		 * 
		 */
		
		for (int i : a) {
			
			System.out.println("for each loop for     "+i);
		}
		
		
		/*
		 * 
		 * Multidimensional Array
		 * 
		 */
		
		
		
		for (int j = 0; j < 3; j++) {//-----> Row
			
			for (int k = 0; k < 3; k++) {  		//-------> Column
				System.out.print(" "+ b[j][k]);
			}
			
			System.out.println();
			
		}
		
		/*
		 * Jagged Array
		 * 
		 */
		
		for (int i = 0; i < c.length; i++) {
			
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(" "+ c[i][j]);
			}
			System.out.println();
		}
		
		/*
		 * 
		 * for each loop
		 * 
		 */
		
		for (int k[] : c) {
			for (int l : k) {
				
				System.out.print("  "+l);
				
			}
			System.out.println();
		}
		
	}
	
	
	

}
