package LoopStructure;

import java.util.Scanner;

public class Exam_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()) {
			int n=sc.nextInt();
			//上
			for(int i=0;i<=n;i++) {
				//空格 n-i
				for(int j=2*(n-i);j>=1;j--) {
					System.out.print(" ");
				}
				//* i
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			//下
			for(int i=n-1;i>=0;i--) {
				//空格 2*(n-i)
				for(int j=2*(n-i);j>=1;j--) {
					System.out.print(" ");
				}
				//* 
				for(int j=1;j<=i+1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}