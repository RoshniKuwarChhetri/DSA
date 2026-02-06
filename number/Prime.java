package number;

public class Prime {
	public static void prime(int n) {
		boolean isprime=true;
		for(int i=2; i<n;i++){
			if(n%i==0) {
				isprime = false;
			}
			
		}
		if (isprime==true) {
			System.out.println("prime");
		}
		
		else {
			System.out.println("not prime");
		}
	}
	public static void main(String[] args) {
	  prime(7);
	}
}