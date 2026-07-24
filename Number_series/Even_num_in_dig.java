package java_practice;
import java.util.Scanner;
public class Even_num_in_dig {
	public static void evennum(int n) {
		while(n>0) {
			int dig=n%10;
			if(dig%2==0) {
				System.out.println(dig);
			}
			n=n/10;
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		evennum(n);
	}
}
