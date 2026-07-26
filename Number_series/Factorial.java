package java_practice;
import java.util.Scanner;
public class Factorial {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Factorial fac=new Factorial();
		int res=fac.fact(n);
		System.out.println(res);
	}
	public int fact(int n) {
		int facto=1;
		for(int i=1;i<=n;i++) {
			facto=facto*i;
		}
		return facto;
	}
}
