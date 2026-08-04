package Arrays;
import java.util.Scanner;
public class FirstSecReverse {
	public static void reverse(int []arr,int n) {
		int start=0,end;
		if(n%2==0) {
			end=(n/2)-1;
		}
		else {
			end=n/2;
		}
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		end=n-1;
		if(n%2==0) {
			start=n/2;
		}
		else {
			start=(n/2)+1;
		}
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		reverse(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
