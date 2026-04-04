package com.Aspig.luogu6;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class lg_4 {
	static int[] parent;
	static int[] count;
	static int find(int x)
	{
		if(parent[x]!=x)
		{
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}
	static void union(int x ,int y)
	{
		int fx = find(x);
		int fy = find(y);
		if(fx==fy)
		{
			return;
		}
		else
		{
			if(count[fx]<count[fy]) {//x区块的点数更小
			parent[fx] = fy;// 把x区块合并到y
		    count[fy]+=count[fx];//把x的点数加到y上
			}
			else {//y区块点数更少
				parent[fy] = fx;
			    count[fx]+=count[fy];
			}
		}
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	parent = new int[n+1];
	count = new int[n+1];
	for (int i = 1; i <=n; i++) {
		parent[i] = i;//初始化归属数组
	    count[i] =1 ; //计算每个区块有几个点的
	}
    int m = scanner.nextInt();
    for (int i = 0; i < m; i++) {
		String c = scanner.next();
	     if(c.equals("C"))
	     {
	    	 int a = scanner.nextInt();
	         int b = scanner.nextInt();
	    	 union(a, b);
	     }
	     else if(c.equals("Q1")){ 
	    	 int a = scanner.nextInt();
		     int b = scanner.nextInt();
			if(find(a)==find(b))
			{
				
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	     else {
	    	 int a = scanner.nextInt();
			System.out.println(count[find(a)]);
		}
    }
}
}
