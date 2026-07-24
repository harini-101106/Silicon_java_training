package java_practice;
import java.util.Scanner;
public class Count_digit {
	public static void countdigits(int n) {
		int count=0;
		while(n>0) {
			int dig=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		countdigits(n);
	}
}
