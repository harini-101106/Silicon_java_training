package Arrays;
import java.util.Scanner;
public class Frequency {
	public static void occurs(int []arr,int n) {
		int []freq=new int[256];
		for(int i=0;i<n;i++) {
			freq[arr[i]]++;
		}
		for(int i=0;i<n;i++) {
			if(freq[arr[i]]>0) {
				System.out.println(arr[i]+"-"+freq[arr[i]]);
				freq[arr[i]]=0;
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
		occurs(arr,n);
	}
}
