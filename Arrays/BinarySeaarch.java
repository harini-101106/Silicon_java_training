package Arrays;
import java.util.Scanner;
public class BinarySearch {
	public static int binsearch(int []arr,int n,int key) {
		int low=0;
		int high=n-1;
		int mid;
		int index=0;
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]==key) {
				index=mid;
				break;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
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
		int key=sc.nextInt();
		System.out.print(binsearch(arr,n,key));
	}
}
