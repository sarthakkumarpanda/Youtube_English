package com.constructors;

public class Employee {
	
	String name;
	int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Tom", 28);
		Employee e2 = new Employee("Dick", 25);
		Employee e3 = new Employee("Harry", 22);
	}

}
