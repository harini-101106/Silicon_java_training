package Arrays;
import java.util.Scanner;
public class maxminelement {
	public static void element(int []arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int low=0;
		int high=n-1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				System.out.print(arr[high]+" ");
				high--;
			}
			else {
				System.out.print(arr[low]+" ");
				low++;
			}
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		element(arr,n);
	}
}
