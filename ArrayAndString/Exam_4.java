package ArrayAndString;

import java.util.Scanner;

public class Exam_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt(),M=sc.nextInt();
		boolean[] arr=new boolean[L+1];
		int cnt=0;
		for(int i=1;i<=M;i++) {
			int left=sc.nextInt();
			int right=sc.nextInt();
			for(int j=left;j<=right;j++) {
				if(arr[j]!=true) {
					arr[j]=true;
					cnt++;
				}
			}
		}
		System.out.print(L+1-cnt);
		sc.close();
	}

}
