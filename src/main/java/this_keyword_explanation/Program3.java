package this_keyword_explanation;

public class Program3 {
	//use 2 - this keyword can be used to invoke current class method implicitly
	
	void display() {
		System.out.println("hello");
	}
	
	void show() {
		this.display(); //if you do not use this keyword, compiler automatically adds this keyword while invoking the method
		                //so this.display() or display() will work the same
	}

	public static void main(String[] args) {
		Program3 prog = new Program3();
		prog.show();

	}
	
	
	

}
