package StackAndQueueAndSTL;
// 递归和循环的综合使用
public class Exam_1 {
	static int n=8;
	static void start() {
		int[] path=new int[n];
		boolean[] used=new boolean[n+1];
		dfs(path,used,0);
	}
	static void dfs(int[] path,boolean[] used,int depth) {
		if(depth==n) {
			print(path,n);
			return;
		}
		for(int v=1;v<=n;v++) {
			if(!used[v]) {
				path[depth]=v;
				used[v]=true;
				dfs(path,used,depth+1);
				used[v]=false;
			}
		}
	}
	static void print(int[] path,int n) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) sb.append(path[i]);
		System.out.println(sb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
	}

}
