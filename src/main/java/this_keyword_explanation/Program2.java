package this_keyword_explanation;

public class Program2 {

	public static void main(String[] args) {
		Program1 prog = new Program1();
		prog.setValues(10);
		prog.show(); //10
	}
	
	//after changing the value of local variable x to i then again if we ru, the output will be 0
	//so this is the problem that comes if we do not use this keyword
	//this will refer to the Current Class instance variable
	//alone this refers to the object
	//if we write this.i then it refers to the instance variable as instance variables are for the object only

}
