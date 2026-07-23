package java_practice;
import java.util.Scanner;
public class Square_loop {
	public static void square(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i*i);
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		square(n);
	}
}
