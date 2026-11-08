package StackAndQueueAndSTL;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		Queue<Integer> m=new LinkedList<>();
		Queue<Integer> e=new LinkedList<>();
		for(int i=0;i<n;i++) m.offer(sc.nextInt());
		for(int i=0;i<n;i++) e.offer(sc.nextInt());
//		假定全是晚上先，累加
		long sum=0;
		Integer[] diff=new Integer[n];
		for(int i=0;i<n;i++) {
			int mid=e.poll();
			sum+=mid;
			diff[i]=m.poll()-mid;
		}
		Arrays.sort(diff,(a,b)->b-a);
		for(int i=0;i<k;i++) sum+=diff[i];
		System.out.print(sum);
		sc.close();
	}

}
