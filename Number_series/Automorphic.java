package java_practice;
import java.util.Scanner;
public class Automorphic {
	public static void automorph(int n) {
		int squ=n*n;	
	
		while(n>0) {
			if(n%10!=squ%10) {
				System.out.println(" not Automorphic number");
				return;
			}
			
			n=n/10;
			squ=squ/10;
		}
		System.out.println("Automorphic number");
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		automorph(n);
	}
			
}
