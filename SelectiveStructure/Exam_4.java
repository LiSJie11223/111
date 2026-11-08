package SelectiveStructure;

import java.util.Scanner;

public class Exam_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(),n=sc.nextInt();
		if(m%n==0) System.out.println("YES");
		else System.out.println("NO");
		sc.close();

	}

}
