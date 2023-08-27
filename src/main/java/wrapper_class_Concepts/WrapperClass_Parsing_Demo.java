package wrapper_class_Concepts;

public class WrapperClass_Parsing_Demo {

	public static void main(String[] args) {
		stringToInteger();
		stringToDouble();
		

	}
	
	public static void stringToInteger() {
		String price1 = "450";
		String price2 = "200";
		
		//int result = price1 + price2; - this statement is not possible
		//System.out.println(price1 + price2);  //this will just concatenate the values
		//so we need to convert the String to int data type
		
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		
		int sum = p1+p2;
		System.out.println(sum);
	}
	
	public static void stringToDouble() {
		String price1 = "450.25";
		String price2 = "200.75";
		
		double d1 = Double.parseDouble(price1);
		double d2 = Double.parseDouble(price2);
		double sum = d1+d2;
		System.out.println(sum);
	}

}
