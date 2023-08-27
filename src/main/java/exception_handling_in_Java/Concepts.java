package exception_handling_in_Java;

public class Concepts {
	
	//an exception is an unwanted or unexpected event which occurs during the execution of a program, i.e., at runtime disrupting normal flow
	
	
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println(5/0); //ArithmeticException - divide by zero and next lines of code will not be printed
		System.out.println("6");
		System.out.println("7");
	}

}
