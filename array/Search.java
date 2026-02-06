package array;

public class Search {
    public static void search(int [] arr) {
    	int target=10;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==target) {
    		System.out.println(i);
    		break;
    		}
    		else {
    			System.out.println(-1);
    		}
    	}
    	
    
    }
    public static void main(String[] args) {
		int arr[]= {1,10,2,3,4,5,6,10};
		search(arr);
	}
}
