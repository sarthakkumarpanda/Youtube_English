package this_keyword_explanation;

public class Program1 {
	//we learnt in OOPs that an Object has state and behavior
	//reference variable is the one which refers to the object.
	//this keyword is also a reference variable which refers to the object
	
	int i;
	
	void setValues(int i) {
		this.i=i;
	}
	
	void show() {
		System.out.println(i);
	}

}

//now change the local variable x to i
