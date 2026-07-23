package java_practice;
import java.util.Scanner;
public class Palindrome {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int original=n;
		int rev=0;
		while(n>0) {
			int dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		if(rev==original) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		sc.close();
	}
}
