package Arrays;
import java.util.Scanner;
public class AddBinaryNum {
	public static int bintodec(int a) {
		int dec=0;
		int pos=1;
		while(a>0) {
			int rem=a%10;
			dec=dec+rem*pos;
			pos=pos*2;
			a=a/10;
		}
		return dec;	
	}
	public static int dectobin(int n) {
		int bin=0;
		int pos=1;
		while(n>0) {
			int r=n%2;
			bin=bin+r*pos;
			pos=pos*10;
			n=n/2;
		}
		return bin;
	}
		
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=bintodec(a)+bintodec(b);
		int res=dectobin(sum);
		System.out.print(res);
	}
}
