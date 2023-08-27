package this_keyword_in_java;

public class Use5 {
	
	//this keyword can be used to pass as an argument in the constructor call
	
	public Use5(ThisDemo td) {
	System.out.println("Use5 class constructor");	
	}

}

class ThisDemo {
	
	public void method1() {
		Use5 u5 = new Use5(this);
	}
	
	public static void main(String[] args) {
		ThisDemo t = new ThisDemo();
		t.method1();
	}
}
