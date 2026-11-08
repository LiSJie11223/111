package Function;

import java.util.Scanner;

public class Exam_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt(),R=sc.nextInt();
		StringBuilder s=new StringBuilder();
		for(int i=L;i<=R;i++) {
			s.append(i+"");
		}
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='2') {
				cnt++;
			}
		}
		System.out.print(cnt);
		sc.close();
	}

}
