package exception_handling_in_Java;

import java.util.Scanner;

public class Video7_Throw_Part4_Voting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // taking input from user
		System.out.println("Enter age : ");
		try {
			int age = s.nextInt();
			if (age < 18) {
				throw new Video7_Throw_Part3("Not eligible for voting");
			} else {
				System.out.println("Eligible for voting");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello World");
	}

}