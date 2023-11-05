package super_keyword_in_java;

public class Child extends Parent{
	
	int a=20;
	
	void show(int a) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.show(30);
		
	}

}
