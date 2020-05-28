package com.corejava;

class Sutdentclass{
	
	int rollno;
	String name;
	public Sutdentclass(int rollno, String name) {
		/*super();
		this.rollno = rollno;
		this.name = name;*/
		rollno = rollno;
		name = name;
		
	}
	void display() {
			
		System.out.println("Roll No:   "+rollno +" "+ "Name:   "+name);
	}
	
}


public class ThisDemo {

	public static void main(String[] args) {
		
		Sutdentclass s = new Sutdentclass(1, "Gani");
		s.display();
		
	}

}
