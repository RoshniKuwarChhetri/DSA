package number;
import java.util.Scanner;
public class Factorial {
	public static int fact(int n) {
		if(n==0) 
			return 1;
		
			return n*fact(n-1);
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a no.");
		int n =scanner.nextInt();
		
		int c=fact(n);
		System.out.println(c);
	}

}
