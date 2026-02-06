package array;

public class Max$Min {
	public static void main(String[] args) {
		int max =0;
		int min=0;
		int [] arr = {1,2,3,4,5};
		for(int i =0; i< arr.length;i++) {
			if(arr[i]> arr[max]) {
				//arr[max]=arr[i];
				max=i;
			}
			if(arr[i]<arr[min]) {
				arr[i]=arr[min];
			}
		}
		System.out.println("max element is" + arr[max]);
		System.out.println("min element is" + arr[min]);
		
	}

}
