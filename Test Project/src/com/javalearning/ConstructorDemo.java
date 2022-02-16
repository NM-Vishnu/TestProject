package com.javalearning;

public class ConstructorDemo {
	
	int instanceVariable;
	
	ConstructorDemo(){
		instanceVariable=200;
	}
	ConstructorDemo(int value){
		instanceVariable = value;
	}
public static void main(String[] args) {
	ConstructorDemo demo= new ConstructorDemo();
	ConstructorDemo demo1 = new ConstructorDemo(30);
	
	System.out.println(demo.instanceVariable);
	System.out.println(demo1.instanceVariable);
	
	System.out.println("Demo Branch Created");
	
}
}
