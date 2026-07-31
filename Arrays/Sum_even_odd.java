package Arrays;
import java.util.Scanner;
public class Sum_even_odd {
	public static int sum(int []arr,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static boolean evenOdd(int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum : "+sum(arr,n));
		int ans=sum(arr,n);
		if(evenOdd(ans)) {
			System.out.println("Category : Even");
		}
		else {
			System.out.println("Category : Odd");
		}
	}
	
}
