package exception_handling_in_Java;

public class Video5_Finally_Block {
	
	//finally block will execute no matter Exception occurs or not

	public static void main(String[] args) {
	
		
		try {
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("This is finally blcok");
		}

	}


}
