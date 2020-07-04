package com.corejava.string;

/*
 * equals() for content comparesion
 * ==  for reference storage location comparision
 * compareTo() 
 * 
 */

public class StringCompare {

	public static void main(String[] args) {

		// equals() method

		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		// equalsIgnoreCase method

		String s11 = "Sachin";
		String s23 = "SACHIN";
		System.out.println(s11.equals(s23));// false
		System.out.println(s11.equalsIgnoreCase(s23));// true

		// == operator

		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)

	}

}

/*
 * 
 * compareTo()
 * 
 */

class Teststringcomparison4 {
	public static void main(String args[]) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )
	}
}