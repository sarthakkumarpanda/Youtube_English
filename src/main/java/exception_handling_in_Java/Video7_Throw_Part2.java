package exception_handling_in_Java;

public class Video7_Throw_Part2 {

	public static void main(String[] args) {
		int a=10, b=0, c;
		c=a/b;
		System.out.println(c);
		throw new ArithmeticException(); //here Exception Object is also created
		//but the Object passed to JVM is done by the Programmer. Main() method has nothing to do with it
		
		//throw keyword is used to create Exception Object by the programmer and passed to the JVM.
		
		//throw is basically used for Custom/User-defined Exceptions. Avoid using it for Pre-defined Exceptions
		

	}

}
