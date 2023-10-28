package control_statements;

public class ForEach_AdvancedForLoop {

	public static void main(String[] args) {
		
		forloopCodeDemo();
	}
	
	
	public static void forloopCodeDemo() {
		char[] viowels = {'a', 'e', 'i', 'o', 'u'};
		for(char item : viowels) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int sum=0;
		
		for(int item1 : numbers) {
			System.out.print(item1 + " ");
			sum = sum+item1;
		}
		System.out.println("Total sum is : " + sum);
	}

}
