package Function;

import java.math.BigInteger;
import java.util.Scanner;

public class Exam_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++) {
			String s1=sc.next();
			String s2=sc.next();
			BigInteger b1=new BigInteger(s1);
			BigInteger b2=new BigInteger(s2);
			System.out.println(b1.multiply(b2));
		}
		sc.close();
	}
}
