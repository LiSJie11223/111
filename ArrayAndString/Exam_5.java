package ArrayAndString;

import java.util.Scanner;

public class Exam_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		if(n==1) {
			if(arr[0]<15&&arr[0]>0) 
				System.out.print("-1");
			else if(arr[0]==15) 
				System.out.print("DOWN");
			else if(arr[0]==0) 
				System.out.print("UP");
			else
				System.out.print("-1");
			return;
		}
		if(arr[n-1]>arr[n-2]) {
			if(arr[n-1]<15)
				System.out.print("UP");
			else if(arr[n-1]==15)
				System.out.print("DOWN");
			else
				System.out.print("-1");
		}else if(arr[n-1]<arr[n-2]){
			if(arr[n-1]>0)
				System.out.print("DOWN");
			else if(arr[n-1]==0) 
				System.out.print("UP");
			else
				System.out.print("-1");
		}else
			System.out.print("-1");
		sc.close();
	}
}