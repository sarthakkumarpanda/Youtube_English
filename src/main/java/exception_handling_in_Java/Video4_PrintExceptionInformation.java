package exception_handling_in_Java;

public class Video4_PrintExceptionInformation {

	public static void main(String[] args) {
		try {
			int a = 1, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace(); //this will print Exception Name, description and stack trace.
			System.out.println(e); //this will print Exception Name and description. But no stack trace.
			System.out.println(e.toString()); //this will print Exception Name and description. But no stack trace.
			System.out.println(e.getMessage()); //will not print Exception Name and stack trace, prints description only.
		}

	}

}
