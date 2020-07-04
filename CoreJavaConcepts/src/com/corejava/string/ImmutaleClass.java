package com.corejava.string;

/*
 * Private class
 */
public class ImmutaleClass {
	//private variale
	final String pancardNumber;
	
	//Public constrector
	public ImmutaleClass(String pancardNumber){  
	this.pancardNumber=pancardNumber;  
	}
	
	//getter
	public String getPancardNumber() {
		return pancardNumber;
	}
}
