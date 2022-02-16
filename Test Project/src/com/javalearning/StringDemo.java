package com.javalearning;

public class StringDemo {
public static void main(String[] args) {
	String s = "VISHNU";
	String s1= "SPARK";
	int a = 1000;
	String s2 = String.valueOf(a);
	System.out.println(s2);
	System.out.println(s.length());
	System.out.println(s.substring(3));
	System.out.println(s.compareTo(s1));
	
	//String Buffer=> Thread safe , Synchronized
	StringBuffer s3= new StringBuffer("Vishnuram"); 
	s3.append("Nagarajan");
	System.out.println(s3);
	s3.insert(6, "B");
	System.out.println(s3);
	System.out.println(s3.reverse());
	
	//String Builder=> Not Thread safe , Not Synchronized, faster than String builder
}
}