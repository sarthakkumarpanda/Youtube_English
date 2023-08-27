package this_keyword_in_java;

public class Value {

	int age;
	String name;
	
	public void setValues(int age, String name) {
		this.age = age; //this refers to current Class instance variable
		this.name = name;
	}
	
	public void show() {
		System.out.println(age +  " " + name);
	}
}

class Test {
	
	public static void main(String[] args) {
		Value value = new Value();
		value.setValues(10, "Tom");
		value.show();
	}
}
