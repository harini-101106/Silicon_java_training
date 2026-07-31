package Arrays;
import java.util.Scanner;
public class MaxMinIndex {
	public static int max(int []arr ,int n) {
		int max=arr[0];
		int index=0;
		for(int i=1;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
				index=i;
			}
		}
		return index;
	}
	public static int min(int []arr,int n) {
		int min=arr[0];
		int index=0;
		for(int i=1;i<n;i++) {
			if(min>arr[i]) {
				min=arr[i];
				index=i;
			}
		}
		return index;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(max(arr,n));
		System.out.println(min(arr,n));
	}
}
