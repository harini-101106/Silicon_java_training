package Arrays;
import java.util.Scanner;
public class Second_largest {
	public static int maximum(int []arr,int n) {
		int largest=arr[0];
		int seclargest=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				seclargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>seclargest && arr[i]!=largest) {
				seclargest=arr[i];
			}
		}
		return seclargest;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maximum(arr,n));
	}
}
