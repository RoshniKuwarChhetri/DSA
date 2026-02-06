package array;

public class AvgOfArray {
public static void main(String[] args) {
	int count =0;
	int avg=0;
	int sum=0;
	int [] arr= {1,2,3,4};
	for(int i=0 ; i < arr.length;i++) {
		count++;
		//sum=sum+arr[i];
	}
	System.out.println((double)sum/count);
}
}