package java_practice;
import java.util.Scanner;
public class Armstrong {
	public static void arms(int n) {
		int count=0;
		int temp=n;
		while(n>0) {
			int dig=n%10;
			count++;
			n=n/10;
		}
		n=temp;
		int sum=0;
		int power=1;
		while(n>0) {
			int rem=n%10;
			for(int i=1;i<=count;i++) {
				power=power*rem;
			}
			sum=sum+power;
			power=1;
			n=n/10;
		}
	
		if(temp==sum) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong");
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arms(n);
	}
}
