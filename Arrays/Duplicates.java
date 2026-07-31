package Arrays;
import java.util.Scanner;
public class Duplicates {
	public static void duplicateArray(int []arr,int n) {
		boolean []visited=new boolean[n];
		for(int i=0;i<n;i++) {
			if(visited[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count>1) {
				System.out.print(arr[i]+" ");
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
		duplicateArray(arr,n);
		
	}
}
