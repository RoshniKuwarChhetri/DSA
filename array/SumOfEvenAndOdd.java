package array;

public class SumOfEvenAndOdd {
	public static void evenPlusOdd(int[] arr) {
		int even=0;
		int odd=0;
		//int arr1[]= {1,3,4,5,7,8,9,5};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even=even+arr[i];
			}
			
			else {
				odd=odd+arr[i];
			}
			
		}
		
		System.out.println("sum of odd: "+odd);
		System.out.println("sum of even: "+even);
	}
	
	public static void main(String[] args) {
		int arr1[]= {1,3,4,5,7,8,9,5};
		SumOfEvenAndOdd.evenPlusOdd(arr1);
		
	}

}
