package interview;

public class Program1 {

	public static void main(String[] args) {
		//WAP to find three elements whose sum = 0
		
		int[] arr = {0, -1, 2, -3, 1};   //0, -1, 1       //2, -3 , 1
		
		
		int sum = 0;
		
		for(int i=0 ; i< arr.length ; i++) {
			for( int j=i+1 ; j<arr.length-1 ; j++) {
				for(int k=j+1 ; k<arr.length-2 ; k++) {
					
					if(arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + arr[j] + arr[k]);
					}
				}
			}
			
			
				
			}
		}

	}

