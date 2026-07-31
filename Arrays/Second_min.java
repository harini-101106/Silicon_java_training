package Arrays;
import java.util.Scanner;
public class Second_min {
	public static int minimum(int []arr,int n) {
		int minimum=arr[0];
		int secmin=arr[1];
		for(int i=2;i<n;i++) {
			if(arr[i]<minimum) {
				secmin=minimum;
				minimum=arr[i];
			}
			else if(arr[i]<secmin && arr[i]!=minimum) {
				secmin=arr[i];
			}
		}
		return secmin;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(minimum(arr,n));
	}
}
