package this_keyword_in_java;

public class Use3 {
	//this() can be used to invoke current class constructor
	
	public Use3(){
		this("Don");
		System.out.println("Hello World");
	}
	
	public Use3(String name) {
	//	this();
		System.out.println("Blue ocean");
	}
	
	public static void main(String[] args) {
		Use3 u3 = new Use3();
		//Use3 u3 = new Use3("Tom");
		
	}

}
