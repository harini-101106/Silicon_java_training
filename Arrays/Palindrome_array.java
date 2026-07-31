package Arrays;
import java.util.Scanner;
public class Palindrome_array {
	public static boolean Palindrome(int []arr,int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]!=arr[n-1-i]) {
				return false;
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
		if(Palindrome(arr,n)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
