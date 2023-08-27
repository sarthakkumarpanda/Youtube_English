package wrapper_class_Concepts;

public class Boxing_Unboxing {

	// parent class for Character and Boolean Wrapper Classes is Object Class

	// parent class for other Wrapper classes is Number Class

	// Boxing - conversion of primitive data types to Wrapper Class Object

	// Unboxing - conversion of Wrapper Class Object to primitive data type

	public static void main(String[] args) {
		autoBoxingExample();
		normalBoxingExample();
		normalUnboxingExample();
		autoUnboxingExample();
	}

	public static void normalBoxingExample() {
		int a = 100;
		Integer b = Integer.valueOf(a);
		System.out.println(b);
	}

	public static void autoBoxingExample() {
		int a = 100;
		Integer b = a;
		System.out.println(b);
	}

	public static void normalUnboxingExample() {
		Integer result = 200;
		int newResult = result.intValue();
		System.out.println(newResult);
	}

	public static void autoUnboxingExample() {
		Integer result = 200;
		int newResult = result;
		System.out.println(newResult);
	}
}
