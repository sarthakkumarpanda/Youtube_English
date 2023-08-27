package this_keyword_in_java;

public class Uses_This_keyword {
	
	//1. used to refer current class instance variable
	
	//2. this keyword can be used to invoke current class method(implicitly)
	
	//Note - if we don't use this keyword compiler automatically adds this keyword while invoking the method
	
	void display() {
		System.out.println("Hello World");
	}

	void show() {
		this.display(); //display();
		//Note - if we don't use this keyword compiler automatically adds this keyword while invoking the method
	}
	
	public static void main(String[] args) {
		Uses_This_keyword ref = new Uses_This_keyword();
		ref.show();
	}
}
