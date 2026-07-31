package Arrays;
import java.util.Scanner;
public class Searching {
	public static boolean search(int []arr,int n, int target) {
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				return true;
			}
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
		int target=sc.nextInt();
		if(search(arr,n,target)) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
		
	}
}
