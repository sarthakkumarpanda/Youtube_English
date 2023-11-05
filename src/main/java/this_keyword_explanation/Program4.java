package this_keyword_explanation;

public class Program4 {
	//use 3 - this() can be used to invoke current class constructor
	
	Program4(){
		
		System.out.println("No argument constructor");
	}
	
	Program4(int i){
		this();  //it will call the no argument constructor
		System.out.println("Parameterized Constructor");
	}

	public static void main(String[] args) {
		//Program4 prog = new Program4();
		
		Program4 prog1 = new Program4(10);

	}

}
