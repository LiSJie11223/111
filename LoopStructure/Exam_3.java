package LoopStructure;

import java.util.Scanner;

public class Exam_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().toUpperCase().charAt(0);
		//计算输出几行
		int len=c-'A';
		for(int i=0;i<=len;i++) {
//			'A'+i是每行的最大字符 用j->i
//			空格
			for(int j=1;j<=len-i;j++) {
				System.out.print(" ");
			}
//			左半边
			for(int j=0;j<=i;j++) {
				System.out.print((char)('A'+j));
			}
//			右半边
			for(int j=i-1;j>=0;j--) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
		sc.close();
	}

}
