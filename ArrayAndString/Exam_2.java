package ArrayAndString;

import java.util.Scanner;

public class Exam_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			String s=i+"";
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)-'0'==x) {
					cnt++;
				}
			}
		}
		sc.close();
		System.out.print(cnt);
	}

}
