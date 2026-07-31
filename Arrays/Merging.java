package Arrays;
import java.util.Scanner;
public class Merging {
	public static void sort(int []arr1,int n1,int[]arr2,int n2) {
		int []res=new int[n1+n2];
		for(int i=0;i<n1;i++) {
			res[i]=arr1[i];
		}
		for(int i=0;i<n2;i++) {
			res[n1+i]=arr2[i];
		}
		for(int i=0;i<n1+n2;i++) {
			for(int j=i+1;j<n1+n2;j++) {
				if(res[i]>res[j]) {
					int temp=res[i];
					res[i]=res[j];
					res[j]=temp;
				}
			}
		}
		for(int i=0;i<n1+n2;i++) {
			System.out.print(res[i]+" ");
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int []arr1=new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		int n2=sc.nextInt(); 
		int []arr2=new int[n2];
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		sort(arr1,n1,arr2,n2);
	}
}
