package exception_handling_in_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Video2_CheckedVsUnchecked_Exception {

	// No Exceptions occur at Compile Time. All exceptions occur at RunTime

	// Compile Time Exceptions are the exceptions which Compiler can check at its level
	// Runtime Exceptions cannot be checked by the Compiler

	public static void main(String[] args) {

		fileNotFoundExceptionValidation();
		classNotFoundValidation();
		arithmethicExceptionValidation();
	}

	public static void fileNotFoundExceptionValidation() {
		try {
			FileInputStream ip = new FileInputStream("Desktop//hello.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void classNotFoundValidation() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void arithmethicExceptionValidation() {
		int a = 1, b = 0, c;
		c = a / b; // this is also an exception but Compiler cannot check this. So, this is Runtime
					// or Unchecked Exception
		System.out.println(c);
	}

}
