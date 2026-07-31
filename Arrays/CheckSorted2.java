package Arrays;
import java.util.Scanner;
public class CheckSorted2 {
	public static boolean sort(int []arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean descending(int []arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		if(sort(arr,n) || descending(arr,n)) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not sorted");
		}
	}
}
