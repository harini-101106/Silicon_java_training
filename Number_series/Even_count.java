package java_practice;
import java.util.Scanner;
public class Even_count {
	public static void evencount(int n) {
		int count=0;
		while(n>0) {
			int dig=n%10;
			if(dig%2==0) {
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		evencount(n);
	}
}
