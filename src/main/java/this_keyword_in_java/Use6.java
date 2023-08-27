package this_keyword_in_java;

public class Use6 {
	//this keyword can be used to return the current class instance from the method
	
	Use6 method1(){
		return this; //returning current class instance
	}
	
	
	public static void main(String[] args) {
		Use6 u6 = new Use6();
		u6.method1();
	}

}
