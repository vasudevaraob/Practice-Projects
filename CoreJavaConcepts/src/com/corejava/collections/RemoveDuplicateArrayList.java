package com.corejava.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Mango");
		al.add("Apple");
		al.add("Orange");
		al.add("Orange");
		
		System.out.println(al);
		
		Set<String> s = new LinkedHashSet<>(al);
		
		System.out.println(s);
		
	}

}
