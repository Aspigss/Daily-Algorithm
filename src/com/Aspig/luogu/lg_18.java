package com.Aspig.luogu;

import java.util.Scanner;

public class lg_18 {

	public static void main(String[] args) {
		int n,m;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m= scanner.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		int ans = 0;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				//找到一个1 把他作为正方形左上角拓张
				if(a[i][j]==1)
				{
			int bian = 1;
			boolean canEx = true;
			while(canEx&&i+bian<n&&j+bian<m)
			{
				//拓展行
				for (int k = j; k <=j+bian; k++) {
					if(a[i+bian][k]==0)
					{
						canEx=false;
						break;
					}
				}
				if(canEx)
				{
					//拓展列
					for (int k = i; k <=i+bian; k++) {
						if(a[k][j+bian] ==0)
						{
							canEx=false;
							break;
						}
					}
				}
				if(canEx)
				{
					bian++;
				}
			}
			ans = Math.max(ans, bian);
				}
				
			}
			
		
		}
		System.out.println(ans);
	}
}
