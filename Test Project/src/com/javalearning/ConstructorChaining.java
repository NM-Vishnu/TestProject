package com.javalearning;

public class ConstructorChaining {
	public String sName;
	public int sMarks;
	
	//default constructor
	ConstructorChaining(){
		//this will call the constructor with string parm
		this("Vishnu");
	}
	ConstructorChaining(String name){
		//this will call the constructor with string and int parm
		this(name,70);
	}
	ConstructorChaining(String name, int mark){
		this.sName=name;
		this.sMarks=mark;;
	}
	void disp() {
		System.out.println("Student Name:" + this.sName);
		System.out.println("Student Mark:" + this.sMarks);
	}
	
	public static void main(String[] args) {
		ConstructorChaining c = new ConstructorChaining();
		c.disp();
	}

}
