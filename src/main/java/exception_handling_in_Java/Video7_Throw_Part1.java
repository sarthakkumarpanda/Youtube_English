package exception_handling_in_Java;

public class Video7_Throw_Part1 {
	
	public static void main(String[] args) {
		Video7_Throw_Part1 ref = new Video7_Throw_Part1();
		ref.divideByZero();
	}
	
	
	public void divideByZero() { //this method is responsible for creating the Exception Object
		int a=10, b=0, c;
		c=a/b;
		System.out.println(c);
		
		//explanation:-
		//divideByZero() method will create the Object and JVM will ask divideByZero() if it can handle this exception
		//divideByZero() will deny handling the exception, so JVM will abnormally terminate divideByZero() method
		//then JVM will go to caller method main() and ask main() if it is handling the Exception
		//main() method will deny handling the Exception, so JVM will also terimate the main() method abnormally
		//JVM will pass the Exception Object to Default Exception Handler. Then DFE will print the Object's details and program will terminate abnormally
	    
	}

}
