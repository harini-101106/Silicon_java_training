package java_practice;
import java.util.Scanner;
public class Twisted_prime {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=reverse(n);
		if(prime(n)&& revPrime(rev)) {
			System.out.println("Twistd prime");
		}
		else {
			System.out.println("Not a twisted prime");
		}
		
	}
	public static boolean prime(int n) {
		boolean found=true;
		if(n<=1) {
			found=false;
		}
	
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				found=false;
				break;
			}
		}
		return found;
	}
	public static int reverse(int n) {
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
	public static boolean revPrime(int rev) {
		boolean found=true;
		if(rev<=1) {
			found=false;
		}
		for(int i=2;i<=rev/2;i++) {
			if(rev%i==0) {
				found=false;
				break;
			}
		}
		return found;
	}
}
