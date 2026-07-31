package Arrays;
import java.util.Scanner;
public class MaxMin {
	public static int max(int []arr ,int n) {
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int min(int []arr,int n) {
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("maximum: "+max(arr,n));
		System.out.println("minimun: "+min(arr,n));
		
	}
}
