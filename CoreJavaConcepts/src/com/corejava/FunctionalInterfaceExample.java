package com.corejava;

@FunctionalInterface
interface sayable {
	void say(String msg);
}

interface ABCEFGH {
	
	void show();
	
}

public class FunctionalInterfaceExample implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say("Hello there");
		
		ABCEFGH lex = () -> System.out.println("");
	}
}
