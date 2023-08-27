package com.constructors;

public class Test_Default_Values {
	String name;
	int age;

	public static void main(String[] args) {
	
		Test_Default_Values ref = new Test_Default_Values();
		System.out.println(ref.name);
		System.out.println(ref.age);
		
		Test_Default_Values ref1 = new Test_Default_Values(21);
	}
	
	public Test_Default_Values() {
		System.out.println("No args constructor");
	}
	
	public Test_Default_Values(int age) {
		System.out.println("Parameterized constructor");
	}

}
