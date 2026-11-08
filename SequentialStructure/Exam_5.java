package SequentialStructure;

public class Exam_5 {

	public static void main(String[] args) {
		int num=1;
		while(num<=9) {
			for(int j=1;j<=num;j++) {
				if(num*j>=10)
					System.out.print(j+"*"+num+"="+num*j+" ");
				else
					System.out.print(j+"*"+num+"="+" "+num*j+" ");
			}
			num++;
			System.out.println();
		}
	}

}
