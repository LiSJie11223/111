package ArrayAndString;

import java.util.Scanner;

public class Exam_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int[][] arr=new int[T][];
//		放好数据
		for(int i=0;i<T;i++) {
			int n=sc.nextInt();
			arr[i]=new int[n];
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		处理得结果
		for(int i=0;i<T;i++) {
			int max=arr[i][0],min=max;
			double sum=0;
			double len=arr[i].length;
			for(int j=0;j<len;j++) {
				sum+=arr[i][j];
				if(arr[i][j]>max) max=arr[i][j];
				if(arr[i][j]<min) min=arr[i][j];
			}
			System.out.print(max-min+" ");
//			计算方差的关键部分
			double aver=sum/len;
			double res=0;
			for(int j=0;j<len;j++) {
				res+=(arr[i][j]-aver)*(arr[i][j]-aver);
			}
			System.out.printf("%.3f",res/len);
			System.out.println();
		}
		sc.close();
	}

}
