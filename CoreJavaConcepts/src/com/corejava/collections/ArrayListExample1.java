package com.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Printing the arraylist object

		// Adding an element at the specific position
		list.add(1, "Gaurav");
		
		System.out.println(list);
		
		// for sorting
		
		Collections.sort(list);
		// for reverce sort
		//Comparator<SmartPhone> cmp = Collections.reverseOrder(new RatingComparator());  
		  

		// this is for sorting
		for (String fruits : list) {

			System.out.println(fruits);

		}

		// Removing specific element from arraylist
		list.remove("Mango");
		System.out.println("After invoking remove(object) method: " + list);
		// Removing element on the basis of specific position
		list.remove(0);
		System.out.println("After invoking remove(index) method: " + list);

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();

			System.out.println(string);

		}

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(5);
		al.add(6);

		System.out.println(al);
	}
}
