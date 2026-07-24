package java_practice;
import java.util.Scanner;
public class Power {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int power=sc.nextInt();
		int res=1;
		for(int i=1;i<=power;i++) {
			res=res*base;
		}
		System.out.println(res);
	}
}
