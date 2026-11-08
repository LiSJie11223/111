package ArrayAndString;

import java.util.LinkedList;
import java.util.Scanner;

public class Exam_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt(),m=sc.nextInt();
		LinkedList<Integer> L=new LinkedList<>();
		for(int i=0;i<n;i++) L.add(i);
		//±àºÅkÊÇÏÂ±ê
		int index=k;
		while(L.size()>1) {
			index=(index+m-1)%L.size();
			L.remove(index);
		}
		System.out.println(L.getFirst());
	}

}
