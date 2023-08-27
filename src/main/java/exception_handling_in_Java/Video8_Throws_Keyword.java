package exception_handling_in_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Video8_Throws_Keyword {
	
	/*
	 * public static void main(String[] args) throws FileNotFoundException {
	 * fileNotFoundExceptionValidation(); saveFileValidation(); }
	 */
	
	
	public static void main(String[] args) {
		try {
			fileNotFoundExceptionValidation();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File never existed");
		}
		try {
			saveFileValidation();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File never existed");
		}
	}
	
	
	public static void fileNotFoundExceptionValidation() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("Desktop//abc.txt");
	}
	
	//throws keyword gives an indication to the caller method that there is an Exception in the method which is
	//being called and that method has not handled that Exception. So you handle it.
	
	
	public static void saveFileValidation() throws FileNotFoundException {
		FileOutputStream ip = new FileOutputStream("Desktop//abc.txt");
	}

}
