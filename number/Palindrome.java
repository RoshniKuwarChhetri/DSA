package number;

public class Palindrome {
	public static boolean palindrome(int x) {
	int temp=0;
	   int reverse=0;
       int n=x;
       while(n>0) {
    	   temp=n%10;
    	   reverse=reverse*10+temp;
    	   n=n/10;
       }
       
       if(reverse==x) {
    	   return true;
       }
       else {
    	   return false;
       }
}
	
	public static void main(String[] args) {
		
		 boolean result=palindrome(121);	
		 System.out.println(result);
	}
}