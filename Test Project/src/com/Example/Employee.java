package com.Example;

public class Employee {
	int id;
	int salary;
	static String company = "V For U";
static void company() {
	company="My MU";
}

Employee(int i, int s){
	this.id=i;
	this.salary=s;
}

void display() {
System.out.println(id+" "+salary+" "+company);
}
public static void main(String[] args) {
	Employee.company();//If we call this u can see the difference in the company name
	Employee e1 = new Employee(1,20000);
	Employee e2 = new Employee(2,30000);
	e1.display();
	e2.display();
}
}
