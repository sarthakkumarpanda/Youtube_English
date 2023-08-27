package using_Scanner;

import java.util.Scanner;

public class Calculator_Scanner {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int number1 = scan.nextInt();
	
	System.out.println("Enter second number");
	int number2 = scan.nextInt();
	
	System.out.println("Select symbol (+, - , *, /)");
	String symbol = scan.next();
	
	int res;
	
	switch(symbol) {
	case "+": res = number1 + number2;
	System.out.println(res);
	break;
	
	case "-": res = number1 + number2;
	System.out.println(res);
	break;
	
	case "*": res = number1 + number2;
	System.out.println(res);
	break;
	
	case "/": res = number1 + number2;
	System.out.println(res);
	break;
	
	default: System.out.println("invalid symbol");
	break;	
	
	}

	}

}
