package StackAndQueueAndSTL;

//import java.util.Random;
import java.util.Scanner;

public class Exam_3 {
//	碰碰运气
/*	static int GetOnly(boolean[] used) {
		Random r=new Random();
		int i=r.nextInt(used.length);
		if(used[i]==false) {
			used[i]=true;
			return i;
		}else {
			return GetOnly(used);
		}
	}
	static int Getlayer(int n) {
		if(n==1||n==0) {
			return 1;
		}
		return Getlayer(n-1)*n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++) data[i]=sc.nextInt();
//		设置判断用没用过的数组
		boolean[] used=new boolean[n];
//		计算组合总数
		int total=Getlayer(n)/(6*Getlayer(n-3));
		int a,b,c;
		for(int i=0;i<total;i++) {
//			获取不重复的三个下标的元素
			a=data[GetOnly(used)];
			b=data[GetOnly(used)];
			c=data[GetOnly(used)];
//			初始化判断数组
			for(int j=0;j<n;j++) used[j]=false;
//			三角形的判断
			if(a+b>c&&b+c>a&&a+c>b) {
				System.out.print(a+" "+b+" "+c);
				sc.close();
				return;
			}
		}
		System.out.print("No solution");
		sc.close();
	}
	*/
//	枚举
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        long[] a = new long[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextLong();
	        }

	        // 三重循环枚举所有下标组合 i < j < k
	        for (int i = 0; i < n - 2; i++) {
	            for (int j = i + 1; j < n - 1; j++) {
	                for (int k = j + 1; k < n; k++) {
	                    if (a[i] + a[j] > a[k] &&
	                        a[i] + a[k] > a[j] &&
	                        a[j] + a[k] > a[i]) {
	                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
	                        sc.close();
	                        return;
	                    }
	                }
	            }
	        }
	        System.out.println("No solution");
	        sc.close();
	    }
	}

