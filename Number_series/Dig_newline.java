package java_practice;
import java.util.Scanner;
public class Num_dig_in_line {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0) {
			int dig=n%10;
			System.out.println(dig);
			n=n/10;
		}
		sc.close();
	}
}
