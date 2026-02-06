package string;

public class Palindrome {
public static void main(String[] args) {
	String s="nmaman";
	String reverse = "";
	for(int i=s.length()-1;i>=0;i--) {
		char c= s.charAt(i);
		reverse = reverse +c;
	}
	if(s.equals(reverse)) {
		System.out.println("palindrome");
	}
	
	else System.out.println("not a palindrome");
}
}
