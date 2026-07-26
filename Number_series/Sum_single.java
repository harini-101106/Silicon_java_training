package java_practice;
import java.util.Scanner;
public class Sum_single_dig {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>=10) {
			int sum=0;
			while(n>0) {
				int dig=n%10;
				sum=sum+dig;
				n=n/10;
			}
			n=sum;
		}
		System.out.println(n);
	}
}
