package Function;

import java.math.BigInteger;
import java.util.Scanner;

public class Exam_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String s1=t+"";int size=s1.length();
		int capacity=size%2==0?2*size:2*size-1;
		StringBuilder s=new StringBuilder(capacity);
		s.append(s1);
		int left=size-2;
		while(left>=0) {
			s.append(s.charAt(left));
			left--;
		}
		BigInteger b=new BigInteger(s.toString());
		if(b.isProbablePrime(1)) System.out.print("prime");
		else System.out.print("noprime");
		sc.close();
	}
}
