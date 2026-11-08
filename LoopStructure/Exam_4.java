package LoopStructure;

import java.util.Scanner;

public class Exam_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int loop=sc.nextInt();
		while(true) {
			if(loop==0) break;
			int n=(sc.nextInt()/2)+1;
			//上
			for(int i=1;i<=n;i++) {
				//空格 n-i
				for(int j=n-i;j>=1;j--) {
					System.out.print(" ");
				}
				//* 2*i-1
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			//下
			for(int i=n-1;i>=1;i--) {
				//空格 n-i
				for(int j=n-i;j>=1;j--) {
					System.out.print(" ");
				}
				//* 
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			loop--;
		}
		sc.close();	

	}

}