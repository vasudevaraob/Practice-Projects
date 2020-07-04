package com.corejava.string;

import java.util.StringTokenizer;

public class StringTokenizerExe {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("my name is khan", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		StringTokenizer st1 = new StringTokenizer("my,name,is,khan");

		// printing next token
		System.out.println("Next token is : " + st1.nextToken(","));
	}

}
