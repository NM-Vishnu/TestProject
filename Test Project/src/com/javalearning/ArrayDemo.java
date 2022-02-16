package com.javalearning;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		char[] source = {'V','I','S','S','H','S','S'};
		char[] newSource = new char[6];
		char toBeDeleted = source[3];
		
		for(int i=0; i < source.length-1; i++) 
		{
			if (source[i] == toBeDeleted) {
				 for(int index = 0; index < i; index++){
					 newSource[index] = source[index];
					 System.out.println("First" + Arrays.toString(newSource));
	                }
	                for(int j = i; j < source.length - 1; j++){
	                	newSource[j] = source[j+1];
	                	System.out.println("Second" + Arrays.toString(newSource));
	                }
	                
	            }
	        }
		System.out.println("New Array is:" + Arrays.toString(newSource));
	}
	
}
