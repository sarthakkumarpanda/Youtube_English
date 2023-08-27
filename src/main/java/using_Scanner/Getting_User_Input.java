package using_Scanner;

import java.util.Scanner;

public class Getting_User_Input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.next();
		
		System.out.println("Enter gender");
		char gender = scan.next().charAt(0);
		
		System.out.println("Enter age");
		int age = scan.nextInt();
		
		System.out.println("Enter phonenumber");
		long phonenumber = scan.nextLong();
		
		System.out.println("Name : " + name );
		System.out.println("Gender : " + gender );
		System.out.println("Age : " + age );
		System.out.println("Phone : " + phonenumber );
		

	}

}
