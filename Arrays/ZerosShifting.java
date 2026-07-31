package Arrays;
import java.util.Scanner;
public class ZerosShifting {
	public static void shifting(int []arr,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		for(int i=count;i<n;i++) {
			System.out.print("0 ");
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		shifting(arr,n);
	}
}
