package Arrays;
import java.util.Scanner;
public class Prime_array {
	public static boolean prime(int n) {
		boolean found=true;
		if(n<=1) {
			found=false;
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					found=false;
					break;
				}
			}
		}
		return found;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(prime(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
