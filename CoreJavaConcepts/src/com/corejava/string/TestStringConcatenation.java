package com.corejava.string;

public class TestStringConcatenation {

	public static void main(String[] args) {
		String s1 = "Sachin" + " Tendulkar";
		System.out.println(s1);// Sachin Tendulkar

		String s = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s);// 80Sachin4040

		String s11 = "Sachin ";
		String s2 = "Tendulkar";
		String s3 = s11.concat(s2);
		System.out.println(s3);// Sachin Tendulkar
	}

}

class TestSubstring{  
	 public static void main(String args[]){  
	   String s="SachinTendulkar";  
	   System.out.println(s.substring(6));//Tendulkar  
	   System.out.println(s.substring(0,6));//Sachin  
	 }  
	}  
