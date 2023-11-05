package this_keyword_explanation;

public class Program5 {
	//this keyword can be used to pass as an argument in the method call
	
	void m1(Program5 prog) {
		System.out.println("I am in m1 method");
	}
	
	void m2() {
	  m1(this);	
	}

	public static void main(String[] args) {
	Program5 prog = new Program5();
	prog.m2();

	}

}
