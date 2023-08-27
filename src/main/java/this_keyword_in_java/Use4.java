package this_keyword_in_java;

public class Use4 {
//this can be used to pass as an argument in the method call
	
	public void method1(Use4 ref) { //passed the reference of the Class as input parameter
		System.out.println("This is method1");
	}
	
	public void method2() {
		method1(this);     //here passing this keyword as an argument
	}
	
	

	public static void main(String[] args) {
		Use4 u4 = new Use4();
		u4.method2(); //so this will call the method1 indirectly.
	}
}
