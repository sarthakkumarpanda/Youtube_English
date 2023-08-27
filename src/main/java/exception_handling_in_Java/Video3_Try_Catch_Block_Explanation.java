package exception_handling_in_Java;

public class Video3_Try_Catch_Block_Explanation {

	public static void main(String[] args) {
		
		tryCodeIsNotRiskySoWhatHappensToCodeInCatchBlock();
		tryCatchSyntax();
		arithmethicExceptionValidation();
		nullPointerExceptionValidation();
	}
	
	public static void arithmethicExceptionValidation() {
		int a = 1, b = 0, c;
		c = a / b; // this is also an exception but Compiler cannot check this. So, this is Runtime
					// or Unchecked Exception
		System.out.println(c);
		
		//Explanation:-
		//Exception occurs at line no 15. This line is under the main method. So the main method will create an Object.
		//This Object has 3 things : 1. Exception Name, [this has the Class Name]
		//                           2. Description, [what type of Exception it is]
		//                           3. StackTrace [which line and method has the exception]
		//this Object is passed to JVM. JVM will check if it can handle it. 
		//if JVM cannot handle that Object then it will pass the Object to Default Exception Handler but before that it will abnormally terminate the program
		//Default Exception Handler will print the Exception
		
		//in case you want to manually handle your Exception then we have to use Try Catch block
		
		//Exception handling can be done by 5 different keywords
		//1. try
		//2. catch
		//3. finally
		//4. throw
		//5. throws
	}
	
	public static void nullPointerExceptionValidation() {
		String name = null;
		System.out.println(name.length()); //this again is a RunTime Exception
	}
	
	public static void tryCatchSyntax() {
		try {
			//risky code
			int a = 1, b = 0, c;
			c = a / b;
			System.out.println(c);
		}
		catch(ArithmeticException referencevariablename) { //I can write Exception if I do not know which Class Name is there. So we can use Exception as it is parent
			//handling code
			System.out.println(referencevariablename); //so referencevariablename will store the Object discussed above
			System.out.println("Cannot divide by zero");
		}
	}
	
	
	public static void tryCodeIsNotRiskySoWhatHappensToCodeInCatchBlock() {
		try {
			System.out.println("1");
			System.out.println("2");
			int a=10, b=5, c;
			c=a/b;
			System.out.println(c);
			System.out.println("d");
		} catch (Exception e) {
			System.out.println("Hello World");
			e.printStackTrace();
		}
		
		System.out.println("Money");
	}

}
