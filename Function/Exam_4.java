package Function;

import java.util.Scanner;

public class Exam_4 {
	public static boolean isOb(int n) {
		int num1=10,num2=1;
		int sum=0;
		int time=(n+"").length();
		while(time>0) {
			sum+=(n%num1)/num2;
			num1*=10;num2*=10;
			time--;
		}
		if(sum%5==0) return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		int cnt=0;
		for(int i=x;i<=y;i++)
			if(isOb(i)) cnt++;
		System.out.print(cnt);
		sc.close();
	}
}
