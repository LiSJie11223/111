package SelectiveStructure;

import java.util.Scanner;
import java.math.BigInteger;
public class Exam_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String X=sc.next(),Y=sc.next();
		BigInteger bx=new BigInteger(X);
		BigInteger by=new BigInteger(Y);
		if(by.remainder(bx).equals(BigInteger.ZERO)) System.out.println(bx.add(by));
		else System.out.println(by.subtract(bx));
		sc.close();
	}

}
