package java_programs;

public class Calculator {

	public static void main(String[] args) {
		
		int number1 = 10;
		int number2 = 20;
		int res;
		String symbol = "+";
		
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
