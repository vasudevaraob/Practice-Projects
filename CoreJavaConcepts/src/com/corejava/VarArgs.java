package com.corejava;

class Calci {

	public int add(int... n) {
		
		int sum=0;
		
		for (int j : n) {
			 sum = sum + j;
			
		}
		 System.out.println(sum);
		return sum;
		
	}

}

public class VarArgs {

	public static void main(String[] args) {

		Calci obj = new Calci();

		obj.add(8,9,5,6,9,8,7,4,6,6,2,6);

	}

}
