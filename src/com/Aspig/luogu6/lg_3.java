package com.Aspig.luogu6;

import java.util.Scanner;

public class lg_3 {
	static int[] parent;
	static int find(int x)
	{
		if(parent[x]!=x)
		{
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}
	static void  uniom(int x,int y)
	{
		int fx = find(x);//查找x的是归属于谁
		int fy = find(y);
		if(find(x)==find(y))//目标相同
			return;
		else {
		     parent[fy] =fx;//直接合并大大哥代表元
		}
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
     parent = new int[n+1];
	for (int i = 1; i <= n; i++) {
       		parent[i] =i;//每个归属于的目标设为自己
	}
    int m = scanner.nextInt();
    for (int i = 0; i <m; i++) {
		String c = scanner.next();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(c.equals("M"))
		{
			uniom(a, b);
		}
		else {//如果是查询
			if(find(a)==find(b))
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}
}
